package io.github.duckysmacky.itemasylum.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemCatalog {
    public static List<CatalogItem> MELEE_ITEMS;
    public static List<CatalogItem> RANGED_ITEMS;
    public static List<CatalogItem> MISCELLANEOUS_ITEMS;

    // Adding items to the catalog
    static {
        // MELEE ITEMS
        MELEE_ITEMS = new ArrayList<>();
        MELEE_ITEMS.add(new CatalogItem("Stone Sword", "STONE_SWORD", Rarity.COMMON));
        MELEE_ITEMS.add(new CatalogItem("Gold Sword", "GOLD_SWORD", Rarity.UNCOMMON));
        MELEE_ITEMS.add(new CatalogItem("Diamond Sword", "DIAMOND_SWORD", Rarity.EPIC));

        // RANGED ITEMS
        RANGED_ITEMS = new ArrayList<>();
        RANGED_ITEMS.add(new CatalogItem("Bow", "BOW", Rarity.UNCOMMON, "ARROW", 16));

        // MISCELLANEOUS ITEMS
        MISCELLANEOUS_ITEMS = new ArrayList<>();
        MISCELLANEOUS_ITEMS.add(new CatalogItem("Apple", "APPLE", 16, Rarity.LEGENDARY));
    }

    // TODO - refactor to faster solution O(n^2) -> O(n)
    public static CatalogItem getRandomItem(List<CatalogItem> itemList) {
        Random random = new Random();
        List<CatalogItem> weightedList = new ArrayList<>();
        for (CatalogItem item : itemList) {
            int weight = item.getItemRarity().getWeight();
            for (int i = 0; i < weight; i++) {
                weightedList.add(item);
            }
        }

        int randomIndex = random.nextInt(weightedList.size());
        return weightedList.get(randomIndex);
    }
}
