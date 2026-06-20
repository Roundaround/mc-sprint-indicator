plugins {
  id("me.roundaround.allay")
}

allay {
  displayName.set("Sprint Indicator")
  description.set("Simple UI element showing whether you're currently sprinting.")
  authors.set(listOf("Roundaround"))
  license.set("MIT")
  homepage.set("https://modrinth.com/mod/sprint-indicator")
  repository.set("https://github.com/Roundaround/mc-sprint-indicator")
  issues.set("https://github.com/Roundaround/mc-sprint-indicator/issues")
  logoFile.set("assets/sprintindicator/banner.png")

  gametest {
    // Acknowledge the Minecraft EULA for the throwaway worlds the headless
    // server game test spins up.
    eula.set(true)
  }

  modrinth {
    projectId.set("sprint-indicator")
  }

  release {
    versionType.set("release")
    sourcesJar.set(true)
  }
}
