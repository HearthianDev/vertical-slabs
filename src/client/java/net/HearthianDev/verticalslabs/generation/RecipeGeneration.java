package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.HearthianDev.verticalslabs.VerticalSlabsClient.BLOCKS;

public class RecipeGeneration extends FabricRecipeProvider {
    public RecipeGeneration(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider wrapperLookup, @NotNull RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {
                for (AbstractVerticalSlabBlock block : BLOCKS) {
                    Item blockItem = block.VERTICAL_SLAB.asItem();

                    shaped(RecipeCategory.BUILDING_BLOCKS, blockItem, 6)
                            .pattern(" # ")
                            .pattern(" # ")
                            .pattern(" # ")
                            .define('#', block.PARENT)
                            .group(RecipeBuilder.getDefaultRecipeId(blockItem.getDefaultInstance()).toString())
                            .unlockedBy(getHasName(block.PARENT), has(block.PARENT))
                            .save(output);

                    if (block.isCuttable) {
                        // Stonecutter recipes
                        stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, blockItem, block.PARENT.asItem(), 2);
                    }
                }
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "";
    }
}
