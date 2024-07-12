package io.github.duckysmacky.itemasylum.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemController {
    public static final int MELEE_SLOT = 0;
    public static final int RANGED_SLOT = 1;
    public static final int MISCELLANEOUS_SLOT = 2;
    public static final int MELEE_EXTRA_SLOT = 27;
    public static final int RANGED_EXTRA_SLOT = 28;
    public static final int MISCELLANEOUS_EXTRA_SLOT = 29;

    // TODO - refactor
    public static void giveItems(Player player) {
        PlayerInventory inv = player.getInventory();
        inv.clear();

        CatalogItem meleeItem = ItemCatalog.getRandomItem(ItemCatalog.MELEE_ITEMS);
        CatalogItem rangedItem = ItemCatalog.getRandomItem(ItemCatalog.RANGED_ITEMS);
        CatalogItem miscellaneousItem = ItemCatalog.getRandomItem(ItemCatalog.MISCELLANEOUS_ITEMS);

        inv.setItem(MELEE_SLOT, getItem(meleeItem));
        if (meleeItem.getExtraItemId() != null) inv.setItem(MELEE_EXTRA_SLOT, getExtraItem(meleeItem));

        inv.setItem(RANGED_SLOT, getItem(rangedItem));
        if (rangedItem.getExtraItemId() != null) inv.setItem(RANGED_EXTRA_SLOT, getExtraItem(rangedItem));

        inv.setItem(MISCELLANEOUS_SLOT, getItem(miscellaneousItem));
        if (miscellaneousItem.getExtraItemId() != null) inv.setItem(MISCELLANEOUS_EXTRA_SLOT, getExtraItem(miscellaneousItem));
    }

    private static ItemStack getItem(CatalogItem itemData) {
        ItemStack item = new ItemStack(Material.valueOf(itemData.getItemId()), itemData.getItemQuantity());
        ItemMeta itemMeta = item.getItemMeta();
        List<String> itemLore = new ArrayList<>();

        itemMeta.setDisplayName(itemData.getDisplayName());
        itemLore.add(itemData.getDisplayRarity());
        itemMeta.setLore(itemLore);
        item.setItemMeta(itemMeta);

        return item;
    }

    private static ItemStack getExtraItem(CatalogItem itemData) {
        return new ItemStack(
            Material.valueOf(itemData.getExtraItemId()),
            itemData.getExtraItemQuantity()
        );
    }
}
