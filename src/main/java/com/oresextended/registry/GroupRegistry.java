package com.oresextended.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class GroupRegistry {
   public static final ItemGroup ORES_EXTENDED_GROUP = FabricItemGroupBuilder.create(
           new Identifier("oresextended", "general"))
           .icon(() -> new ItemStack(ItemRegistry.COBALT_INGOT)).build();
}
