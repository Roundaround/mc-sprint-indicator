package me.roundaround.sprintindicator.neoforge;

import me.roundaround.sprintindicator.client.SprintIndicatorConfigScreen;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// Separate class (not an inline Dist gate in the @Mod ctor) so the dedicated server never links its client classes.
public final class SprintIndicatorNeoForgeClient {
  private SprintIndicatorNeoForgeClient() {
  }

  public static void init(ModContainer container) {
    container.registerExtensionPoint(IConfigScreenFactory.class,
        (modContainer, parent) -> new SprintIndicatorConfigScreen(parent));
  }
}
