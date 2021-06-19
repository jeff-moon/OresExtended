package com.oresextended.init;

import com.oresextended.blocks.BlockCobaltOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InitBlocks {
    private static final BlockCobaltOre COBALT_ORE = new BlockCobaltOre( FabricBlockSettings.of(Material.METAL).hardness(4.0f) );
    private static final BlockItem COBALT_BLOCK_ITEM = new BlockItem(COBALT_ORE, new Item.Settings().group(ItemGroup.MISC));

    public static void Init() {
        Registry.register(Registry.BLOCK, new Identifier(Config.NAMESPACE, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(Config.NAMESPACE, "cobalt_ore"), COBALT_BLOCK_ITEM);
    }
}
