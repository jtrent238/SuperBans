package com.jtrent238.superbans;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MyPluginCommandExecutor implements CommandExecutor {
	private final Main plugin;

	public MyPluginCommandExecutor(Main plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
		// implementation exactly as before...
	}

	public Main getPlugin() {
		return plugin;
	}
}