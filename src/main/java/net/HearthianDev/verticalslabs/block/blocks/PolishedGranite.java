package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class PolishedGranite extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public PolishedGranite() {
        super("vertical_polished_granite_slab", VERTICAL_SLAB, "polished_granite", Items.POLISHED_GRANITE, Items.POLISHED_GRANITE_SLAB);
        registerBlockItem(ID, this);
    }
}
