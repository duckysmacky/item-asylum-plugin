package io.github.duckysmacky.itemasylum.items.catalogs;

import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.Rarity;

public final class MiscellaneousCatalog implements ItemCatalog {
    public final CatalogItem[] ITEMS = new CatalogItem[]{
        new CatalogItem("Apple", "APPLE", 16, Rarity.COMMON),
        new CatalogItem("Shield", "SHIELD", Rarity.COMMON)
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
