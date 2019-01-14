package me.schooltests.advflowers;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Util {

	private static Material parseMaterial(ItemStack item) {

		if (item.getType() == Material.REDSTONE) {
			return Material.REDSTONE_WIRE;
		} else if (item.getType() == Material.BEETROOT_SEEDS) {
			return Material.BEETROOT_BLOCK;
		} else if (item.getType() == Material.PUMPKIN_SEEDS) {
			return Material.PUMPKIN_STEM;
		} else if (item.getType() == Material.WHEAT || item.getType() == Material.SEEDS){
			return Material.CROPS;
		} else {
			return item.getType();
		}

	}

	@SuppressWarnings("deprecation")
	private static Byte parseData(ItemStack item) {

		if (item.getType() == Material.SEEDS) {
			return (byte) 1;
		} else if (item.getType() == Material.BEETROOT_SEEDS) {
			return (byte) 3;
		} else if (item.getType() == Material.PUMPKIN_SEEDS) {
			return (byte) 7;
		} else if (item.getType() == Material.WHEAT){
			return (byte) 7;
		} else {
			return item.getData().getData();
		}

	}
	
	public static boolean preventBlockPhysics;

	@SuppressWarnings("deprecation")
	public static void growCustomFlower(List<ItemStack> items, Location location, Player player) {
		try {
			preventBlockPhysics = true;
			int count = 0;
			for (ItemStack loop : items) {
				Location loc = location.clone();
				loc.add(0, count, 0);
				if (loc.getBlock().getType() == Material.AIR) {
					loc.getBlock().setType(parseMaterial(loop), false);
					loc.getBlock().setData(parseData(loop));
				}
				count++;
			}
			preventBlockPhysics = false;
		} catch (Exception e) {

		}
	}

	public static int findOpenLayer(Inventory i) {
		List<Integer> slots = Arrays.asList(46, 37, 28, 19, 10, 1);
		for (int loop : slots) {
			if (i.getItem(loop) == null) {
				return loop;
			}
		}
		return 1;
	}

	public static int findLastLayer(Inventory i) {
		if (i.getItem(46) == null) {
			return 46;
		} else if (i.getItem(37) == null) {
			return 46;
		} else if (i.getItem(28) == null) {
			return 37;
		} else if (i.getItem(19) == null) {
			return 28;
		} else if (i.getItem(10) == null) {
			return 19;
		} else if (i.getItem(1) == null) {
			return 10;
		}

		return 1;

	}

}
