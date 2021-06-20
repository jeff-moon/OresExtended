package com.oresextended;

import com.oresextended.registry.BlockRegistry;
import com.oresextended.registry.ItemRegistry;
import com.oresextended.registry.WorldRegistry;
import net.fabricmc.api.ModInitializer;

public class OresExtended implements ModInitializer {

    private final String NAMESPACE = "oresextended";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        System.out.println("Initializing OresExtended");

        System.out.println("Initializing Blocks");
        BlockRegistry.Register();

        System.out.println("Initializing Items");
        ItemRegistry.Register();

        System.out.println("Registering Ore Blocks");
        WorldRegistry.Register();
    }

}
