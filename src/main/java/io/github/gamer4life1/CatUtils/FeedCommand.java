package io.github.gamer4life1.CatUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FeedCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("feed")) {
            if (commandSender instanceof Player) {
                Player p = (Player) commandSender;
                p.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 255, 255));
            } else {
                commandSender.sendMessage("You need to be a player to do that!");
            }
            return true;
        }
        return false;
    }
}
