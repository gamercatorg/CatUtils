package io.github.gamer4life1.CatUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("fly")) {
            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;
                if (!p.getAllowFlight()) {
                    p.setAllowFlight(true);
                } else {
                    p.setAllowFlight(false);
                }
            } else commandSender.sendMessage("You need to be a player to do that!");
        }
        return false;
    }
}
