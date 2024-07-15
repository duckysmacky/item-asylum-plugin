package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.enchantments.Enchantment;

public final class RangedCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Slingshot", "CYCLICMAGIC_SLINGSHOT_WEAPON", Rarity.COMMON,
            "CYCLICMAGIC_STONE_PEBBLE", 64),

        new CatalogItem("Bow", "BOW", Rarity.COMMON,
            "ARROW", 64),

        new CatalogItem("Iron Bow", "MOREBOWS_IRON_BOW", Rarity.COMMON,
            "ARROW", 64),

        new CatalogItem("Boomerang", "CYCLICMAGIC_BOOMERANG", Rarity.COMMON),

        new CatalogItem("Egg", "EGG", 64, Rarity.COMMON, "egg"),

        new CatalogItem("Fire Wand", "AGEOFWEAPONS_WAND_NETHER", Rarity.COMMON),

        new CatalogItem("Fishing Rod", "FISHING_ROD", Rarity.COMMON),

        new CatalogItem("Dynamite", "CYCLICMAGIC_ENDER_TNT_3", 5, Rarity.UNCOMMON),

        new CatalogItem("Fast Bow", "MOREBOWS_DIAMOND_BOW", Rarity.UNCOMMON,
            "ARROW", 32),

        new CatalogItem("Shadow Bow", "MOREBOWS_ENDER_BOW", Rarity.UNCOMMON,
            "ARROW", 32),

        new CatalogItem("Fire Bow", "MOREBOWS_FLAME_BOW", Rarity.UNCOMMON,
            "ARROW", 32),

        new CatalogItem("Double Bow", "MOREBOWS_MULTI_BOW", Rarity.UNCOMMON,
            "ARROW", 32),

        new CatalogItem("Yeeter 3000", "BOW", Rarity.RARE,
            new ItemEnchantment(Enchantment.ARROW_KNOCKBACK, 20),
            "ARROW", 32),

        new CatalogItem("Golden Bow", "MOREBOWS_GOLD_BOW", Rarity.RARE,
            "ARROW", 32),

        new CatalogItem("Ender Bow", "TWILIGHTFOREST_ENDER_BOW", Rarity.RARE,
            "ARROW", 32),

        new CatalogItem("Seeker Bow", "TWILIGHTFOREST_SEEKER_BOW", Rarity.RARE,
            "ARROW", 32),

        new CatalogItem("Triple Bow", "TWILIGHTFOREST_TRIPLE_BOW", Rarity.RARE,
            "ARROW", 32),

        new CatalogItem("Flamethrower", "AGEOFWEAPONS_FLAME_THROWER", Rarity.RARE),

        new CatalogItem("Poisonthrower", "AGEOFWEAPONS_POISON_THROWER", Rarity.RARE),

        new CatalogItem("Bigger Dynamite", "CYCLICMAGIC_ENDER_TNT_6", 5, Rarity.RARE),

        new CatalogItem("Firing Can", "STUPIDTHINGS_FIRING_CAN", Rarity.EPIC, "its like watering, but opposite"),

        new CatalogItem("Frost Bow", "TWILIGHTFOREST_ICE_BOW", Rarity.EPIC,
            "ARROW", 16),

        new CatalogItem("Duskflame Hex", "CYCLICMAGIC_ENDER_BLAZE", Rarity.EPIC),

        new CatalogItem("Engraved Thunder", "CYCLICMAGIC_ENDER_LIGHTNING", Rarity.EPIC),

        new CatalogItem("Evoker Fang", "CYCLICMAGIC_EVOKER_FANG", Rarity.EPIC),

        new CatalogItem("Scepter of Twilight", "TWILIGHTFOREST_TWILIGHT_SCEPTER", Rarity.EPIC),

        new CatalogItem("Wand of Life Drain", "TWILIGHTFOREST_LIFEDRAIN_SCEPTER", Rarity.EPIC),

        new CatalogItem("Spirit Seeker", "CYCLICMAGIC_WANT_MISSILE", Rarity.EPIC),

        new CatalogItem("Zombie Wand", "TWILIGHTFOREST_ZOMBIE_SCEPTER", Rarity.LEGENDARY),

        new CatalogItem("Portal Gun", "PORTALGUN_ITEM_PORTALGUN", Rarity.LEGENDARY),

        new CatalogItem("World's Smaller Violin", "PORTALGUN_ITEM_PORTALGUN", Rarity.LEGENDARY)
    };

    @Override
    public int getSlot() {
        return 1;
    }

    @Override
    public int getExtraSlot() {
        return 28;
    }

    @Override
    public CatalogItem getRandomItem() {
        return ItemCatalog.getRandomItemFromList(ITEMS);
    }

    @Override
    public CatalogItem[] getCatalog() {
        return ITEMS;
    }
}
