package io.github.gamer4life1.CatUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FlyCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("fly")) {
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
        }
        return false;
    }
}
