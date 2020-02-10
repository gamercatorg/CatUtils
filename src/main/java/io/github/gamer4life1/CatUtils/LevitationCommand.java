package io.github.gamer4life1.CatUtils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LevitationCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("levitation")) {
            for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                if (!p.getName().equalsIgnoreCase("Sardine123")) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 255, 255));
                    sender.sendMessage("Added levitation effect to " + p.getName() + "!");
                }
            }
            return true;
        }
        return false;
    }

}