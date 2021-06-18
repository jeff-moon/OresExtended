package com.oresextended.ores;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

/**
 * Ore
 */
public abstract class Ore {
    /**
     * The underlying block definition
     */
    protected Block _ore;

    /**
     * The underlying identifier
     */
    protected Identifier _identifier;

    /**
     * Getter for _ore
     * @return The underlying block
     */
    public abstract Block getBlock();

    /**
     * Getter for _identifier
     * @return The underlying identifier
     */
    public abstract Identifier getIdentifier();
}