package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.MudBricks;
import net.minecraft.block.Block;
import net.minecraft.item.Items;

public class AbstractMudBricks extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = MudBricks.VERTICAL_SLAB;

    public AbstractMudBricks() {
        super(MudBricks.ID, VERTICAL_SLAB, "mud_bricks", Items.MUD_BRICKS, Items.MUD_BRICK_SLAB);
    }
}
