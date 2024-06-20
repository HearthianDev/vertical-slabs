package net.HearthianDev.verticalslabs.block.blocks;

import net.HearthianDev.verticalslabs.block.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.HearthianDev.verticalslabs.VerticalSlabs.registerBlockItem;

public class SmoothQuartz extends AbstractVerticalSlabBlock {
    public static final Block VERTICAL_SLAB = new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB).sounds(BlockSoundGroup.STONE).hardness(2f).requiresTool());

    public SmoothQuartz() {
        super("vertical_smooth_quartz_slab", VERTICAL_SLAB, "smooth_quartz", Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ_SLAB);
        registerBlockItem(ID, this);
    }

    @Override
    public void generateBlockModel(BlockStateModelGenerator blockStateModelGenerator) {
        new Model(Optional.of(Identifier.of("verticalslabs:block/vertical_slab_all")), Optional.empty()).upload(
                VERTICAL_SLAB,
                new TextureMap().register(TextureKey.ALL, Identifier.ofVanilla("block/quartz_block_bottom")),
                blockStateModelGenerator.modelCollector
        );
    }
}
