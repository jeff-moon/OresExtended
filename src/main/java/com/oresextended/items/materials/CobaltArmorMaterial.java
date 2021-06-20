package com.oresextended.items.materials;

import com.oresextended.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CobaltArmorMaterial implements ArmorMaterial {
    // How many hits it can take before breaking
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    //TODO figure out what this is
    private static final int[] PROTECTION_VALUES = new int[] { 3, 6, 8, 3};

    @Override
    public int getDurability(EquipmentSlot slot) {
       return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        // TODO what is this?
        return 1;
    }

    @Override
    public SoundEvent getEquipSound() {
        //TODO custom sound
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.COBALT_INGOT);
    }

    @Override
    public String getName() {
        return "cobalt";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
