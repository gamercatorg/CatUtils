package io.github.gamercatorg.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/** Handles the fly command.
 * @author GamerCat Meow
 * @version 1.7
 * @since 1.0
 */
public class FlyCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fly")) {
            return CatUtilsAPI.fly(commandSender, args);
        }
        return false;
    }
}
