package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Sandstone;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Sandstone.VERTICAL_SLAB;

    public AbstractSandstone() {
        super(Sandstone.ID, VERTICAL_SLAB, "sandstone", Items.SANDSTONE, Items.SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_bottom_top")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping()
                        .putForced(TextureSlot.BOTTOM, new Material(Identifier.withDefaultNamespace("block/sandstone_bottom")))
                        .putForced(TextureSlot.TOP,new Material( Identifier.withDefaultNamespace("block/sandstone_top")))
                        .putForced(TextureSlot.SIDE, new Material(Identifier.withDefaultNamespace("block/" + this.PARENT_ID))),
                blockStateModelGenerator.modelOutput
        );
    }
}
