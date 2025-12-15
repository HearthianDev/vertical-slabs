package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Blackstone;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import java.util.Optional;

public class AbstractBlackstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Blackstone.VERTICAL_SLAB;

    public AbstractBlackstone() {
        super(Blackstone.ID, VERTICAL_SLAB, "blackstone", Items.BLACKSTONE, Items.BLACKSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockModelGenerators blockStateModelGenerator) {
        new ModelTemplate(Optional.of(Identifier.parse("verticalslabs:block/vertical_slab_column")), Optional.empty()).create(
                VERTICAL_SLAB,
                new TextureMapping()
                        .putForced(TextureSlot.END, Identifier.withDefaultNamespace("block/blackstone_top"))
                        .putForced(TextureSlot.SIDE, Identifier.withDefaultNamespace("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelOutput
        );
    }
}
