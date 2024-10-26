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
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                for (AbstractVerticalSlabBlock block : BLOCKS) {
                    createShaped(RecipeCategory.BUILDING_BLOCKS, block.VERTICAL_SLAB.asItem(), 6)
                            .pattern(" # ")
                            .pattern(" # ")
                            .pattern(" # ")
                            .input('#', block.PARENT)
                            .group(CraftingRecipeJsonBuilder.getItemId(block.VERTICAL_SLAB).toString())
                            .criterion(hasItem(block.PARENT), conditionsFromItem(block.PARENT))
                            .offerTo(exporter);

                    if (block.isCuttable) {
                        // Stonecutter recipes
                        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, block.VERTICAL_SLAB.asItem(), block.PARENT.asItem(), 2);
                    }
                }
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
