package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class JunglePlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public JunglePlanks() {
        super("vertical_jungle_slab", VERTICAL_SLAB, "jungle_planks", Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, false);
        registerBlockItem(ID, this);
    }
}
