package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.ItemAsylum;
import io.github.duckysmacky.itemasylum.game.GameState;
import io.github.duckysmacky.itemasylum.items.ItemController;
import io.github.duckysmacky.itemasylum.util.ChatUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;

        switch (args[0]) {
            case "help": return printHelp(player);
            case "start": return setGameStatus(GameState.IN_PROGRESS);
            case "stop": return setGameStatus(GameState.IDLE);
            case "status": return printGameStatus(player);
            case "reroll": return rerollItems(player);
            default: return unknownCommand(player);
        }
    }

    private boolean printHelp(Player player) {
        player.sendMessage("Help information is work in progress. Deal with this ugly mess for now");
        player.sendMessage("/game start - start the game");
        player.sendMessage("/game stop - stop the game");
        player.sendMessage("/game status - get game status");
        player.sendMessage("/game reroll - reroll items");
        return true;
    }

    private boolean setGameStatus(GameState status) {
        ItemAsylum.GAME_STATUS = status;
        switch (status) {
            case IDLE: ChatUtils.announce("GAME STOPPED", ChatColor.RED); break;
            case IN_PROGRESS: ChatUtils.announce("GAME STARTED", ChatColor.GREEN); break;
        }
        return true;
    }

    private boolean printGameStatus(Player player) {
        player.sendMessage("Game is " + ItemAsylum.GAME_STATUS.toString());
        return true;
    }

    private boolean rerollItems(Player player) {
        ItemController.giveItems(player);
        return true;
    }

    private boolean unknownCommand(Player player) {
        player.sendMessage(String.format(
            "%s%sUnknown command. Type /game help for help",
            ChatColor.RED,
            ChatColor.BOLD
        ));
        return false;
    }
}
