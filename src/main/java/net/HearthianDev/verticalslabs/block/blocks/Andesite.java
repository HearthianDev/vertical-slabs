package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class Andesite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public Andesite() {
        super("vertical_andesite_slab", VERTICAL_SLAB, "andesite", Items.ANDESITE, Items.ANDESITE_SLAB);
        registerBlockItem(ID, this);
    }
}
