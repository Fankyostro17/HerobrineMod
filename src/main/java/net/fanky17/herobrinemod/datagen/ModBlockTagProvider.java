package net.fanky17.herobrinemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OBSCURED_GEM_BLOCK)
                .add(ModBlocks.OBSCURED_GEM_ORE)
                .add(ModBlocks.OBSCURED_GEM_DEEPSLATE_ORE)
                .add(ModBlocks.RITUAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RITUAL_BLOCK)
                .add(ModBlocks.OBSCURED_GEM_ORE)
                .add(ModBlocks.RITUAL_PEDESTAL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSCURED_GEM_DEEPSLATE_ORE)
                .add(ModBlocks.OBSCURED_GEM_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_OBSCURED_GEM_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GALAXY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_HEROBRINE_IRON_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_HEROBRINE_DIAMOND_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_HEROBRINE_BEDROCK_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
