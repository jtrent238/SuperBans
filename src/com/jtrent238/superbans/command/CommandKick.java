package com.jtrent238.superbans.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandKick implements CommandExecutor {

	private String kicker;
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Player ptk = (Player) player;
            
            //player.sendMessage("HEY!");
            
            kicker = sender.getName();

            Bukkit.getPlayer(args[0]);
            Bukkit.broadcast(args[0] + " has been kicked by " + kicker + " using §4§lSuperBans", "superbans.kick");
            
			ptk.kickPlayer(args[0]);
            
           	cmd.setUsage("/sb kick [player]");
           	cmd.setPermission("superbans.kick");

        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}
