package com.oresextended.entry;

import net.fabricmc.api.ModInitializer;

import com.oresextended.ores.CobaltOre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class OresExtended implements ModInitializer {

	private CobaltOre _cobaltOre;


	@Override
	public void onInitialize() {
	    this._cobaltOre = new CobaltOre();

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        System.out.println("Initializing OresExtended");

		Registry.register(Registry.BLOCK, this._cobaltOre.getIdentifier(), this._cobaltOre.getBlock());
		Registry.register(
				Registry.ITEM,
				this._cobaltOre.getIdentifier(),
				new BlockItem(this._cobaltOre.getBlock(), new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
