package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;


import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class DarkOakPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public DarkOakPlanks() {
        super("vertical_dark_oak_slab", VERTICAL_SLAB, "dark_oak_planks", Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, false);
        registerBlockItem(ID, this);
    }
}
