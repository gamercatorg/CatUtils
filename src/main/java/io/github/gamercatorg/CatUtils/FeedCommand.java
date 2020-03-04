package io.github.gamercatorg.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/** Handles the /feed command.
 * @author GamerCat Meow
 * @version %I%, %G%
 * @since 1.0
*/
public class FeedCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("feed")) {
            return CatUtilsAPI.feedPlayer(commandSender, command, args);
        }
        return false;
    }
}
