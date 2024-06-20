package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class PolishedTuff extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF_SLAB).sounds(BlockSoundGroup.POLISHED_TUFF).hardness(2f).requiresTool());

    public PolishedTuff() {
        super("vertical_polished_tuff_slab", VERTICAL_SLAB, "polished_tuff", Items.TUFF, Items.TUFF_SLAB);
        registerBlockItem(ID, this);
    }
}
