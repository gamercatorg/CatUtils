package io.github.gamer4life1.CatUtils;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("CatUtils has been enabled!");
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("fly").setExecutor(new FlyCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("CatUtils has been disabled!");
    }
}
