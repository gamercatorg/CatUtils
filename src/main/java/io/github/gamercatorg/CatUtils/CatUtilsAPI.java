package io.github.gamercatorg.CatUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

/** Handles all functions.
 * @author GamerCat Meow
 * @version 1.6
 * @since 1.6
*/
public class CatUtilsAPI {
    /**
     * @author GamerCat Meow
     * @param commandSender The command sender
     * @param command The command executed
     * @param args The command args
     * @return boolean
     */
    public static boolean feedPlayer(CommandSender commandSender, Command command, String[] args) {
        if (commandSender instanceof Player && args.length == 0) {
                Player p = (Player) commandSender;
                p.setSaturation(20);
                p.sendMessage(ChatColor.AQUA + "Your appetite has been sated.");
                return true;
            } else {
                if (args.length == 0) {
                    commandSender.sendMessage(ChatColor.RED + "Correct usage: /feed [player]");
                    return false;
                }

                if (Bukkit.getPlayer(args[0]).isOnline()) {
                    Player player = Bukkit.getPlayer(args[0]);
                    player.setSaturation(20);
                    commandSender.sendMessage(ChatColor.AQUA + player.getName() + "\'s appetite was sated.");
                } else {
                    commandSender.sendMessage(ChatColor.RED + "The player " + args[0] + " is not online. Please try again...");
                    return false;
                }

            }
            return true;
    }
}