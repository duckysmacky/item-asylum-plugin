package io.github.duckysmacky.itemasylum.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ItemAsylumCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        return printHelp(player);
    }

    private boolean printHelp(Player player) {
        player.sendMessage("Help information is work in progress. Deal with this ugly mess for now");
        player.sendMessage("GAME");
        player.sendMessage("/game <start/stop> - start/stop the game");
        player.sendMessage("/game setup - setup game");
        player.sendMessage("/game mode <mode> - choose game mode");
        player.sendMessage("/game goal <goal> - choose game goal (kills/deaths)");
        player.sendMessage("/game status - get game status");
        player.sendMessage("REROLL");
        player.sendMessage("/reroll - reroll current items");
        player.sendMessage("CATALOG");
        player.sendMessage("/catalog info - general info about catalog");
        player.sendMessage("/catalog <melee/ranged/misc> - info about each of the categories");
        return true;
    }
}
