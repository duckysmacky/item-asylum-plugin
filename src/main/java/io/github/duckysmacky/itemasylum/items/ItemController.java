package io.github.duckysmacky.itemasylum.items;

import io.github.duckysmacky.itemasylum.ItemAsylum;
import io.github.duckysmacky.itemasylum.game.GameMode;
import io.github.duckysmacky.itemasylum.items.catalogs.ItemCatalog;
import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import io.github.duckysmacky.itemasylum.items.item.ItemEnchantment;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemController {

    public static void giveItems(Player player) {
        PlayerInventory inv = player.getInventory();

        inv.clear();
        inv.setItem(3, new ItemStack(Material.COOKED_BEEF, 64));

        if (ItemAsylum.GAME_CONTROLLER.getGameMode() == GameMode.RANDOM) {
            for (int i = 0; i < 3; i++) {
                int rnd = new Random().nextInt(ItemCatalog.LIST.length);
                ItemCatalog catalog = ItemCatalog.LIST[rnd];
                CatalogItem item = catalog.getRandomItem();
                inv.setItem(i, getItem(item));
                if (item.getExtraItemId() != null) inv.setItem(i + 27, getExtraItem(item));
            }
            return;
        }

        for (ItemCatalog catalog : ItemCatalog.LIST) {
            CatalogItem item = catalog.getRandomItem();
            inv.setItem(catalog.getSlot(), getItem(item));
            if (item.getExtraItemId() != null) inv.setItem(catalog.getExtraSlot(), getExtraItem(item));
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
