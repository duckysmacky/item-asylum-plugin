package io.github.duckysmacky.itemasylum.game;

import io.github.duckysmacky.itemasylum.util.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class GameController {
    private final ConsoleCommandSender console;
    private GameStatus gameStatus;
    private GameMode gameMode;
    private GameGoal gameGoal;

    public GameController() {
        gameStatus = GameStatus.IDLE;
        gameMode = GameMode.CLASSIC;
        gameGoal = GameGoal.DEATHS;
        console = Bukkit.getServer().getConsoleSender();
    }

    public void startGame() {
        gameStatus = GameStatus.IN_PROGRESS;
        for (Player player : Bukkit.getServer().getOnlinePlayers()) Bukkit.dispatchCommand(console, "reroll " + player.getDisplayName());
        Bukkit.dispatchCommand(console, "scoreboard players set @a Deaths 0");
        Bukkit.dispatchCommand(console, "scoreboard players set @a Kills 0");
        ChatUtils.announce("GAME STARTED", ChatColor.GREEN);
    }

    public void stopGame() {
        gameStatus = GameStatus.IDLE;
        ChatUtils.announce("GAME STOPPED", ChatColor.RED);
    }

    public void setupGame() {
        Bukkit.dispatchCommand(console, "scoreboard objectives add Deaths deathCount");
        Bukkit.dispatchCommand(console, "scoreboard objectives add Kills playerKillCount");
        Bukkit.dispatchCommand(console, "scoreboard players set @a Deaths 0");
        Bukkit.dispatchCommand(console, "scoreboard players set @a Kills 0");
        Bukkit.dispatchCommand(console, "scoreboard objectives setdisplay sidebar " + formatEnum(gameGoal.toString()));
        Bukkit.dispatchCommand(console, "gamerule doDaylightCycle false");
        Bukkit.dispatchCommand(console, "gamerule doEntityDrops false");
        Bukkit.dispatchCommand(console, "gamerule doFallDamage false");
        Bukkit.dispatchCommand(console, "gamerule doTileDrops false");
        Bukkit.dispatchCommand(console, "gamerule keepInventory true");
        Bukkit.dispatchCommand(console, "gamerule naturalRegeneration true");
        ChatUtils.announce("GAME SETUP", ChatColor.GREEN);
    }

    private String formatEnum(String stringValue) {
        String formatted = stringValue.toLowerCase();
        return formatted.substring(0, 1).toUpperCase() + formatted.substring(1);
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public GameGoal getGameGoal() {
        return gameGoal;
    }

    public void setGameMode(GameMode mode) {
        gameMode = mode;
    }

    public void setGameGoal(GameGoal goal) {
        gameGoal = goal;
        Bukkit.dispatchCommand(console, "scoreboard objectives setdisplay sidebar " + formatEnum(goal.toString()));
    }
}
