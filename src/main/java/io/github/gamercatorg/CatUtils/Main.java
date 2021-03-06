package io.github.gamercatorg.CatUtils;

import org.bukkit.plugin.java.JavaPlugin;

/** Main class
 * @author GamerCat Meow
 * @version %I%, %G%
 * @since 1.0
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info(CatUtilsAPI.getName() + " has been enabled!");
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("fly").setExecutor(new FlyCommand());
        this.getCommand("tl").setExecutor(new LevitationCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info(CatUtilsAPI.getName() + " has been disabled!");
    }
}
