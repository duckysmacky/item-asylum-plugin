package io.github.duckysmacky.itemasylum.listeners;

import io.github.duckysmacky.itemasylum.ItemAsylum;
import io.github.duckysmacky.itemasylum.game.GameMode;
import io.github.duckysmacky.itemasylum.game.GameStatus;
import io.github.duckysmacky.itemasylum.items.ItemController;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (ItemAsylum.GAME_CONTROLLER.getGameStatus() != GameStatus.IN_PROGRESS) return;
        if (ItemAsylum.GAME_CONTROLLER.getGameMode() != GameMode.KILL_REROLL) return;

        Player killer = event.getEntity().getKiller();

        ItemController.giveItems(killer);
    }
}
