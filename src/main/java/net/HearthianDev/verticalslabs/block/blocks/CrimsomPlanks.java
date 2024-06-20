package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class CrimsomPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB).sounds(BlockSoundGroup.WOOD).hardness(2f));

    public CrimsomPlanks() {
        super("vertical_crimson_slab", VERTICAL_SLAB, "crimson_planks", Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, false);
        registerBlockItem(ID, this);
    }
}
