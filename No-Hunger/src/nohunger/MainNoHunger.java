package nohunger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainNoHunger extends JavaPlugin {
	
	public void onEnable() {
		System.out.println("No-Hunger Enabled!");
		Bukkit.getPluginManager().registerEvents(new Event(), this);
	}
	
	public void onDisable() {
		System.out.println("No-Hunger Disabled!");
	}

}
