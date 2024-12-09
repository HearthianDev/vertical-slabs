package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.Blackstone;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractBlackstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = Blackstone.VERTICAL_SLAB;

    public AbstractBlackstone() {
        super(Blackstone.ID, VERTICAL_SLAB, "blackstone", Items.BLACKSTONE, Items.BLACKSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_column")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap()
                        .register(TextureKey.END, Identifier.ofVanilla("block/blackstone_top"))
                        .register(TextureKey.SIDE, Identifier.ofVanilla("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelCollector
        );
    }
}
