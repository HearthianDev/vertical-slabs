package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.resources.Identifier;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

import static net.HearthianDev.verticalslabs.VerticalSlabsClient.BLOCKS;

public class ModelGeneration extends FabricModelProvider {
    public ModelGeneration(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockModelGenerators blockStateModelGenerator) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            blockStateModelGenerator.blockStateOutput.accept(block.getBlockStates());

            block.generateBlockModel(blockStateModelGenerator);
        }
    }

    @Override
    public void generateItemModels(@NotNull ItemModelGenerators itemModelGenerator) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            itemModelGenerator.generateFlatItem(
                block.VERTICAL_SLAB.asItem(),
                new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/" + StringUtils.substringAfterLast(block.VERTICAL_SLAB.getDescriptionId(),"."))), Optional.empty())
            );
        }
    }
}