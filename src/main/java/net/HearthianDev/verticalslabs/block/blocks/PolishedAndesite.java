package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class PolishedAndesite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public PolishedAndesite() {
        super("vertical_polished_andesite_slab", VERTICAL_SLAB, "polished_andesite", Items.POLISHED_ANDESITE, Items.POLISHED_ANDESITE_SLAB);
        registerBlockItem(ID, this);
    }
}
