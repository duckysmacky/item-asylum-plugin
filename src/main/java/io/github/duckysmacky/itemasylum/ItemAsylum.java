package io.github.duckysmacky.itemasylum;

import io.github.duckysmacky.itemasylum.commands.CatalogCommand;
import io.github.duckysmacky.itemasylum.commands.GameCommand;
import io.github.duckysmacky.itemasylum.commands.ItemAsylumCommand;
import io.github.duckysmacky.itemasylum.commands.RerollCommand;
import io.github.duckysmacky.itemasylum.game.GameController;
import io.github.duckysmacky.itemasylum.game.GameMode;
import io.github.duckysmacky.itemasylum.game.GameStatus;
import io.github.duckysmacky.itemasylum.listeners.RespawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemAsylum extends JavaPlugin {
    public static final GameController GAME_CONTROLLER = new GameController();

    @Override
    public void onEnable() {
        System.out.println("Item Asylum Plugin is starting up...");

        getServer().getPluginManager().registerEvents(new RespawnListener(), this);
        GAME_CONTROLLER.setupGame();

        getCommand("itemasylum").setExecutor(new ItemAsylumCommand());
        getCommand("reroll").setExecutor(new RerollCommand());
        getCommand("game").setExecutor(new GameCommand());
        getCommand("catalog").setExecutor(new CatalogCommand());
    }
}