package com.oresextended;

import com.oresextended.init.InitBlocks;
import com.oresextended.init.InitItems;
import com.oresextended.items.tools.CobaltAxeItem;
import com.oresextended.items.materials.CobaltToolMaterial;
import net.fabricmc.api.ModInitializer;

import com.oresextended.blocks.BlockCobaltOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OresExtended implements ModInitializer {

    private final String NAMESPACE = "oresextended";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        System.out.println("Initializing OresExtended");

        System.out.println("Initializing Blocks");
        InitBlocks.Init();

        System.out.println("Initializing Items");
        InitItems.Init();
    }

}
