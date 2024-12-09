package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Sandstone;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Sandstone.VERTICAL_SLAB;

    public AbstractSandstone() {
        super(Sandstone.ID, VERTICAL_SLAB, "sandstone", Items.SANDSTONE, Items.SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_bottom_top")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap()
                        .register(TextureKey.BOTTOM, Identifier.ofVanilla("block/sandstone_bottom"))
                        .register(TextureKey.TOP, Identifier.ofVanilla("block/sandstone_top"))
                        .register(TextureKey.SIDE, Identifier.ofVanilla("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelCollector
        );
    }
}
