package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothQuartz;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractSmoothQuartz extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothQuartz.VERTICAL_SLAB;

    public AbstractSmoothQuartz() {
        super(SmoothQuartz.ID, VERTICAL_SLAB, "smooth_quartz", Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_all")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping().putForced(TextureSlot.ALL, new Material(Identifier.withDefaultNamespace("block/quartz_block_bottom"))),
                blockStateModelGenerator.modelOutput
        );
    }
}
