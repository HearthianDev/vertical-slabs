package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class SprucePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public SprucePlanks() {
        super("vertical_spruce_slab", VERTICAL_SLAB, "spruce_planks", Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, false);
        registerBlockItem(ID, this);
    }
}
