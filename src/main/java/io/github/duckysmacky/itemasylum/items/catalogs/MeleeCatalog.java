package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.enchantments.Enchantment;

public final class MeleeCatalog implements ItemCatalog {
    private final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Shield", "SHIELD", Rarity.COMMON),

        new CatalogItem("Fire Wand", "AGEOFWEAPONS_WAND_NETHER", Rarity.COMMON),

        new CatalogItem("Iron Axe", "IRON_AXE", Rarity.COMMON),

        new CatalogItem("Diamond Sword", "DIAMOND_SWORD", Rarity.COMMON),

        new CatalogItem("Diamond Sickle", "EXTRAUTILS2_SICKLE_DIAMOND", Rarity.COMMON),

        new CatalogItem("Diamond Dagger", "AGEOFWEAPONS_DAGGER_DIAMOND", Rarity.COMMON),

        new CatalogItem("Fire Axe", "EXTRAUTILS2_FIREAXE", Rarity.COMMON, "Doesn't actually set enemies on fire"),

        new CatalogItem("Spear", "MOWZIESMOBS_SPEAR", Rarity.UNCOMMON),

//        new CatalogItem("Riot Shield", "TECHGUNS_RIOT_SHIELD", Rarity.UNCOMMON), NOTE: MOD REMOVED

        new CatalogItem("Market Gardener", "HBM_MEMESPOON", Rarity.UNCOMMON),

        new CatalogItem("Claymore", "AGEOFWEAPONS_LONG_CLAYMORE_DIAMOND", Rarity.UNCOMMON, "watch the flank"),

        new CatalogItem("Power Stick", "STICK", Rarity.UNCOMMON,
            new ItemEnchantment(Enchantment.KNOCKBACK, 10)),

        new CatalogItem("Stop Sign", "HBM_STOPSIGN", Rarity.UNCOMMON),

        new CatalogItem("Kikoku", "EXTRAUTILS2_LAWSWORD", Rarity.UNCOMMON),

        new CatalogItem("Pipe Wrench", "HBM_WRENCH", Rarity.UNCOMMON),

        new CatalogItem("Fire Sword", "TWILIGHTFOREST_FIERY_SWORD", Rarity.UNCOMMON),

        new CatalogItem("Ice Sword", "TWILIGHTFOREST_ICE_SWORD", Rarity.UNCOMMON),

        new CatalogItem("Stunstick", "HBM_ELEC_SWORD", Rarity.UNCOMMON),

        new CatalogItem("Balefire and Steel", "HBM_BALEFIRE_AND_STEEL", Rarity.UNCOMMON),

        new CatalogItem("Chainsaw", "HBM_CHAINSAW", Rarity.RARE),

        new CatalogItem("Blade on a Wrench", "HBM_WRENCH_FLIPPED", Rarity.RARE),

        new CatalogItem("Spy Dagger", "AGEOFWEAPONS_DAGGER_IRON", Rarity.RARE, "the spy from tf2",
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 10)),

        new CatalogItem("Ice Crystal", "MOWZIESMOBS_ICE_CRYSTAL", Rarity.RARE),

        new CatalogItem("Axe of a Thousand Metals", "MOWZIESMOBS_WROUGHT_AXE", Rarity.RARE),

        new CatalogItem("The Banisher", "AGEOFWEAPONS_FANTASY_SWORD_IRON", Rarity.RARE,
            new ItemEnchantment[]{
                new ItemEnchantment(Enchantment.DAMAGE_ALL, 7),
                new ItemEnchantment(Enchantment.FIRE_ASPECT, 2),
            }),

        new CatalogItem("Double Battle Axes", "AGEOFWEAPONS_BATTLE_AXE_IRON", 2, Rarity.RARE,
            "Put the other one in the other hand and be cool asf"),

        new CatalogItem("Flyswatter", "ICEANDFIRE_AMPHITHERE_MACUAHUITL", Rarity.RARE),

        new CatalogItem("Lightsaber", "FM_LASER_SWORD", Rarity.RARE,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 10)),

        new CatalogItem("Vampiric Blade", "AETHER_LEGACY_VAMPIRE_BLADE", Rarity.EPIC),

        new CatalogItem("Big Hammer", "AGEOFWEAPONS_WAR_HAMMER_DIAMOND", Rarity.EPIC,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 5)),

        new CatalogItem("Evoker Fang", "CYCLICMAGIC_EVOKER_FANG", Rarity.EPIC),

        new CatalogItem("Wand of Life Drain", "TWILIGHTFOREST_LIFEDRAIN_SCEPTER", Rarity.EPIC),

        new CatalogItem("Paradox Staff", "AGEOFWEAPONS_PARADOX_STAFF", Rarity.EPIC),

//        new CatalogItem("Endersoul Hand", "MUTANTBEASTS_ENDERSOUL_HAND", Rarity.EPIC), NOTE: MOD REMOVED

        new CatalogItem("Tide Trident", "ICEANDFIRE_TIDE_TRIDENT", Rarity.EPIC),

        new CatalogItem("Fire Dragonsteel Sword", "ICEANDFIRE_DRAGONSTEEL_FIRE_SWORD", Rarity.EPIC),

        new CatalogItem("Lightning Sword", "AETHER_LEGACY_LIGHTNING_SWORD", Rarity.EPIC),

        new CatalogItem("Hammer of Notch", "AETHER_LEGACY_NOTCH_HAMMER", Rarity.EPIC),

        new CatalogItem("Lightning Knife", "AETHER_LEGACY_LIGHTNING_KNIFE", Rarity.EPIC),

        new CatalogItem("Gravity Sword", "AETHER_LEGACY_GRAVITITE_SWORD", Rarity.EPIC),

        new CatalogItem("Soul Stealer", "FM_SOUL_STEALER", Rarity.EPIC),

        new CatalogItem("Cactus Sword", "STUPIDTHINGS_CACTUS_SWORD", Rarity.EPIC,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 3)),

        new CatalogItem("The Stabber", "ICEANDFIRE_STYMPHALIAN_BIRD_DAGGER", Rarity.EPIC, "Average day in London"),

        new CatalogItem("Pencil", "AETHER_LEGACY_VALKYRIE_LANCE", Rarity.LEGENDARY),

        new CatalogItem("BONK", "HBM_SHIMMER_SLEDGE", Rarity.LEGENDARY),

        new CatalogItem("The Licker", "ICEANDFIRE_DEATHWORM_GAUNTLET_RED", Rarity.LEGENDARY),

//        new CatalogItem("W A L L", "ICEANDFIRE_TROLL_WEAPON.COLUMN", Rarity.LEGENDARY), NOTE: BAD ITEM NAME

        new CatalogItem("Gravity Gun", "GRAVITYGUN_GRAVITYGUN", Rarity.LEGENDARY),

        new CatalogItem("عصا الانفجار", "HBM_ULLAPOOL_CABER", Rarity.LEGENDARY),

        new CatalogItem("Sans Bone", "AGEOFWEAPONS_CAVEMAN_KNIVE_BONE", Rarity.LEGENDARY,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 10)),

        new CatalogItem("1000 Degree Knife", "MEMEINABOTTLE_HOT_KNIFE", Rarity.LEGENDARY),

        new CatalogItem("Energy Blade", "FM_ENERGY_BLADE", Rarity.LEGENDARY),

        new CatalogItem("Death's Scythe", "FM_DEATH_SCYTHE", Rarity.LEGENDARY),

        new CatalogItem("Ultrahard Steel Sword", "HBM_HS_SWORD", Rarity.LEGENDARY, "SASAGEYO"),

        new CatalogItem("Yamato", "HBM_HF_SWORD", Rarity.LEGENDARY, "It's not but this is the closest thing we got, sorry :("),

//        new CatalogItem("CRUCIBLE", "HBM_CRUCIBLE", Rarity.MYTHIC), NOTE: DOESN'T WORK

        new CatalogItem("Zombie Wand", "TWILIGHTFOREST_ZOMBIE_SCEPTER", Rarity.MYTHIC),

        new CatalogItem("Nuh uh", "STICK", Rarity.MYTHIC,
            new ItemEnchantment(Enchantment.KNOCKBACK, 255)),

        new CatalogItem("The Ban Hammer", "HBM_MESE_GAVEL", Rarity.MYTHIC),

        new CatalogItem("Brick", "CLAY_BRICK", Rarity.SECRET, "bonk",
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 255)),

        new CatalogItem("Rubber Chicken", "STUPIDTHINGS_RUBBER_CHICKEN", Rarity.SECRET,
            new ItemEnchantment(Enchantment.DAMAGE_ALL, 20)),

        new CatalogItem("Your Mother", "IRON_HOE", Rarity.SECRET,
            "I actually named it \"Shwaz's Girlfriend\" at first, but that would be kinda wrong",
            new ItemEnchantment(Enchantment.KNOCKBACK, 10)),

        new CatalogItem("Shwaz Stick", "HBM_CBT_DEVICE", Rarity.SECRET),
    };

    @Override
    public int getSlot() {
        return 0;
    }

    @Override
    public int getExtraSlot() {
        return 27;
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
