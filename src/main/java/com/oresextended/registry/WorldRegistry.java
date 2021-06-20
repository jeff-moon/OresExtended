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
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;


public class WorldRegistry {
    public static ConfiguredFeature<?, ?> ORE_COBALT = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
                    BlockRegistry.COBALT_ORE.getDefaultState(),
                    8)) // Vein size of 8. Max vein size maybe?
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    UniformHeightProvider.create(
                            YOffset.fixed(0),  // Y-min of absolute 0
                            YOffset.fixed(30)) // Y-max of 30 blocks above absolute 0
            )))
            .spreadHorizontally()
            .repeat(13); // number of veins per chunk

    public static void Register() {
        RegistryKey<ConfiguredFeature<?, ?>> oreCobalt = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresExtendedConfig.NAMESPACE, "ore_cobalt_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCobalt.getValue(), ORE_COBALT);
        //todo don't use deprecated API
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCobalt);
    }
}
