package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.enchantments.Enchantment;

public final class RangedCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Slingshot", "CYCLICMAGIC_SLINGSHOT_WEAPON", Rarity.COMMON,
            "CYCLICMAGIC_STONE_PEBBLE", 16),

        new CatalogItem("Bow", "BOW", Rarity.COMMON,
            "ARROW", 16),

        new CatalogItem("Iron Bow", "MOREBOWS_IRON_BOW", Rarity.COMMON,
            "ARROW", 16),

        new CatalogItem("Boomerang", "CYCLICMAGIC_BOOMERANG", Rarity.COMMON),

        new CatalogItem("Fishing Rod", "FISHING_ROD", Rarity.COMMON),

        new CatalogItem("Dynamite", "CYCLICMAGIC_ENDER_TNT_3", 5, Rarity.COMMON),

        new CatalogItem("Grenade", "HBM_GRENADE_GENERIC", 5, Rarity.COMMON),

        new CatalogItem("Bigger Dynamite", "CYCLICMAGIC_ENDER_TNT_6", 5, Rarity.UNCOMMON),

        new CatalogItem("Enhanced Grenade", "HBM_GRENADE_STRONG", 5, Rarity.UNCOMMON),

        new CatalogItem("Cluster Grenade", "HBM_GRENADE_CLUSTER", 5, Rarity.UNCOMMON),

        new CatalogItem("Poison Grenade", "HBM_GRENADE_POISON", 5, Rarity.UNCOMMON),

        new CatalogItem("Fast Bow", "MOREBOWS_DIAMOND_BOW", Rarity.UNCOMMON,
            "ARROW", 16),

        new CatalogItem("Shadow Bow", "MOREBOWS_ENDER_BOW", Rarity.UNCOMMON,
            "ARROW", 16),

        new CatalogItem("Fire Bow", "MOREBOWS_FLAME_BOW", Rarity.UNCOMMON,
            "ARROW", 16),

        new CatalogItem("Double Bow", "MOREBOWS_MULTI_BOW", Rarity.UNCOMMON,
            "ARROW", 16),

        new CatalogItem("Golden Bow", "MOREBOWS_GOLD_BOW", Rarity.UNCOMMON,
            "ARROW", 16),

        new CatalogItem("Harpoon", "AGEOFWEAPONS_HARPOON", 3, Rarity.RARE),

        new CatalogItem("Blade Bundle", "ICEANDFIRE_STYMPHALIAN_FEATHER_BUNDLE", Rarity.RARE),

        new CatalogItem("Gas Grenade", "HBM_GRENADE_GAS", 3, Rarity.RARE),

        new CatalogItem("Yeeter 1000", "BOW", Rarity.RARE,
            new ItemEnchantment(Enchantment.ARROW_KNOCKBACK, 10),
            "ARROW", 16),

        new CatalogItem("Ender Bow", "TWILIGHTFOREST_ENDER_BOW", Rarity.RARE,
            "ARROW", 16),

        new CatalogItem("Seeker Bow", "TWILIGHTFOREST_SEEKER_BOW", Rarity.RARE,
            "ARROW", 16),

        new CatalogItem("Triple Bow", "TWILIGHTFOREST_TRIPLE_BOW", Rarity.RARE,
            "ARROW", 16),

        new CatalogItem("Cryolator", "HBM_GUN_CRYOLATOR", Rarity.RARE,
            "HBM_GUN_CRYOLATOR_AMMO", 32),

        new CatalogItem("Grenade Pistol", "HBM_GUN_HK69", Rarity.RARE,
            "HBM_AMMO_GRENADE_TOXIC", 8),

        new CatalogItem("Grenade Pistol", "HBM_GUN_HK69", Rarity.RARE,
            "HBM_AMMO_GRENADE", 8),

        new CatalogItem("RPG", "HBM_GUN_RPG", Rarity.RARE,
            "HBM_AMMO_ROCKET", 8),

        new CatalogItem("RPG", "HBM_GUN_RPG", Rarity.RARE,
            "HBM_AMMO_ROCKET_PHOSPHORUS", 1),

        new CatalogItem("RPG", "HBM_GUN_RPG", Rarity.RARE,
            "HBM_AMMO_ROCKET_SLEEK", 4),

        new CatalogItem("Flamethrower", "AGEOFWEAPONS_FLAME_THROWER", Rarity.RARE),

        new CatalogItem("Poisonthrower", "AGEOFWEAPONS_POISON_THROWER", Rarity.RARE),

        new CatalogItem("Firing Can", "STUPIDTHINGS_FIRING_CAN", Rarity.RARE, "its like watering, but opposite"),

        new CatalogItem("Frost Bow", "TWILIGHTFOREST_ICE_BOW", Rarity.RARE,
            "ARROW", 16),

        new CatalogItem("Dream Bolt-Action Rifle", "HBM_GUN_BOLT_ACTION", Rarity.RARE,
            "HBM_AMMO_20GAUGE_SLUG", 12),

        new CatalogItem("Digger Grenade", "HBM_GRENADE_BURST", 3, Rarity.RARE, "No sir I wanted to say DIGGER, not NIG-"),

        new CatalogItem("Scepter of Twilight", "TWILIGHTFOREST_TWILIGHT_SCEPTER", Rarity.RARE),

        new CatalogItem("Null Grenade", "HBM_GRENADE_IF_NULL", 8, Rarity.RARE),

        new CatalogItem("THE SUN", "HBM_GRENADE_FLARE", 16, Rarity.RARE),

        new CatalogItem("Imploder", "AGEOFWEAPONS_IMPLODER", 4, Rarity.RARE),

//        new CatalogItem("Fire Staff", "MYSTICSTAFFS_FIRE_STAFF", Rarity.RARE), NOTE: MOD DOESN'T WORK

//        new CatalogItem("Ice Ball Staff", "MYSTICSTAFFS_ICE_BALL_STAFF", Rarity.RARE), NOTE: MOD DOESN'T WORK

//        new CatalogItem("Sunstrike Staff", "MYSTICSTAFFS_SUNSTRIKE_STAFF", Rarity.EPIC), NOTE: MOD DOESN'T WORK

//        new CatalogItem("Solar Beam Staff", "MYSTICSTAFFS_SOLAR_BEAM_STAFF", Rarity.EPIC), NOTE: MOD DOESN'T WORK

        new CatalogItem("Spirit Seeker", "CYCLICMAGIC_WAND_MISSILE", Rarity.EPIC),

        new CatalogItem("Soul Sucker", "ICEANDFIRE_COCKATRICE_SCEPTER", Rarity.EPIC),

        new CatalogItem("Jar of Cloud", "HBM_GRENADE_CLOUD", Rarity.EPIC),

        new CatalogItem("Jar of Pink Cloud", "HBM_GRENADE_PINK_CLOUD", Rarity.EPIC),

        new CatalogItem("Duskflame Hex", "CYCLICMAGIC_ENDER_BLAZE", Rarity.EPIC),

        new CatalogItem("Engraved Thunder", "CYCLICMAGIC_ENDER_LIGHTNING", Rarity.EPIC),

        new CatalogItem("OpenQuadro Guided Man-Portable Missle Launcher", "HBM_GUN_QUADRO", Rarity.EPIC,
            "Soldier gameplay:",
            "HBM_AMMO_ROCKET_CANISTER", 32),

        new CatalogItem("Dart Gun", "HBM_GUN_DARTER", Rarity.EPIC,
            "HBM_AMMO_DART", 4),

        new CatalogItem("Jackhammer", "HBM_GUN_JACK", Rarity.EPIC,
            "HBM_GUN_JACK_AMMO", 3),

        new CatalogItem("EMP Gun", "HBM_GUN_EMP", Rarity.EPIC,
            "HBM_GUN_EMP_AMMO", 4),

        new CatalogItem("Lemon", "HBM_GRENADE_LEMON", 8, Rarity.LEGENDARY),

        new CatalogItem("Pocket Sand", "STUPIDTHINGS_POCKET_SAND", Rarity.LEGENDARY, "Shwaz's favourite weapon"),

//        new CatalogItem("Portal Gun", "PORTALGUN_ITEM_PORTALGUN", Rarity.LEGENDARY), NOTE: DOESN'T WORK

        new CatalogItem("Nuka Grenade", "HBM_GRENADE_NUCLEAR", Rarity.LEGENDARY),

        new CatalogItem("Euthanasia", "HBM_GUN_EUTHANASIA", Rarity.LEGENDARY,
            "HBM_GUN_EUTHANASIA_AMMO", 16),

        new CatalogItem("World's Smaller Violin", "STUPIDTHINGS_WORLDS_SMALLEST_VIOLIN", Rarity.LEGENDARY),

        new CatalogItem("XVL1456 Tau Cannon Prototype", "HBM_GUN_XVL1456", Rarity.LEGENDARY,
            "HBM_GUN_XVL1456_AMMO", 32),

        new CatalogItem("HP Lazerjet", "HBM_GUN_HP", Rarity.LEGENDARY,
            "HBM_GUN_HP_AMMO", 4),

        new CatalogItem("Occult Shotgun", "HBM_GUN_JSHOTGUN", Rarity.LEGENDARY,
            "HBM_AMMO_12GAUGE_DU", 2),

        new CatalogItem("Fat Man", "HBM_GUN_FATMAN", Rarity.LEGENDARY, "Named after Oranos",
            "HBM_AMMO_NUKE", 1),

        new CatalogItem("Vortex Grenade", "HBM_GRENADE_IF_HOPWIRE", Rarity.LEGENDARY),

        new CatalogItem("Player Deleter", "HBM_GUN_B93", Rarity.LEGENDARY),

        new CatalogItem("Earth Talisman", "MOWZIESMOBS_EARTH_TALISMAN", Rarity.LEGENDARY),

        new CatalogItem("Sun's Blessing", "MOWZIESMOBS_GRANT_SUNS_BLESSING", Rarity.LEGENDARY),


        new CatalogItem("Predator", "FM_PREDATOR", Rarity.LEGENDARY,
            "ARROW", 8),

        new CatalogItem("Yeeter 255000", "BOW", Rarity.MYTHIC,
            new ItemEnchantment(Enchantment.ARROW_KNOCKBACK, 255),
            "ARROW", 16),

        new CatalogItem("B.E.L.", "HBM_GUN_BF", Rarity.MYTHIC,
            "HBM_GUN_BF_AMMO", 1),

        new CatalogItem("Defabricator", "HBM_GUN_DEFABRICATOR", Rarity.MYTHIC,
            "HBM_GUN_DEFABRICATOR_AMMO", 8),

        new CatalogItem("Mosin-Nagant", "HBM_GUN_MOIST_NUGGET", Rarity.SECRET),

        new CatalogItem("Super Shotgun", "HBM_GUN_SUPER_SHOTGUN", Rarity.SECRET),

        new CatalogItem("Flipped Revolver", "HBM_GUN_REVOLVER_INVERTED", Rarity.SECRET, "How I feel after playing a game of siege"),

        new CatalogItem("Egg", "EGG", 64, Rarity.SECRET, "egg"),
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
