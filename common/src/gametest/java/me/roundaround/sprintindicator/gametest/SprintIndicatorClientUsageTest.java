package me.roundaround.sprintindicator.gametest;

import me.roundaround.allay.api.gametest.ClientGameTest;
import me.roundaround.sprintindicator.client.SprintIndicatorConfigScreen;
import me.roundaround.trove.gametest.ClientTest;
import me.roundaround.trove.gametest.ClientTestContext;

/**
 * Open the mod's Trove-backed config screen from the title screen and confirm it
 * renders — exercising the 26.2 GUI path and the PositionConfigOption control
 * registration that {@link SprintIndicatorConfigScreen} installs.
 */
@ClientGameTest
public class SprintIndicatorClientUsageTest implements ClientTest {
  @Override
  public void runTest(ClientTestContext context) {
    context.setScreen(() -> new SprintIndicatorConfigScreen(null));
    context.assertScreen(SprintIndicatorConfigScreen.class);
    context.waitTicks(2);
    context.returnToTitle();
  }
}
