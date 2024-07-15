package io.github.duckysmacky.itemasylum.listeners;

import io.github.duckysmacky.itemasylum.game.GameController;
import io.github.duckysmacky.itemasylum.game.GameStatus;
import io.github.duckysmacky.itemasylum.items.ItemController;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnListener implements Listener {
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        if (GameController.GAME_STATUS != GameStatus.IN_PROGRESS) return;

        Player player = event.getPlayer();
        ItemController.giveItems(player);
    }
}
