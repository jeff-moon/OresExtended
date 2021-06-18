package com.oresextended.ores;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;

/**
 * Igneous
 */
public class CobaltOre extends Ore {

    public CobaltOre() {
        /*
         * BLOCK CONFIGURATION
         */
        //TODO move to a global configuration
        float BLOCK_STRENGTH = 4.0f;
        String NAMESPACE = "oresextended";
        String ID = "cobalt_ore";


        this._ore = new Block(FabricBlockSettings.of(Material.METAL).strength(BLOCK_STRENGTH));
        this._identifier = new Identifier(NAMESPACE, ID);
    }

    @Override()
    public Block getBlock() {
        return this._ore;
    }

    @Override()
    public Identifier getIdentifier() {
        return this._identifier;
    }
}