package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Quartz;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;


public class AbstractQuartz extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Quartz.VERTICAL_SLAB;

    public AbstractQuartz() {
        super(Quartz.ID, VERTICAL_SLAB, "quartz_block", Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/quartz_block_side")),
                blockStateModelGenerator.modelCollector
        );
    }
}
