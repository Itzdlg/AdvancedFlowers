package me.schooltests.advflowers;

import java.util.HashMap;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.schooltests.advflowers.commands.CreateFlower;
import me.schooltests.advflowers.events.BlockPhysicsHandler;
import me.schooltests.advflowers.events.InteractHandler;
import me.schooltests.advflowers.events.InventoryHandler;

public class AdvFlowers extends JavaPlugin {
	
	public static HashMap<String, List<ItemStack>> pots = new HashMap<>();
	
	@Override
	public void onEnable() {
		this.getCommand("createflower").setExecutor(new CreateFlower());
		
		getServer().getPluginManager().registerEvents(new InventoryHandler(), this);
		getServer().getPluginManager().registerEvents(new InteractHandler(), this);
		getServer().getPluginManager().registerEvents(new BlockPhysicsHandler(), this);
	}

}

