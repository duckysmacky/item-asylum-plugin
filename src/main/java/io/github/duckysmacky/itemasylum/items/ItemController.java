package io.github.duckysmacky.itemasylum.items;

import io.github.duckysmacky.itemasylum.items.catalogs.ItemCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.MeleeCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.MiscellaneousCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.RangedCatalog;
import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemController {
    public static void giveItems(Player player) {
        PlayerInventory inventory = player.getInventory();
        inventory.clear();

        inventory.setItem(3, new ItemStack(Material.COOKED_BEEF, 64));

        for (ItemCatalog catalog : ItemCatalog.CATALOGS) {
            CatalogItem item = catalog.getRandomItem();
            inventory.setItem(catalog.getSlot(), getItem(item));
            if (item.getExtraItemId() != null)
                inventory.setItem(catalog.getExtraSlot(), getExtraItem(item));
        }
    }

    private static ItemStack getItem(CatalogItem itemData) {
        ItemStack item = new ItemStack(Material.valueOf(itemData.getItemId()), itemData.getItemQuantity());
        ItemMeta itemMeta = item.getItemMeta();

        // lore
        List<String> itemLore = new ArrayList<>();
        if (!itemData.getDescription().isEmpty())
            itemLore.add(itemData.getDisplayDescription());

        itemLore.add(itemData.getDisplayRarity());

        // meta
        itemMeta.setDisplayName(itemData.getDisplayName());
        itemMeta.setUnbreakable(itemData.isUnbreakable());
        itemMeta.setLore(itemLore);
        if (itemData.getItemEnchantments() != null)
            for (ItemEnchantment enchantment : itemData.getItemEnchantments())
                itemMeta.addEnchant(enchantment.getEnchantment(), enchantment.getModifier(), true);

        // item
        item.setItemMeta(itemMeta);
        if (itemData.getItemDurability() != 0) item.setDurability(itemData.getItemDurability());

        return item;
    }

    private static ItemStack getExtraItem(CatalogItem itemData) {
        return new ItemStack(
            Material.valueOf(itemData.getExtraItemId()),
            itemData.getExtraItemQuantity()
        );
    }
}
