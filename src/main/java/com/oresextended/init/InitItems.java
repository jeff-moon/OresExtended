package com.oresextended.init;

import com.oresextended.items.materials.CobaltToolMaterial;
import com.oresextended.items.tools.CobaltAxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class InitItems {

    /**
     * Cobalt Ingot
     */
    private static final Item COBALT_INGOT = new Item((new Item.Settings()).group(ItemGroup.MATERIALS));

    /**
     * Cobalt Axe
     */
    private static final ToolItem COBALT_AXE = new CobaltAxeItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));

    public static void Init() {
        Registry.register(Registry.ITEM, new Identifier(Config.NAMESPACE, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Config.NAMESPACE, "cobalt_axe"), COBALT_AXE);
    }
}
