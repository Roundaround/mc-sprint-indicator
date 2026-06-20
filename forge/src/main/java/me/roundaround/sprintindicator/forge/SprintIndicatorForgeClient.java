package me.roundaround.sprintindicator.forge;

import me.roundaround.sprintindicator.client.SprintIndicatorConfigScreen;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Separate class (not an inline Dist gate in the @Mod ctor) so the dedicated server never links its client classes.
public final class SprintIndicatorForgeClient {
  private SprintIndicatorForgeClient() {
  }

  public static void init(FMLJavaModLoadingContext context) {
    context.getContainer().registerExtensionPoint(
        ConfigScreenHandler.ConfigScreenFactory.class,
        () -> new ConfigScreenHandler.ConfigScreenFactory(
            (mc, parent) -> new SprintIndicatorConfigScreen(parent)));
  }
}
