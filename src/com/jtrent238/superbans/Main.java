package com.jtrent238.superbans;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

import com.jtrent238.superbans.command.CommandBan;
import com.jtrent238.superbans.command.CommandFreeze;
import com.jtrent238.superbans.command.CommandInfo;
import com.jtrent238.superbans.command.CommandKick;
import com.jtrent238.superbans.command.CommandTest;

public class Main extends JavaPlugin {

	public static String VERSION = "1.0.0.0-SNAPSHOT";

	@Override
    public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		//this.getCommand("sb info").setExecutor(new MyPluginCommandExecutor(this));
		
		//getLogger().log(Level.INFO, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		getLogger().log(Level.INFO, "SuperBans Made By: jtrent238");
		getLogger().log(Level.INFO, "You are runing SuperBans version: " + VERSION);
		getLogger().log(Level.INFO, "Plugin Is WIP!");
		getLogger().log(Level.INFO, "If you downloaded this from somewhere otherthan my links someone is probaly making money from my hard work. Don't Support them and don't download from them.");
		//getLogger().log(Level.INFO, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	
		this.getCommand("test").setExecutor(new CommandTest());
		this.getCommand("sbinfo").setExecutor(new CommandInfo());
		this.getCommand("sbban").setExecutor(new CommandBan());
		this.getCommand("sbfreeze").setExecutor(new CommandFreeze());
		this.getCommand("sbkick").setExecutor(new CommandKick());
        
	}
    
    @Override
    public void onDisable() {
    	getLogger().info("onDisable has been invoked!");
    }
    
    @Override
    public void onLoad(){
    	getLogger().info("onLoad has been invoked!");
        }
    

}
