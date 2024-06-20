package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Diorite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Diorite() {
        super("vertical_diorite_slab", VERTICAL_SLAB, "diorite", Items.DIORITE, Items.DIORITE_SLAB);
        registerBlockItem(ID, this);
    }
}
