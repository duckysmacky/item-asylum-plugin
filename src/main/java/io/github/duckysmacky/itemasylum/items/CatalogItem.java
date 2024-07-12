package io.github.duckysmacky.itemasylum.items;

public class CatalogItem {
    // base
    private final String itemName;
    private final String itemId;
    private final Rarity itemRarity;
    private int itemQuantity = 1;

    // enchantments
    private ItemEnchantment[] itemEnchantments = null;

    // durability
    private boolean isUnbreakable = true;
    private short itemDurability = 0;

    // extra
    private String extraItemId = null;
    private int extraItemQuantity = 0;

    // base
    public CatalogItem(String itemName, String itemId, Rarity itemRarity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
    }

    // base + quantity
    public CatalogItem(String itemName, String itemId, int itemQuantity, Rarity itemRarity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemRarity = itemRarity;
    }

    // base + enchantments
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
    }

    // base + durability
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, short itemDurability) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
    }

    // base + durability + enchantments
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments, short itemDurability) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
    }

    // base + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantments + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + durability + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, short itemDurability, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantments + durability + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments, short itemDurability, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
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

    public Rarity getItemRarity() {
        return itemRarity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public ItemEnchantment[] getItemEnchantments() {
        return itemEnchantments;
    }

    public boolean isUnbreakable() {
        return isUnbreakable;
    }

    public short getItemDurability() {
        return itemDurability;
    }

    public String getExtraItemId() {
        return extraItemId;
    }

    public int getExtraItemQuantity() {
        return extraItemQuantity;
    }
}
