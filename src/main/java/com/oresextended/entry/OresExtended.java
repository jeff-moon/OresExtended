package com.oresextended.entry;

import com.oresextended.tools.cobalt.CobaltAxeItem;
import com.oresextended.tools.cobalt.CobaltToolMaterial;
import net.fabricmc.api.ModInitializer;

import com.oresextended.ores.CobaltOre;
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

        System.out.println("Registering ores");
        this.registerOres();
        this.registerTools();
    }

    private void registerOres() {
        // Cobalt
        CobaltOre cobaltOre = new CobaltOre( FabricBlockSettings.of(Material.METAL).hardness(4.0f) );
        BlockItem cobaltBlockItem = new BlockItem(cobaltOre, new Item.Settings().group(ItemGroup.MISC));
        Registry.register(Registry.BLOCK, new Identifier(this.NAMESPACE, "cobalt_ore"), cobaltOre);
        Registry.register(Registry.ITEM, new Identifier(this.NAMESPACE, "cobalt_ore"), cobaltBlockItem);
    }

    private void registerTools() {
        // Cobalt
        ToolItem  cobaltAxe = new CobaltAxeItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
        Registry.register(Registry.ITEM, new Identifier(this.NAMESPACE, "cobalt_axe"), cobaltAxe);
    }

}
