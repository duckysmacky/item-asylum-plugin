package io.github.duckysmacky.itemasylum.items;

public class CatalogItem {
    private String itemName;
    private String itemId;
    private int itemQuantity;
    private Rarity itemRarity;
    private String extraItemId;
    private int extraItemQuantity;

    public CatalogItem(String itemName, String itemId, Rarity itemRarity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = 1;
        this.itemRarity = itemRarity;
        this.extraItemId = null;
        this.extraItemQuantity = 0;
    }

    public CatalogItem(String itemName, String itemId, int itemQuantity, Rarity itemRarity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemRarity = itemRarity;
        this.extraItemId = null;
        this.extraItemQuantity = 0;
    }

    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = 1;
        this.itemRarity = itemRarity;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String extraItemId) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = 1;
        this.itemRarity = itemRarity;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = 1;
    }

    public CatalogItem(String itemName, String itemId, int itemQuantity, Rarity itemRarity, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemRarity = itemRarity;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    public String getDisplayName() {
        return itemRarity.getAccentColor() + itemName;
    }

    public String getDisplayRarity() {
        return itemRarity.getAccentColor() + itemRarity.name();
    }

    public String getItemId() {
        return itemId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public Rarity getItemRarity() {
        return itemRarity;
    }

    public String getExtraItemId() {
        return extraItemId;
    }

    public int getExtraItemQuantity() {
        return extraItemQuantity;
    }
}
