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

    private boolean printGameStatus(Player player) {
        player.sendMessage("Current game status: " + ItemAsylum.GAME_CONTROLLER.getGameStatus().toString());
        return true;
    }

    @SuppressWarnings("SameReturnValue")
    private boolean showScoreGoal(Player player, String goalName) {
        if (goalName.equalsIgnoreCase("list")) {
            String gameGoals = ChatColor.WHITE + "All game goals: ";
            for (GameGoal goal : GameGoal.values()) gameGoals += goal.name() + ", ";
            player.sendMessage(gameGoals);
            return true;
        }

        for (GameGoal goal : GameGoal.values()) {
            if (!goalName.equalsIgnoreCase(goal.name())) continue;
            ItemAsylum.GAME_CONTROLLER.setGameGoal(goal);
            ChatUtils.announce("Game goal set to " + goal.name(), ChatColor.GREEN);
            return true;
        }

        String gameGoals = ChatColor.WHITE + "All game goals: ";
        for (GameGoal goal : GameGoal.values()) gameGoals += goal.name() + ", ";
        player.sendMessage(String.format("%sGame goal \"%s\" doesn't exist!", ChatColor.RED, goalName));
        player.sendMessage(gameGoals);
        return true;
    }

    @SuppressWarnings("SameReturnValue")
    private boolean setGameMode(Player player, String modeName) {
        if (modeName.equalsIgnoreCase("list")) {
            String gameModes = ChatColor.WHITE + "All game modes: ";
            for (GameMode mode : GameMode.values()) gameModes += mode.name() + ", ";
            player.sendMessage(gameModes);
            return true;
        }

        for (GameMode mode : GameMode.values()) {
            if (!modeName.equalsIgnoreCase(mode.name())) continue;
            ItemAsylum.GAME_CONTROLLER.setGameMode(mode);
            ChatUtils.announce("Game mode set to " + mode.name(), ChatColor.GREEN);
            return true;
        }

        String gameModes = ChatColor.WHITE + "All game modes: ";
        for (GameMode mode : GameMode.values()) gameModes += mode.name() + ", ";
        player.sendMessage(String.format("%sGame mode \"%s\" doesn't exist!", ChatColor.RED, modeName));
        player.sendMessage(gameModes);
        return true;
    }

    private boolean unknownCommand(Player player) {
        player.sendMessage(String.format(
            "%s%sUnknown command. Type /itemasylum for help",
            ChatColor.RED, ChatColor.BOLD
        ));
        return true;
    }
}
