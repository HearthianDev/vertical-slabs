package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.AcaciaPlanks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractAcaciaPlanks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = AcaciaPlanks.VERTICAL_SLAB;

    public AbstractAcaciaPlanks() {
        super(AcaciaPlanks.ID, VERTICAL_SLAB, "acacia_planks", Items.ACACIA_PLANKS, Items.ACACIA_SLAB, false);
    }
}
