package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.ItemAsylum;
import io.github.duckysmacky.itemasylum.game.GameMode;
import io.github.duckysmacky.itemasylum.items.item.CatalogItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface ItemCatalog {
    ItemCatalog[] LIST = new ItemCatalog[]{
        new MeleeCatalog(), new RangedCatalog(), new MiscellaneousCatalog()
    };

    // TODO - refactor to faster solution O(n^2) -> O(n)
    static CatalogItem getRandomItemFromList(CatalogItem[] itemList) {
        if (ItemAsylum.GAME_CONTROLLER.getGameMode() == GameMode.BALANCED) {
            List<CatalogItem> weightedList = new ArrayList<>();

            for (CatalogItem item : itemList) {
                int weight = item.getItemRarity().getWeight();
                for (int i = 0; i < weight; i++) weightedList.add(item);
            }

            int randomIndex = new Random().nextInt(weightedList.size());
            return weightedList.get(randomIndex);
        }

        int randomIndex = new Random().nextInt(itemList.length);
        return itemList[randomIndex];
    }

    int getSlot();
    int getExtraSlot();
    CatalogItem getRandomItem();
    CatalogItem[] getCatalog();
}
