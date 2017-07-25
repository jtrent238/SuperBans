package com.jtrent238.superbans.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandBan implements CommandExecutor {

	private String victim;
	private String banner;
	private String permission = "superbans.ban";

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            
            //player.sendMessage("HEY!");
            
            banner = sender.getName();
            Bukkit.getPlayer(victim);
            Bukkit.broadcast(victim + " has been banned by " + banner + " using §4§lSuperBans", permission);
            Bukkit.banIP(victim);
            
           	cmd.setUsage("/sb ban [player]");
           	cmd.setPermission(permission);

        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}
