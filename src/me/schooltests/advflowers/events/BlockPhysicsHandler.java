package me.schooltests.advflowers.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

import me.schooltests.advflowers.Util;

public class BlockPhysicsHandler implements Listener {
	
	@EventHandler
	public void onPhysics(BlockPhysicsEvent e) {
		if(Util.preventBlockPhysics) {
			e.setCancelled(true);
		}
	}

}
