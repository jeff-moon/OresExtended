package com.oresextended.tools.cobalt;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CobaltToolMaterial implements ToolMaterial {
    public static final CobaltToolMaterial INSTANCE = new CobaltToolMaterial();

    @Override()
    public int getDurability() {
       return 500;
    }

    @Override()
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override()
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override()
    public int getMiningLevel() {
        return 2;
    }

    @Override()
    public int getEnchantability() {
        return 15;
    }

    @Override()
    public Ingredient getRepairIngredient() {
        // TODO cobalt ingot
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
