package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class PrismarineBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public PrismarineBricks() {
        super("vertical_prismarine_brick_slab", VERTICAL_SLAB, "prismarine_bricks", Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_SLAB);
        registerBlockItem(ID, this);
    }
}
