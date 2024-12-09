package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothRedSandstone;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractSmoothRedSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothRedSandstone.VERTICAL_SLAB;

    public AbstractSmoothRedSandstone() {
        super(SmoothRedSandstone.ID, VERTICAL_SLAB, "smooth_red_sandstone", Items.SMOOTH_RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/red_sandstone_top")),
                blockStateModelGenerator.modelCollector
        );
    }
}
