package io.github.gamer4life1.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("heal")) {
            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;
                p.setHealth(20);
            } else commandSender.sendMessage("You need to be a player to do this!");
            return true;
        }
        return false;
    }
}
