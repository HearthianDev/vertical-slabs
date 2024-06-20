package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.blocks.AbstractVerticalSlabBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.HearthianDev.verticalslabs.VerticalSlabs.BLOCKS;

public class RecipeGeneration extends FabricRecipeProvider {
    public RecipeGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, block.VERTICAL_SLAB, 6)
                    .pattern(" # ")
                    .pattern(" # ")
                    .pattern(" # ")
                    .input('#', block.PARENT)
                    .group(CraftingRecipeJsonBuilder.getItemId(block.VERTICAL_SLAB).toString())
                    .criterion(FabricRecipeProvider.hasItem(block.PARENT), FabricRecipeProvider.conditionsFromItem(block.PARENT))
                    .offerTo(exporter);

            if (block.isCuttable) {
                // Stonecutter recipes
                RecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, block.VERTICAL_SLAB, block.PARENT, 2);
            }
        }
    }
}
