package io.github.duckysmacky.itemasylum;

import io.github.duckysmacky.itemasylum.game.GameState;
import io.github.duckysmacky.itemasylum.listeners.RespawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemAsylum extends JavaPlugin {
    public static GameState GAME_STATUS;

    @Override
    public void onEnable() {
        System.out.println("Item Asylum Plugin is starting up...");

        GAME_STATUS = GameState.IN_PROGRESS;

        getServer().getPluginManager().registerEvents(new RespawnListener(), this);
    }
}