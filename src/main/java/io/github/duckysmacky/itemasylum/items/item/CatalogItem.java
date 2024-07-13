package io.github.duckysmacky.itemasylum.items.item;

import org.bukkit.ChatColor;

public class CatalogItem {
    // base
    private final String itemName;
    private final String itemId;
    private final Rarity itemRarity;
    private int itemQuantity = 1;

    // description
    private String description = "";

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

    // base + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
    }

    // base + quantity
    public CatalogItem(String itemName, String itemId, int itemQuantity, Rarity itemRarity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemRarity = itemRarity;
    }

    // base + quantity + description
    public CatalogItem(String itemName, String itemId, int itemQuantity, Rarity itemRarity, String description) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.itemRarity = itemRarity;
        this.description = description;
    }

    // base + enchantment
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment itemEnchantment) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
    }

    // base + enchantments
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
    }

    // base + enchantments + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment itemEnchantment) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
    }

    // base + enchantments + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment[] itemEnchantments) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
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

    // base + durability + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, short itemDurability, String description) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.description = description;
    }

    // base + durability + enchantment + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment itemEnchantment, short itemDurability, String description) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.description = description;
    }

    // base + durability + enchantment + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment[] itemEnchantments, short itemDurability, String description) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = itemEnchantments;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.description = description;
    }

    // base + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantment + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment itemEnchantment, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
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

    // base + enchantment + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment itemEnchantment, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantments + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment[] itemEnchantments, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
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

    // base + durability + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, short itemDurability, String description, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.description = description;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantment + durability + extra
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, ItemEnchantment itemEnchantment, short itemDurability, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
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

    // base + enchantment + durability + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment itemEnchantment, short itemDurability, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
        this.itemEnchantments = new ItemEnchantment[]{itemEnchantment};
        this.isUnbreakable = false;
        this.itemDurability = itemDurability;
        this.extraItemId = extraItemId;
        this.extraItemQuantity = extraItemQuantity;
    }

    // base + enchantments + durability + extra + description
    public CatalogItem(String itemName, String itemId, Rarity itemRarity, String description, ItemEnchantment[] itemEnchantments, short itemDurability, String extraItemId, int extraItemQuantity) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemRarity = itemRarity;
        this.description = description;
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

    public String getDisplayDescription() {
        return ChatColor.translateAlternateColorCodes('&', description);
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
