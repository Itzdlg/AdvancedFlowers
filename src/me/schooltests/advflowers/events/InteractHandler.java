package me.schooltests.advflowers.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.schooltests.advflowers.AdvFlowers;
import me.schooltests.advflowers.Util;

public class InteractHandler implements Listener {

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerInteractEvent(BlockPlaceEvent e) {

		Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("AdvFlowers");

		Player player = (Player) e.getPlayer();

		if (e.getHand() == EquipmentSlot.OFF_HAND)
			return;

		int slot = player.getInventory().getHeldItemSlot();
		
		ItemStack item = player.getInventory().getItem(slot);

		if (item == null)
			return;

		if (item.getType() == Material.FLOWER_POT_ITEM) {
			if (item.getItemMeta().getLore() != null) {

				if (!e.isCancelled()) {

					plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

						@Override
						public void run() {
							String id = item.getItemMeta().getLore().get(1);
							id = id.replaceAll(ChatColor.GOLD + "ID: ", ChatColor.RESET + "");
							id = ChatColor.stripColor(id);
							e.getBlock().setType(Material.AIR, false);
							Util.growCustomFlower(AdvFlowers.pots.get(id), e.getBlockPlaced().getLocation(), player);

						}
					}, 1L);

				}
			}

		}

	}

}
