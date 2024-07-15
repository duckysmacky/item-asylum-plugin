package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.items.ItemController;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RerollCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        ItemController.giveItems(player);
        player.sendMessage(String.format(
            "%s%sITEMS REROLLED",
            ChatColor.GREEN, ChatColor.BOLD
        ));
        return true;
    }
}
