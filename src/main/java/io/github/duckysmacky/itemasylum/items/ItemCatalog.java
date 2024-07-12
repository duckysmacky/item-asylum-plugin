package io.github.duckysmacky.itemasylum.items;

import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.Arrays;
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
        MELEE_ITEMS.add(new CatalogItem("Power Stick", "STICK", Rarity.UNCOMMON, new ItemEnchantment[]{
            new ItemEnchantment(Enchantment.KNOCKBACK, 20)
        }));
        MELEE_ITEMS.add(new CatalogItem("Diamond Sword", "DIAMOND_SWORD", Rarity.RARE));

        // RANGED ITEMS
        RANGED_ITEMS = new ArrayList<>();
        RANGED_ITEMS.add(new CatalogItem("Bow", "BOW", Rarity.COMMON, "ARROW", 32));
        RANGED_ITEMS.add(new CatalogItem("Fire Bow", "BOW", Rarity.UNCOMMON, new ItemEnchantment[]{
            new ItemEnchantment(Enchantment.ARROW_FIRE, 1)
        }, "ARROW", 32));
        RANGED_ITEMS.add(new CatalogItem("Yeet Bow", "BOW", Rarity.RARE, new ItemEnchantment[]{
            new ItemEnchantment(Enchantment.ARROW_KNOCKBACK, 20)
        }, "ARROW", 3));
        RANGED_ITEMS.add(new CatalogItem("The Better Bow", "BOW", Rarity.RARE, new ItemEnchantment[]{
            new ItemEnchantment(Enchantment.ARROW_DAMAGE, 15), new ItemEnchantment(Enchantment.ARROW_INFINITE, 1)
        }, "ARROW", 1));

        // MISCELLANEOUS ITEMS
        MISCELLANEOUS_ITEMS = new ArrayList<>();
        MISCELLANEOUS_ITEMS.add(new CatalogItem("Apple", "APPLE", 16, Rarity.COMMON));
        MISCELLANEOUS_ITEMS.add(new CatalogItem("Shield", "SHIELD", Rarity.COMMON));
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
