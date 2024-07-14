package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;

import java.util.Random;

public interface ItemCatalog {
    // TODO - refactor to faster solution O(n^2) -> O(n)
    static CatalogItem getRandomItemFromList(CatalogItem[] itemList) {
        Random random = new Random();
//        List<CatalogItem> weightedList = new ArrayList<>();
//        for (CatalogItem item : itemList) {
//            int weight = item.getItemRarity().getWeight();
//            for (int i = 0; i < weight; i++) weightedList.add(item);
//        }

        int randomIndex = random.nextInt(itemList.length);
        return itemList[randomIndex];
    }

    int getSlot();
    int getExtraSlot();
    CatalogItem getRandomItem();
}
