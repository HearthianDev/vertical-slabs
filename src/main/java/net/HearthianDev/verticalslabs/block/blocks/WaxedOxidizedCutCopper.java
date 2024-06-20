package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.CopperVerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class WaxedOxidizedCutCopper extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new CopperVerticalSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB).sounds(BlockSoundGroup.METAL).hardness(2f).requiresTool());

    public WaxedOxidizedCutCopper() {
        super("vertical_waxed_oxidized_cut_copper_slab", VERTICAL_SLAB, "oxidized_cut_copper", Items.WAXED_OXIDIZED_CUT_COPPER, Items.WAXED_OXIDIZED_CUT_COPPER_SLAB);
        registerBlockItem(ID, this);
    }
}
