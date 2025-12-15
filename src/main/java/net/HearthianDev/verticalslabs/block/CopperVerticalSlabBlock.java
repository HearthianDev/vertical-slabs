package net.HearthianDev.verticalslabs.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CopperVerticalSlabBlock extends VerticalSlabBlock implements WeatheringCopper {
    private final WeatherState oxidationLevel;

    public CopperVerticalSlabBlock(WeatherState oxidationLevel, Properties settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(@NotNull BlockState state, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.oxidationLevel;
    }
}
