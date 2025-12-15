package net.HearthianDev.verticalslabs.block.blockInit;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.HearthianDev.verticalslabs.VerticalSlabs.MOD_ID;

public class PaleOakPlanks {
    public static final String ID = "vertical_pale_oak_slab";
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(
        AbstractBlock.Settings.copy(Blocks.PALE_OAK_SLAB)
            .sounds(BlockSoundGroup.WOOD)
            .hardness(2f)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "vertical_pale_oak_slab")))
    );
}
