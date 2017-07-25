package com.jtrent238.superbans.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.jtrent238.superbans.Main;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;

public class CommandInfo implements CommandExecutor {

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            
            player.sendMessage(ChatColor.GOLD + "******************************");
            player.sendMessage(ChatColor.DARK_RED + "          SuperBans");
            player.sendMessage(ChatColor.DARK_GREEN + "        By: jtrent238");
            player.sendMessage(ChatColor.BLUE + "   Version: " + Main.VERSION);
            player.sendMessage(ChatColor.GOLD + "******************************");
            		/*
            player.sendMessage(ChatColor.GOLD + "******************************");
            player.sendMessage(ChatColor.DARK_RED + "SuperBans");
            player.sendMessage(ChatColor.DARK_GREEN + "By: jtrent238");
            player.sendMessage(ChatColor.BLUE + "Version: " + Main.VERSION);
            player.sendMessage(ChatColor.GOLD + "******************************");
            		 */
            //((Player) sender).setDisplayName("TEST");
            
           	cmd.setUsage("/sbinfo");
           	cmd.setPermission("superbans.info");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}
