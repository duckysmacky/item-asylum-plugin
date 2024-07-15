package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.items.catalogs.ItemCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.MeleeCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.MiscellaneousCatalog;
import io.github.duckysmacky.itemasylum.items.catalogs.RangedCatalog;
import io.github.duckysmacky.itemasylum.items.item.CatalogItem;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class CatalogCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        if (args[0].equals("info"))
            return getCatalogInfo(player);

        return getItemCatalogInfo(player, args[0]);
    }

    private boolean getCatalogInfo(Player player) {
        HashMap<String, Integer> itemCount = new HashMap<>();
        for (ItemCatalog catalog : ItemCatalog.CATALOGS) {
            String catalogName = catalog.getClass().getName().toLowerCase().replace("catalog", "");
            itemCount.putIfAbsent("total", 0);
            itemCount.putIfAbsent(catalogName, 0);
            itemCount.replace("total", itemCount.get("total") + catalog.getCatalog().length);
            itemCount.put(catalogName, itemCount.get(catalogName) + catalog.getCatalog().length);
        }

        for (Map.Entry<String, Integer> count : itemCount.entrySet()) {
            player.sendMessage(String.format(
                "%s%s items: %s%s",
                ChatColor.AQUA, count.getKey(), ChatColor.BOLD, count.getValue()
            ));
        }

        return true;
    }

    private boolean getItemCatalogInfo(Player player, String catalogName) {
        ItemCatalog catalog;
        switch (catalogName.toLowerCase()) {
            case "melee": catalog = new MeleeCatalog(); break;
            case "ranged": catalog = new RangedCatalog(); break;
            case "misc": catalog = new MiscellaneousCatalog(); break;
            default: player.sendMessage(String.format(
                "%sCatalog \"%s\" not found!\n%sAll catalogs: MELEE, RANGED, MISC",
                ChatColor.RED, catalogName, ChatColor.WHITE
            ));
            return true;
        }

        CatalogItem[] itemList = catalog.getCatalog();

        for (int i = 0; i < itemList.length; i++) {
            player.sendMessage(String.format(
                "%s -%s %s",
                i + 1, ChatColor.RESET, itemList[i].getDisplayName()
            ));
        }

        player.sendMessage(String.format(
            "%sTotal %s items: %s%s",
            ChatColor.AQUA, catalogName.toLowerCase(), ChatColor.BOLD, itemList.length
        ));

        return true;
    }
}
