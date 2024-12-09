package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blockInit.CutRedSandstone;
import net.minecraft.block.Block;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.client.data.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AbstractCutRedSandstone extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = CutRedSandstone.VERTICAL_SLAB;

    public AbstractCutRedSandstone() {
        super(CutRedSandstone.ID, VERTICAL_SLAB, "cut_red_sandstone", Items.CUT_RED_SANDSTONE, Items.CUT_RED_SANDSTONE_SLAB);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_column")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap()
                        .register(TextureKey.END, Identifier.ofVanilla("block/red_sandstone_top"))
                        .register(TextureKey.SIDE, Identifier.ofVanilla("block/" + this.PARENT_ID)),
                blockStateModelGenerator.modelCollector
        );
    }
}
