package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Quartz;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;


public class AbstractQuartz extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Quartz.VERTICAL_SLAB;

    public AbstractQuartz() {
        super(Quartz.ID, VERTICAL_SLAB, "quartz_block", Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_all")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping().putForced(TextureSlot.ALL, Identifier.withDefaultNamespace("block/quartz_block_side")),
                blockStateModelGenerator.modelOutput
        );
    }
}
