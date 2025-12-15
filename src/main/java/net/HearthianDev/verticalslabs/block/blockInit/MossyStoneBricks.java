package net.HearthianDev.verticalslabs.block.blockInit;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.HearthianDev.verticalslabs.VerticalSlabs.MOD_ID;

public class MossyStoneBricks {
    public static final String ID = "vertical_mossy_stone_brick_slab";
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.MOSSY_STONE_BRICK_SLAB)
            .sound(SoundType.STONE)
            .destroyTime(2f)
            .requiresCorrectToolForDrops()
            .setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "vertical_mossy_stone_brick_slab")))
    );
}
