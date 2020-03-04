package io.github.gamercatorg.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/** Handles the heal command
 * @author GamerCat Meow
 * @version %I%, %G%
 * @since 1.0
 */
public class HealCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("heal")) {
            CatUtilsAPI.healPlayer(commandSender, args);
        }
        return false;
    }
}
