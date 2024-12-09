package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.RedSandstone;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractRedSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = RedSandstone.VERTICAL_SLAB;

    public AbstractRedSandstone() {
        super(RedSandstone.ID, VERTICAL_SLAB, "red_sandstone", Items.RED_SANDSTONE, Items.RED_SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_bottom_top")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap()
                        .register(TextureKey.BOTTOM, Identifier.ofVanilla("block/red_sandstone_bottom"))
                        .register(TextureKey.TOP, Identifier.ofVanilla("block/red_sandstone_top"))
                        .register(TextureKey.SIDE, Identifier.ofVanilla("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelCollector
        );
    }
}
