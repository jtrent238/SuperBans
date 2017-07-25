package com.jtrent238.superbans.command;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.jtrent238.superbans.Main;

import net.md_5.bungee.api.ChatColor;

public class CommandFreeze implements CommandExecutor {
	
	public List<String> frozen = new ArrayList<String>();
	private String[] frozenplayer;
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            
            	frozen.add(frozenplayer[0]);
            	
            	player.sendMessage(ChatColor.DARK_RED + "You have frozen " + frozenplayer + " in their spot!");
                
           	cmd.setUsage("/sbfreeze");
           	cmd.setPermission("superbans.freeze");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}
