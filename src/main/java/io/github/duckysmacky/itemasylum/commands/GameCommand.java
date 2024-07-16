package io.github.duckysmacky.itemasylum.commands;

import io.github.duckysmacky.itemasylum.ItemAsylum;
import io.github.duckysmacky.itemasylum.game.GameGoal;
import io.github.duckysmacky.itemasylum.game.GameMode;
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
            case "start": ItemAsylum.GAME_CONTROLLER.startGame(); return true;
            case "stop": ItemAsylum.GAME_CONTROLLER.stopGame(); return true;
            case "setup": ItemAsylum.GAME_CONTROLLER.setupGame(); return true;
            case "goal": return showScoreGoal(player, args[1]);
            case "status": return printGameStatus(player);
            case "mode": return setGameMode(player, args[1]);
            default: return unknownCommand(player);
        }
    }

    private boolean showScoreGoal(Player player, String goalName) {
        switch (goalName.toLowerCase()) {
            case "kills": ItemAsylum.GAME_CONTROLLER.setGameGoal(GameGoal.KILLS); return true;
            case "deaths": ItemAsylum.GAME_CONTROLLER.setGameGoal(GameGoal.DEATHS); return true;
            default:
                player.sendMessage(String.format(
                    "%sGoal \"%s\" doesn't exist!\n%sAll goals: DEATHS, KILLS",
                    ChatColor.RED, goalName, ChatColor.WHITE
                ));
                return true;
        }
    }

    private boolean printGameStatus(Player player) {
        player.sendMessage("Current game status: " + ItemAsylum.GAME_CONTROLLER.getGameStatus().toString());
        return true;
    }

    @SuppressWarnings("SameReturnValue")
    private boolean setGameMode(Player player, String mode) {
        switch (mode.toLowerCase()) {
            case "classic":
                ItemAsylum.GAME_CONTROLLER.setGameMode(GameMode.CLASSIC);
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "random":
                ItemAsylum.GAME_CONTROLLER.setGameMode(GameMode.RANDOM);
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "knockout":
                ItemAsylum.GAME_CONTROLLER.setGameMode(GameMode.KNOCKOUT);
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "teams":
                ItemAsylum.GAME_CONTROLLER.setGameMode(GameMode.TEAMS);
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            case "kill_reroll":
                ItemAsylum.GAME_CONTROLLER.setGameMode(GameMode.KILL_REROLL);
                ChatUtils.announce("Gamemode set to " + mode, ChatColor.GREEN);
                return true;
            default:
                player.sendMessage(String.format(
                    "%sGamemode \"%s\" doesn't exist!\n%sAll gamemodes: CLASSIC, RANDOM, KNOCKOUT, TEAMS, KILL_REROLL",
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
