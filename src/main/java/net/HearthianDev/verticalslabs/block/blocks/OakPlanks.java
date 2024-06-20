package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class OakPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public OakPlanks() {
        super("vertical_oak_slab", VERTICAL_SLAB, "oak_planks", Items.OAK_PLANKS, Items.OAK_SLAB, false);
        registerBlockItem(ID, this);
    }
}
