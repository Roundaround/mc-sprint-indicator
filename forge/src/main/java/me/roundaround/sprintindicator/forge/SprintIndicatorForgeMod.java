package me.roundaround.sprintindicator.forge;

import me.roundaround.sprintindicator.config.SprintIndicatorConfig;
import me.roundaround.trove.forge.TroveForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod("sprintindicator")
public final class SprintIndicatorForgeMod {
  public SprintIndicatorForgeMod(FMLJavaModLoadingContext context) {
    TroveForge.bootstrap(context);
    SprintIndicatorConfig.INSTANCE.init();

    // Client setup lives in SprintIndicatorForgeClient (separate class, not inline) so the dedicated server never links its client classes.
    if (FMLEnvironment.dist.isClient()) {
      SprintIndicatorForgeClient.init(context);
    }
  }
}
