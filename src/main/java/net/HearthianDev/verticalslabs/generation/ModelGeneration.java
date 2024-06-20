package net.HearthianDev.verticalslabs.generation;

import net.HearthianDev.verticalslabs.block.blocks.AbstractVerticalSlabBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

import static net.HearthianDev.verticalslabs.VerticalSlabs.BLOCKS;

public class ModelGeneration extends FabricModelProvider {
    public ModelGeneration(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (AbstractVerticalSlabBlock block : BLOCKS) {
            blockStateModelGenerator.blockStateCollector.accept(block.getBlockStates(MultipartBlockStateSupplier.create(block.VERTICAL_SLAB)));

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