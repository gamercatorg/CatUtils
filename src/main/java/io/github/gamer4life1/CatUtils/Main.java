package io.github.gamer4life1.CatUtils;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("CatUtils has been enabled!");
    }
    @Override
    public void onDisable() {
        getLogger().info("CatUtils has been disabled!");
    }
}
