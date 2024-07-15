package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.game.GameController;
import io.github.duckysmacky.itemasylum.game.GameMode;
import io.github.duckysmacky.itemasylum.game.GameStatus;
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
            case "start": return setGameStatus(GameStatus.IN_PROGRESS);
            case "stop": return setGameStatus(GameStatus.IDLE);
            case "status": return printGameStatus(player);
            case "mode": return setGameMode(player, args[1]);
            default: return unknownCommand(player);
        }
    }

    private boolean setGameStatus(GameStatus status) {
        GameController.GAME_STATUS = status;
        switch (status) {
            case IDLE: ChatUtils.announce("GAME STOPPED", ChatColor.RED); break;
            case IN_PROGRESS: ChatUtils.announce("GAME STARTED", ChatColor.GREEN); break;
        }
        return true;
    }

    private boolean printGameStatus(Player player) {
        player.sendMessage("Current game status: " + GameController.GAME_STATUS.toString());
        return true;
    }

    @SuppressWarnings("SameReturnValue")
    private boolean setGameMode(Player player, String mode) {
        switch (mode.toLowerCase()) {
            case "classic":
                GameController.GAME_MODE = GameMode.CLASSIC;
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "random":
                GameController.GAME_MODE = GameMode.RANDOM;
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "knockout":
                GameController.GAME_MODE = GameMode.KNOCKOUT;
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "teams":
                GameController.GAME_MODE = GameMode.TEAMS;
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            default:
                player.sendMessage(String.format(
                    "%sGamemode \"%s\" doesn't exist!\n%sAll gamemodes: CLASSIC, RANDOM, KNOCKOUT, TEAMS",
                    ChatColor.RED, mode, ChatColor.WHITE
                ));
                return true;
        }
    }

    private boolean unknownCommand(Player player) {
        player.sendMessage(String.format(
            "%s%sUnknown command. Type /itemasylum for help",
            ChatColor.RED, ChatColor.BOLD
        ));
        return true;
    }
}
