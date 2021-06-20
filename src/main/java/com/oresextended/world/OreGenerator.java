package com.oresextended.world;

import com.oresextended.registry.BlockRegistry;
import com.oresextended.registry.ItemRegistry;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.heightprovider.HeightProviderType;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import java.util.Random;

public class OreGenerator {
    public static ConfiguredFeature<?, ?> ORE_COBALT = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
                    BlockRegistry.COBALT_ORE.getDefaultState(),
                    20)) // TODO move this vein size to a config?
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                UniformHeightProvider.create(
                        YOffset.fixed(0),
                        YOffset.fixed(64))
                )))
            .spreadHorizontally()
            .repeat(100); // number of veins per chunk
}
