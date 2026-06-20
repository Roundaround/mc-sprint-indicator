package me.roundaround.sprintindicator.neoforge;

import me.roundaround.sprintindicator.config.SprintIndicatorConfig;
import me.roundaround.trove.neoforge.TroveNeoForge;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod("sprintindicator")
public final class SprintIndicatorNeoForgeMod {
  public SprintIndicatorNeoForgeMod(IEventBus modBus, ModContainer container) {
    TroveNeoForge.bootstrap(modBus, container);
    SprintIndicatorConfig.INSTANCE.init();

    // Client setup lives in SprintIndicatorNeoForgeClient (separate class, not inline) so the dedicated server never links its client classes.
    if (FMLEnvironment.getDist() == Dist.CLIENT) {
      SprintIndicatorNeoForgeClient.init(container);
    }
  }
}
