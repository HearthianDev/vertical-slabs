package net.HearthianDev.verticalslabs;

import net.HearthianDev.verticalslabs.block.AbstractVerticalSlabBlock;
import net.HearthianDev.verticalslabs.block.blocks.*;
import net.fabricmc.api.ClientModInitializer;

public class VerticalSlabsClient implements ClientModInitializer {
	public static final String MOD_ID = "verticalslabs";

	public static AbstractVerticalSlabBlock[] BLOCKS = {
			new AbstractAcaciaPlanks(),
			new AbstractAndesite(),
			new AbstractBambooMosaic(),
			new AbstractBambooPlanks(),
			new AbstractBirchPlanks(),
			new AbstractBlackstone(),
			new AbstractBricks(),
			new AbstractCherryPlanks(),
			new AbstractCobbledDeepslate(),
			new AbstractCobblestone(),
			new AbstractCrimsomPlanks(),
			new AbstractCutCopper(),
			new AbstractCutRedSandstone(),
			new AbstractCutSandstone(),
			new AbstractDarkOakPlanks(),
			new AbstractDarkPrismarine(),
			new AbstractDeepslateBricks(),
			new AbstractDeepslateTiles(),
			new AbstractDiorite(),
			new AbstractEndStoneBricks(),
			new AbstractExposedCutCopper(),
			new AbstractGranite(),
			new AbstractJunglePlanks(),
			new AbstractMangrovePlanks(),
			new AbstractMossyCobblestone(),
			new AbstractMossyStoneBricks(),
			new AbstractMudBricks(),
			new AbstractNetherBricks(),
			new AbstractOakPlanks(),
			new AbstractOxidizedCutCopper(),
			new AbstractPolishedAndesite(),
			new AbstractPolishedBlackstone(),
			new AbstractPolishedBlackstoneBricks(),
			new AbstractPolishedDeepslate(),
			new AbstractPolishedDiorite(),
			new AbstractPolishedGranite(),
			new AbstractPolishedTuff(),
			new AbstractPrismarine(),
			new AbstractPrismarineBricks(),
			new AbstractPurpur(),
			new AbstractQuartz(),
			new AbstractRedNetherBricks(),
			new AbstractRedSandstone(),
			new AbstractResinBricks(),
			new AbstractSandstone(),
			new AbstractSmoothQuartz(),
			new AbstractSmoothRedSandstone(),
			new AbstractSmoothSandstone(),
			new AbstractSmoothStone(),
			new AbstractSprucePlanks(),
			new AbstractStone(),
			new AbstractStoneBricks(),
			new AbstractTuff(),
			new AbstractTuffBricks(),
			new AbstractWarpedPlanks(),
			new AbstractWaxedCutCopper(),
			new AbstractWaxedExposedCutCopper(),
			new AbstractWaxedOxidizedCutCopper(),
			new AbstractWaxedWeatheredCutCopper(),
			new AbstractWeatheredCutCopper()
	};

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering..
	}
}