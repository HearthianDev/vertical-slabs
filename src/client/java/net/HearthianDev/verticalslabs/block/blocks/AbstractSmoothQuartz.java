package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothQuartz;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractSmoothQuartz extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothQuartz.VERTICAL_SLAB;

    public AbstractSmoothQuartz() {
        super(SmoothQuartz.ID, VERTICAL_SLAB, "smooth_quartz", Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/quartz_block_bottom")),
                blockStateModelGenerator.modelCollector
        );
    }
}
