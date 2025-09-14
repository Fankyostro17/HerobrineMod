package net.fanky17.herobrinemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blocchi interi
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSCURED_GEM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSCURED_GEM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RITUAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSCURED_GEM_BLOCK);

        //blocchi non interi
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RITUAL_PEDESTAL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OBSCURED_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RITUAL_CORE, Models.GENERATED);

        //tool
        itemModelGenerator.register(ModItems.RITUAL_WAND, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEDROCK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HEROBRINE_SWORD_LV1, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HEROBRINE_SWORD_LV2, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_HEROBRINE_SWORD_LV3, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_HEROBRINE_SWORD, Models.HANDHELD);
    }
}
