package io.github.duckysmacky.itemasylum.items;

import org.bukkit.enchantments.Enchantment;

public class ItemEnchantment {
    private final Enchantment enchantment;
    private final int modifier;

    public ItemEnchantment(Enchantment enchantment, int modifier) {
        this.enchantment = enchantment;
        this.modifier = modifier;
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public int getModifier() {
        return modifier;
    }
}
