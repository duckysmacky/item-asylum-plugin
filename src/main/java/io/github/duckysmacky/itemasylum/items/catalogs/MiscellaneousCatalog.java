package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.Rarity;
import org.bukkit.inventory.ItemStack;

public final class MiscellaneousCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Shield", "SHIELD", Rarity.COMMON),

        new CatalogItem("Water Bucket", "WATER_BUCKET", Rarity.COMMON),

        new CatalogItem("Ender Pearl", "ENDER_PEARL", 8, Rarity.COMMON),

        new CatalogItem("Defensive Wand", "AGEOFWEAPONS_WAND_BASIC", Rarity.COMMON),

        new CatalogItem("Antidote", "HBM_SYRINGE_ANTIDOTE", 16, Rarity.COMMON),

        new CatalogItem("Stimpak", "HBM_SYRINGE_METAL_STIMPAK", 16, Rarity.COMMON),

        new CatalogItem("Golden Apple", "GOLDEN_APPLE", 8, Rarity.COMMON),

        new CatalogItem("Riot Shield", "TECHGUNS_RIOT_SHIELD", Rarity.UNCOMMON),

        new CatalogItem("Super Stimpak", "HBM_SYRINGE_METAL_SUPER", 8, Rarity.UNCOMMON),

        new CatalogItem("Stealth Device", "HBM_STEALTH_BOY", Rarity.UNCOMMON),

        new CatalogItem("Flight Wand", "AGEOFWEAPONS_WAND_AETHER", Rarity.RARE),

        new CatalogItem("Healing Wand", "AGEOFWEAPONS_WAND_HOLY", Rarity.RARE),

        new CatalogItem("Psycho", "HBM_SYRINGE_METAL_PSYCHO", 3, Rarity.RARE),

        new CatalogItem("Medical Bag", "HBM_MED_BAG", 5, Rarity.RARE),

        new CatalogItem("Totem of Undying", "TOTEM", Rarity.EPIC),

        new CatalogItem("MED-X", "HBM_SYRINGE_METAL_MEDX", 3, Rarity.EPIC),

        new CatalogItem("Offensive Warhorn", "AGEOFWEAPONS_WARHORN_OFFENSIVE", Rarity.EPIC),

        new CatalogItem("Defensive Warhorn", "AGEOFWEAPONS_WARHORN_DEFENSIVE", Rarity.EPIC),

        new CatalogItem("Staff of Protection", "TWILIGHTFOREST_SHIELD_SCEPTER", Rarity.EPIC),

        new CatalogItem("Elytra", "ELYTRA", Rarity.EPIC),

        new CatalogItem("AWESOME", "HBM_SYRINGE_AWESOME", Rarity.LEGENDARY),

        new CatalogItem("Rod of Discord", "HBM_ROD_OF_DISCORD", Rarity.MYTHIC),

        new CatalogItem("Pufferfish on a Stick", "AGEOFWEAPONS_PUFFERFISH_STICK", Rarity.SECRET, "ngl guys this is too op"),
    };

    @Override
    public CatalogItem getRandomItem() {
        return ItemCatalog.getRandomItemFromList(ITEMS);
    }

    @Override
    public int getSlot() {
        return 2;
    }

    @Override
    public int getExtraSlot() {
        return 29;
    }
}
