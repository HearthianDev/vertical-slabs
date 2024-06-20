package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class CherryPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public CherryPlanks() {
        super("vertical_cherry_slab", VERTICAL_SLAB, "cherry_planks", Items.CHERRY_PLANKS, Items.CHERRY_SLAB, false);
        registerBlockItem(ID, this);
    }
}
