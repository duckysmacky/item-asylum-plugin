package io.github.duckysmacky.itemasylum.items;

import org.bukkit.ChatColor;

public enum Rarity {
    COMMON(ChatColor.WHITE, 1),
    UNCOMMON(ChatColor.GREEN, 0.90),
    RARE(ChatColor.BLUE, 0.80),
    EPIC(ChatColor.DARK_PURPLE, 0.70),
    LEGENDARY(ChatColor.GOLD, 0.50),
    MYTHIC(ChatColor.DARK_RED, 0.30),
    SECRET(ChatColor.BLACK, 0.10);

    private final String accentColor;
    private final int weight;

    Rarity(ChatColor rarityColor, double weightModifier) {
        this.accentColor = rarityColor + "" + ChatColor.BOLD;
        this.weight = (int) (10 * weightModifier);
    }

    public String getAccentColor() {
        return accentColor;
    }

    public int getWeight() {
        return weight;
    }
}
