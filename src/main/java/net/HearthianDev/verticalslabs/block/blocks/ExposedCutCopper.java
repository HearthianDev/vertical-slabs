package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.CopperVerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class ExposedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());

    public ExposedCutCopper() {
        super("vertical_exposed_cut_copper_slab", VERTICAL_SLAB, "exposed_cut_copper", Items.EXPOSED_CUT_COPPER, Items.EXPOSED_CUT_COPPER_SLAB);
        registerBlockItem(ID, this);
    }
}
