package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.enchantments.Enchantment;

public final class RangedCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Bow", "BOW", Rarity.COMMON, "ARROW", 32),
        new CatalogItem("Fire Bow", "BOW", Rarity.UNCOMMON,
            new ItemEnchantment(Enchantment.ARROW_FIRE, 1), "ARROW", 32),
        new CatalogItem("Yeet Bow", "BOW", Rarity.RARE,
            new ItemEnchantment(Enchantment.ARROW_KNOCKBACK, 20), "ARROW", 3),
        new CatalogItem("The Better Bow", "BOW", Rarity.RARE,
            new ItemEnchantment[]{
                new ItemEnchantment(Enchantment.ARROW_DAMAGE, 15),
                new ItemEnchantment(Enchantment.ARROW_INFINITE, 1)
            },
        "ARROW", 1)
    };

    @Override
    public CatalogItem getRandomItem() {
        return ItemCatalog.getRandomItemFromList(ITEMS);
    }

    @Override
    public int getSlot() {
        return 1;
    }

    @Override
    public int getExtraSlot() {
        return 28;
    }
}
