package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.enchantments.Enchantment;

public final class MeleeCatalog implements ItemCatalog {
    private final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Stone Sword", "STONE_SWORD", Rarity.COMMON),
        new CatalogItem("Gold Sword", "GOLD_SWORD", Rarity.UNCOMMON),
        new CatalogItem("Power Stick", "STICK", Rarity.UNCOMMON,
            new ItemEnchantment(Enchantment.KNOCKBACK, 20)),
        new CatalogItem("Diamond Sword", "DIAMOND_SWORD", Rarity.RARE)
    };

    @Override
    public CatalogItem getRandomItem() {
        return ItemCatalog.getRandomItemFromList(ITEMS);
    }

    @Override
    public int getSlot() {
        return 0;
    }

    @Override
    public int getExtraSlot() {
        return 27;
    }
}
