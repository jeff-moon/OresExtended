package com.oresextended.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;

/**
 * Igneous
 */
public class BlockCobaltOre extends Block {
    public BlockCobaltOre(Settings settings) {
        super(settings);
        /*
         * BLOCK CONFIGURATION
         */
        //TODO move to a global configuration
        float BLOCK_STRENGTH = 4.0f;
        String NAMESPACE = "oresextended";
        String ID = "cobalt_ore";
    }
}