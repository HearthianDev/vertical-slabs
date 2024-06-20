package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.CopperVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Granite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Granite() {
        super("vertical_granite_slab", VERTICAL_SLAB, "granite", Items.GRANITE, Items.GRANITE_SLAB);
        registerBlockItem(ID, this);
    }
}
