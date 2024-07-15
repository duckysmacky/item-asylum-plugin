package io.github.duckysmacky.itemasylum.items.item;

import org.bukkit.ChatColor;

// TODO - weight system

public enum Rarity {
    COMMON(ChatColor.WHITE, 1),
    UNCOMMON(ChatColor.GREEN, 1),
    RARE(ChatColor.BLUE, 1),
    EPIC(ChatColor.DARK_PURPLE, 1),
    LEGENDARY(ChatColor.GOLD, 1),
    MYTHIC(ChatColor.DARK_RED, 0.5),
    SECRET(ChatColor.BLACK, 0.25);

    private final String accentColor;
    private final int weight;

    Rarity(ChatColor rarityColor, double weightModifier) {
        this.accentColor = rarityColor + "" + ChatColor.BOLD;
        this.weight = (int) (4 * weightModifier);
    }

    public String getAccentColor() {
        return accentColor;
    }

    public int getWeight() {
        return weight;
    }
}
