package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

import static net.HearthianDev.verticalslabs.VerticalSlabsClient.BLOCKS;

public class ModelGeneration extends FabricModelProvider {
    public ModelGeneration(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            blockStateModelGenerator.blockStateCollector.accept(block.getBlockStates());

            block.generateBlockModel(blockStateModelGenerator);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            itemModelGenerator.register(
                block.VERTICAL_SLAB.asItem(),
                new Model(Optional.of(Identifier.of("verticalslabs:block/" + StringUtils.substringAfterLast(block.VERTICAL_SLAB.getTranslationKey(),"."))), Optional.empty())
            );
        }
    }
}