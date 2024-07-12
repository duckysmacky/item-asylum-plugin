package io.github.duckysmacky.itemasylum.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ChatUtils {

    public static void announce(String message, ChatColor color) {
        Bukkit.broadcastMessage(String.format(
            "%s%s%s",
            color,
            ChatColor.BOLD,
            message
        ));
    }

}
