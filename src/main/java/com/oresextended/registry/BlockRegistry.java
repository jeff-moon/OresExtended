package com.oresextended.registry;

import com.oresextended.OresExtendedConfig;
import com.oresextended.blocks.BlockCobaltOre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final BlockCobaltOre COBALT_ORE = new BlockCobaltOre( FabricBlockSettings.of(Material.METAL).hardness(4.0f) );
    public static final BlockItem COBALT_BLOCK_ITEM = new BlockItem(COBALT_ORE, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));

    public static void Register() {
        Registry.register(Registry.BLOCK, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_ore"), COBALT_BLOCK_ITEM);
    }
}
