package io.github.gamercatorg.CatUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

/** Handles all functions.
 * @author GamerCat Meow
 * @version %I%, %G%
 * @since 1.6
*/
public class CatUtilsAPI {
    /** Handles the feed command.
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
    /** Handles the fly command.
     * @author GamerCat Meow
     * @param commandSender the command sender.
     * @param args The args
     * @return boolean
     */
    public static boolean fly(CommandSender commandSender, String[] args) {
        if (commandSender instanceof Player && args.length == 0) {
                Player p = (Player) commandSender;
                if (!p.getAllowFlight()) {
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.AQUA + "Fly mode enabled!");
                    return true;
                } else {
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.AQUA + "Fly mode disabled!");
                    return true;
                }
            } else {
                if (args.length == 0) {
                    commandSender.sendMessage(ChatColor.RED + "Correct usage: /fly <player>");
                    return false;
                }

                if (Bukkit.getPlayer(args[0]).isOnline()) {
                    Player p = Bukkit.getPlayer(args[0]);
                    if (!p.getAllowFlight()) {
                        p.setAllowFlight(true);
                        commandSender.sendMessage(ChatColor.AQUA + "Flight mode enabled for player " + p.getName());
                    } else {
                        p.setAllowFlight(false);
                        commandSender.sendMessage(ChatColor.AQUA + "Flight mode disabled for player " + p.getName());
                    }
                } else {
                    commandSender.sendMessage(ChatColor.RED + "The player " + args[0] + " is not online. Please try again...");
                    return false;
                }

            }
        return false;
    }

    /** Handles the heal command.
     * @author GamerCat Meow
     * @param commandSender the command sender
     * @param args the args
     * @return boolean
     */
    public static boolean healPlayer(CommandSender commandSender, String[] args) {
        if (commandSender instanceof Player && args.length == 0) {
                Player p = (Player) commandSender;
                p.setHealth(20);
                p.sendMessage(ChatColor.AQUA + "You have been healed.");
                return true;
            } else {
                if (args.length == 0) {
                    commandSender.sendMessage(ChatColor.RED + "Correct usage: /heal [player]");
                    return false;
                }

                if (Bukkit.getPlayer(args[0]).isOnline()) {
                    Player player = Bukkit.getPlayer(args[0]);
                    player.setHealth(20);
                    commandSender.sendMessage(ChatColor.AQUA + player.getName() + " was healed.");
                } else {
                    commandSender.sendMessage(ChatColor.RED + "The player " + args[0] + " is not online. Please try again...");
                    return false;
                }

            }
            return true;
    }
}