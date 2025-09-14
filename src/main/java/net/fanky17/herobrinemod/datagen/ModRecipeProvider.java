package net.fanky17.herobrinemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OBSCURED_GEM, RecipeCategory.MISC, ModBlocks.OBSCURED_GEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RITUAL_BLOCK)
                .input('#', ModItems.RITUAL_CORE)
                .input('*', ModItems.OBSCURED_GEM)
                .input('-', Items.OBSIDIAN)
                .input('+', Items.FIRE_CHARGE)
                .pattern("-+-")
                .pattern("*#*")
                .pattern("-+-")
                .group("banner")
                .criterion(hasItem(ModItems.OBSCURED_GEM), conditionsFromItem(ModItems.OBSCURED_GEM))
                .criterion(hasItem(ModItems.RITUAL_CORE), conditionsFromItem(ModItems.RITUAL_CORE))
                .offerTo(exporter);

        /*ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSCURED_GEM, 9)
                .input(ModBlocks.OBSCURED_GEM_BLOCK)
                .criterion(hasItem(ModBlocks.OBSCURED_GEM_BLOCK), conditionsFromItem(ModBlocks.OBSCURED_GEM_BLOCK))
                .offerTo(exporter /*Se voglio aggiungere il nome alla recipe metto qui dentro:, Identifier.of(HerobrineMod.MOD_ID, "obscured_gem_from_obscured_gem_block"));*/
    }
}
