package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.SmoothSandstone;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractSmoothSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = SmoothSandstone.VERTICAL_SLAB;

    public AbstractSmoothSandstone() {
        super(SmoothSandstone.ID, VERTICAL_SLAB, "smooth_sandstone", Items.SMOOTH_SANDSTONE, Items.SMOOTH_SANDSTONE_SLAB); //smooth_red_sandstone
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_all")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping().putForced(TextureSlot.ALL, Identifier.withDefaultNamespace("block/sandstone_top")),
                blockStateModelGenerator.modelOutput
        );
    }
}
