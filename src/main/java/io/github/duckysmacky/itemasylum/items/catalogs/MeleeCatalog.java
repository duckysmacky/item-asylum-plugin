package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public final class MeleeCatalog implements ItemCatalog {
    private final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Iron Axe", "IRON_AXE", Rarity.COMMON),

        new CatalogItem("Iron Sword", "IRON_SWORD", Rarity.COMMON),

        new CatalogItem("Iron Sickle", "EXTRAUTILS2_SICKLE_IRON", Rarity.COMMON),

        new CatalogItem("Diamond Sword", "DIAMOND_SWORD", Rarity.COMMON),

        new CatalogItem("Diamond Axe", "DIAMOND_AXE", Rarity.COMMON),

        new CatalogItem("Diamond Sickle", "EXTRAUTILS2_SICKLE_DIAMOND", Rarity.COMMON),

        new CatalogItem("Diamond Dagger", "AGEOFWEAPONS_DAGGER_DIAMOND", Rarity.COMMON),

        new CatalogItem("Fire Axe", "EXTRAUTILS2_FIREAXE", Rarity.COMMON, "Doesn't actually set enemies on fire"),

        new CatalogItem("Market Gardener", "HBM_MEMESPOON", Rarity.UNCOMMON),

        new CatalogItem("Power Stick", "STICK", Rarity.UNCOMMON,
            new ItemEnchantment(Enchantment.KNOCKBACK, 20)),

        new CatalogItem("Stop Sign", "HBM_STOPSIGN", Rarity.UNCOMMON),

        new CatalogItem("Kikoku", "EXTRAUTILS2_LAWSWORD", Rarity.UNCOMMON),

        new CatalogItem("Pipe Wrench", "HBM_WRENCH", Rarity.UNCOMMON),

        new CatalogItem("Fire Sword", "TWILIGHTFOREST_FIERY_SWORD", Rarity.RARE),

        new CatalogItem("Ice Sword", "TWILIGHTFOREST_ICE_SWORD", Rarity.RARE),

        new CatalogItem("Stunstick", "HBM_ELEC_SWORD", Rarity.RARE),

        new CatalogItem("Chainsaw", "HBM_CHAINSAW", Rarity.RARE),

        new CatalogItem("Claymore", "AGEOFWEAPONS_LONG_CLAYMORE_DIAMOND", Rarity.COMMON),

        new CatalogItem("Blade on a Wrench", "HBM_WRENCH_FLIPPED", Rarity.RARE),

        new CatalogItem("The Banisher", "AGEOFWEAPONS_FANTASY_SWORD_IRON", Rarity.EPIC,
            new ItemEnchantment[]{
                new ItemEnchantment(Enchantment.DAMAGE_ALL, 5),
                new ItemEnchantment(Enchantment.FIRE_ASPECT, 2),
            }),

        new CatalogItem("HAMMAH", "AGEOFWEAPONS_WAR_HAMMER_DIAMOND", Rarity.EPIC,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 5)),

        new CatalogItem("Spy Dagger", "AGEOFWEAPONS_DAGGER_IRON", Rarity.RARE, "the spy from tf2",
                new ItemEnchantment(Enchantment.DAMAGE_ALL, 10)),

//        new CatalogItem("Yamato", "FLAMMPFEIL.SLASHBLADE:SLASHBLADE", Rarity.EPIC), FIXME

        new CatalogItem("Paradox Staff", "AGEOFWEAPONS_PARADOX_STAFF", Rarity.EPIC),

//        new CatalogItem("Endersoul Hand", "MUTANTBEASTS_ENDERSOUL_HAND", Rarity.EPIC), FIXME

        new CatalogItem("Double Battle Axes", "AGEOFWEAPONS_BATTLE_AXE_IRON", 2, Rarity.EPIC,
            "Put the other one in the other hand and be cool asf"),

        new CatalogItem("Gravity Gun", "GRAVITYGUN_GRAVITYGUN", Rarity.LEGENDARY),

        new CatalogItem("Sans Bone", "AGEOFWEAPONS_CAVEMAN_KNIVE_BONE", Rarity.LEGENDARY,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 10)),

        new CatalogItem("Cactus Sword", "STUPIDTHINGS_CACTUS_SWORD", Rarity.LEGENDARY,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 3)),

        new CatalogItem("1000 Degree Knife", "MEMEINABOTTLE_HOT_KNIFE", Rarity.LEGENDARY),

//        new CatalogItem("Power Hammer", "TECHGUNS_POWERHAMMER", Rarity.EPIC), FIXME

//        new CatalogItem("Mining Drill", "TECHGUNS_MININGDRILL", Rarity.LEGENDARY), FIXME

//        new CatalogItem("CRUCIBLE", "HBM_CRUCIBLE", Rarity.MYTHIC), FIXME

        new CatalogItem("Brick", "CLAY_BRICK", Rarity.SECRET, "bonk",
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 255)),

        new CatalogItem("Rubber Chicken", "STUPIDTHINGS_RUBBER_CHICKEN", Rarity.SECRET,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 20)),

        new CatalogItem("Your Mother", "IRON_HOE", Rarity.SECRET,
            "I actually named it \"Shwaz's Girlfriend\" at first, but that would be kinda wrong",
            new ItemEnchantment(Enchantment.KNOCKBACK, 10)),
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
