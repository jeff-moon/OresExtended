package com.oresextended.registry;

import com.oresextended.OresExtendedConfig;
import com.oresextended.items.materials.CobaltArmorMaterial;
import com.oresextended.items.materials.CobaltToolMaterial;
import com.oresextended.items.tools.cobalt.CobaltAxeItem;
import com.oresextended.items.tools.cobalt.CobaltHoeItem;
import com.oresextended.items.tools.cobalt.CobaltPickaxeItem;
import com.oresextended.items.tools.cobalt.CobaltShovelItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    /**
     * Ingots
     */
    public static final Item COBALT_INGOT = new Item((new Item.Settings()).group(GroupRegistry.ORES_EXTENDED_GROUP));

    /**
     * Cobalt Tools
     */
    public static final ToolItem COBALT_AXE = new CobaltAxeItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final ToolItem COBALT_PICKAXE = new CobaltPickaxeItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final ToolItem COBALT_HOE = new CobaltHoeItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final ToolItem COBALT_SHOVEL = new CobaltShovelItem(CobaltToolMaterial.INSTANCE, 2, -3.0f, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));

    /**
     * Cobalt armor
     */
    public static final ArmorMaterial COBALT_ARMOR_MATERIAL = new CobaltArmorMaterial();
    public static final Item COBALT_HELMET = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final Item COBALT_CHESTPLATE = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final Item COBALT_LEGGINGS = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));
    public static final Item COBALT_BOOTS = new ArmorItem(COBALT_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(GroupRegistry.ORES_EXTENDED_GROUP));

    public static void Register() {

        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_axe"), COBALT_AXE);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_pickaxe"), COBALT_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_hoe"), COBALT_HOE);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_shovel"), COBALT_SHOVEL);

        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_helmet"), COBALT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_chestplate"), COBALT_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_leggings"), COBALT_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(OresExtendedConfig.NAMESPACE, "cobalt_boots"), COBALT_BOOTS);
    }
}
