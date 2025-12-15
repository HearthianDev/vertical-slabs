package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.RedSandstone;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractRedSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = RedSandstone.VERTICAL_SLAB;

    public AbstractRedSandstone() {
        super(RedSandstone.ID, VERTICAL_SLAB, "red_sandstone", Items.RED_SANDSTONE, Items.RED_SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_bottom_top")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping()
                        .putForced(TextureSlot.BOTTOM, Identifier.withDefaultNamespace("block/red_sandstone_bottom"))
                        .putForced(TextureSlot.TOP, Identifier.withDefaultNamespace("block/red_sandstone_top"))
                        .putForced(TextureSlot.SIDE, Identifier.withDefaultNamespace("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelOutput
        );
    }
}
