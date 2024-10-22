package winlyps.noSpectatorsChunks

import org.bukkit.plugin.java.JavaPlugin

class NoSpectatorsChunks : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("spectatorsGenerateChunks", "false")
        }
        logger.info("NoSpectatorsChunks plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoSpectatorsChunks plugin has been disabled.")
    }
}