package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.items.ItemController;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RerollCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player;

        if (args.length == 0) player = (Player) sender;
        else player = Bukkit.getServer().getPlayer(args[0]);

        ItemController.giveItems(player);
        player.sendMessage(String.format(
            "%s%sITEMS REROLLED",
            ChatColor.GREEN, ChatColor.BOLD
        ));

        return true;
    }
}
