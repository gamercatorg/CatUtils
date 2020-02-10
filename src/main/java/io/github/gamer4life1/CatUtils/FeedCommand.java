package io.github.gamer4life1.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("feed")) {
            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;
                p.setSaturation(20);
                return true;
            }
        }
        return false;
    }
}
