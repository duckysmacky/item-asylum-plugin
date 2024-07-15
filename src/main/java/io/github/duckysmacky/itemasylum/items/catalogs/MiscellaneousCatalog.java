package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.Rarity;

public final class MiscellaneousCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Shield", "SHIELD", Rarity.COMMON),

        new CatalogItem("Fire Extinguisher", "CYCLICMAGIC_FIRE_KILLER", Rarity.COMMON),

        new CatalogItem("Waterfroster", "CYCLICMAGIC_WATER_FREEZER", Rarity.COMMON),

        new CatalogItem("Fire Charm", "CYCLICMAGIC_CHARM_FIRE", Rarity.COMMON),

        new CatalogItem("Antidote Charm", "CYCLICMAGIC_CHARM_ANTIDOTE", Rarity.COMMON),

        new CatalogItem("Water Bucket", "WATER_BUCKET", Rarity.COMMON),

        new CatalogItem("Ender Pearl", "ENDER_PEARL", 8, Rarity.COMMON),

        new CatalogItem("Defensive Wand", "AGEOFWEAPONS_WAND_BASIC", Rarity.COMMON),

        new CatalogItem("TNT", "TNT", Rarity.COMMON,
            "FLINT_AND_STEEL", 1),

        new CatalogItem("Antidote", "HBM_SYRINGE_ANTIDOTE", 16, Rarity.COMMON),

        new CatalogItem("Golden Apple", "GOLDEN_APPLE", 8, Rarity.UNCOMMON),

        new CatalogItem("Stimpak", "HBM_SYRINGE_METAL_STIMPAK", 16, Rarity.UNCOMMON),

        new CatalogItem("Riot Shield", "TECHGUNS_RIOT_SHIELD", Rarity.UNCOMMON),

        new CatalogItem("Speed Charm", "CYCLICMAGIC_CHARM_SPEED", Rarity.UNCOMMON),

        new CatalogItem("I am your friend now", "CYCLICMAGIC_TOOL_MOUNT", Rarity.UNCOMMON),

        new CatalogItem("Rod of Elevation", "CYCLICMAGIC_TOOL_ELEVATE", Rarity.UNCOMMON),

        new CatalogItem("Stealth Device", "HBM_STEALTH_BOY", 3, Rarity.RARE),

        new CatalogItem("Super Stimpak", "HBM_SYRINGE_METAL_SUPER", 8, Rarity.RARE),

        new CatalogItem("Flight Wand", "AGEOFWEAPONS_WAND_AETHER", Rarity.RARE),

        new CatalogItem("Healing Wand", "AGEOFWEAPONS_WAND_HOLY", Rarity.RARE),

        new CatalogItem("Psycho", "HBM_SYRINGE_METAL_PSYCHO", 3, Rarity.RARE),

        new CatalogItem("Medical Bag", "HBM_MED_BAG", 5, Rarity.RARE),

        new CatalogItem("Climbing Gloves", "CYCLICMAGIC_GLOVE_CLIMB", Rarity.RARE),

        new CatalogItem("Reverse TNT", "STUPIDTHINGS_REVERSE_TNT", Rarity.RARE,
            "FLINT_AND_STEEL", 1),

        new CatalogItem("Totem of Undying", "TOTEM", Rarity.EPIC),

        new CatalogItem("Player Launcher", "CYCLICMAGIC_TOOL_LAUNCHER", Rarity.EPIC),

        new CatalogItem("MED-X", "HBM_SYRINGE_METAL_MEDX", 3, Rarity.EPIC),

        new CatalogItem("Offensive Warhorn", "AGEOFWEAPONS_WARHORN_OFFENSIVE", Rarity.EPIC),

        new CatalogItem("Defensive Warhorn", "AGEOFWEAPONS_WARHORN_DEFENSIVE", Rarity.EPIC),

        new CatalogItem("Staff of Protection", "TWILIGHTFOREST_SHIELD_SCEPTER", Rarity.EPIC),

        new CatalogItem("Elytra", "ELYTRA", Rarity.EPIC),

        new CatalogItem("Propeller Hat", "STUPIDTHIGS_PROPELLER_HAT", Rarity.EPIC),

        new CatalogItem("Turtle", "STUPIDTHIGS_MINE_TURTLE", Rarity.EPIC, "step on it and find out"),

        new CatalogItem("AWESOME", "HBM_SYRINGE_AWESOME", Rarity.LEGENDARY),

        new CatalogItem("Carrypearl", "CYCLICMAGIC_ENDER_PEARL_MOUNTED", Rarity.LEGENDARY),

        new CatalogItem("You are my friend now", "CYCLICMAGIC_TOOL_MOUNT_INVERSE", Rarity.LEGENDARY),

        new CatalogItem("The Pusher", "CYCLICMAGIC_TOOL_PUSH", Rarity.LEGENDARY),

        new CatalogItem("Meme in a Bottle", "MEMEINABOTTLE_SPLASH_MEME_IN_A_BOTTLE", Rarity.LEGENDARY),

        new CatalogItem("Pet Rock", "STUPIDTHINGS_PET_ROCK", Rarity.LEGENDARY),

//        new CatalogItem("Flight Chorus", "CYCLICMAGIC_GLOWING_CHORUS", Rarity.MYTHIC),

        new CatalogItem("Noclip Chorus", "CYCLICMAGIC_CORRUPTED_CHORUS", Rarity.MYTHIC),

        new CatalogItem("Infinipearl", "CYCLICMAGIC_ENDER_PEARL_REUSE", Rarity.MYTHIC),

//        new CatalogItem("Rod of Discord", "HBM_ROD_OF_DISCORD", Rarity.MYTHIC),

        new CatalogItem("Pufferfish on a Stick", "AGEOFWEAPONS_PUFFERFISH_STICK", Rarity.SECRET, "ngl guys this is too op"),

        new CatalogItem("Fidget Spinner", "MEMEINABOTTLE_FIDGET", Rarity.SECRET, "idk man do what you want with it. it spins cool tho"),
    };

    @Override
    public int getSlot() {
        return 2;
    }

    @Override
    public int getExtraSlot() {
        return 29;
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
