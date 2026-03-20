package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CutSandstone;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractCutSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CutSandstone.VERTICAL_SLAB;

    public AbstractCutSandstone() {
        super(CutSandstone.ID, VERTICAL_SLAB, "cut_sandstone", Items.CUT_SANDSTONE, Items.CUT_STANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_column")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping()
                        .putForced(TextureSlot.END, new Material(Identifier.withDefaultNamespace("block/sandstone_top")))
                        .putForced(TextureSlot.SIDE, new Material(Identifier.withDefaultNamespace("block/" + this.PARENT_ID))),
                blockStateModelGenerator.modelOutput
        );
    }
}
