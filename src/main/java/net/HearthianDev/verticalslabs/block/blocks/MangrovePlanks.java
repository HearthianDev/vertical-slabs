package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class MangrovePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public MangrovePlanks() {
        super("vertical_mangrove_slab", VERTICAL_SLAB, "mangrove_planks", Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB, false);
        registerBlockItem(ID, this);
    }
}
