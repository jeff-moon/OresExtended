package com.oresextended.registry;
import com.oresextended.OresExtendedConfig;
import com.oresextended.world.OreGenerator;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;


public class WorldRegistry {
    public static void Register() {
        RegistryKey<ConfiguredFeature<?, ?>> oreCobalt = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresExtendedConfig.NAMESPACE, "ore_cobalt_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCobalt.getValue(), OreGenerator.ORE_COBALT);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCobalt);
    }
}
