package me.schooltests.advflowers.events;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import me.schooltests.advflowers.AdvFlowers;
import me.schooltests.advflowers.ItemBuilder;
import me.schooltests.advflowers.Util;

public class InventoryHandler implements Listener {
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {

		Player player = (Player) event.getWhoClicked();
		Inventory open = event.getClickedInventory();
		ItemStack item = event.getCurrentItem();
		if (open == null) {
			return;
		}
		if (open.getName().equals(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Create Flower")) {
			event.setCancelled(true);
			int slot = event.getSlot();
			if (slot == 4) {
				
				ItemStack OakSapling = new ItemBuilder(Material.SAPLING, 1).setName(ChatColor.GREEN + "Oak Sapling").build();
				ItemStack SpruceSapling = new ItemBuilder(Material.SAPLING, 1, (byte) 1).setName(ChatColor.GREEN + "Spruce Sapling").build();
				ItemStack BirchSapling = new ItemBuilder(Material.SAPLING, 1, (byte) 2).setName(ChatColor.GREEN + "Birch Sapling").build();
				ItemStack JungleSapling = new ItemBuilder(Material.SAPLING, 1, (byte) 3).setName(ChatColor.GREEN + "Jungle Sapling").build();
				ItemStack AcaciaSapling = new ItemBuilder(Material.SAPLING, 1, (byte) 4).setName(ChatColor.GREEN + "Acacia Sapling").build();
				ItemStack DarkOakSapling = new ItemBuilder(Material.SAPLING, 1, (byte) 5).setName(ChatColor.GREEN + "Dark Oak Sapling").build();
				ItemStack OakLeaves = new ItemBuilder(Material.LEAVES).setName(ChatColor.GREEN + "Oak Leaves").build();
				ItemStack SpruceLeaves = new ItemBuilder(Material.LEAVES, 1, (byte) 1).setName(ChatColor.GREEN + "Spruce Leaves").build();
				ItemStack BirchLeaves = new ItemBuilder(Material.LEAVES, 1, (byte) 2).setName(ChatColor.GREEN + "Birch Leaves").build(); 
				ItemStack JungleLeaves = new ItemBuilder(Material.LEAVES, 1, (byte) 3).setName(ChatColor.GREEN + "Jungle Leaves").build();
				ItemStack AcaciaLeaves = new ItemBuilder(Material.LEAVES_2).setName(ChatColor.GREEN + "Acacia Leaves").build();
				ItemStack DarkOakLeaves = new ItemBuilder(Material.LEAVES_2, 1, (byte) 1).setName(ChatColor.GREEN + "Dark Oak Leaves").build();
				
				open.setItem(21, OakSapling);
				open.setItem(22, SpruceSapling);
				open.setItem(23, BirchSapling);
				open.setItem(24, JungleSapling);
				open.setItem(25, AcaciaSapling);
				open.setItem(26, DarkOakSapling);
				open.setItem(30, OakLeaves);
				open.setItem(31, SpruceLeaves);
				open.setItem(32, BirchLeaves);
				open.setItem(33, JungleLeaves);
				open.setItem(34, AcaciaLeaves);
				open.setItem(35, DarkOakLeaves);
				
			} else if (slot == 5) {
				
				ItemStack Dandelion = new ItemBuilder(Material.YELLOW_FLOWER).setName(ChatColor.LIGHT_PURPLE + "Dandelion").build();
				ItemStack RedRose = new ItemBuilder(Material.RED_ROSE).setName(ChatColor.LIGHT_PURPLE + "Poppy").build();
				ItemStack Orchid = new ItemBuilder(Material.RED_ROSE, 1, (byte) 1).setName(ChatColor.LIGHT_PURPLE + "Blue Orchid").build();
				ItemStack Allium = new ItemBuilder(Material.RED_ROSE, 1, (byte) 2).setName(ChatColor.LIGHT_PURPLE + "Allium").build();
				ItemStack OxeyeDaisy = new ItemBuilder(Material.RED_ROSE, 1, (byte) 8).setName(ChatColor.LIGHT_PURPLE + "Oxeye Daisy").build();
				ItemStack Bluet = new ItemBuilder(Material.RED_ROSE, 1, (byte) 3).setName(ChatColor.LIGHT_PURPLE + "Azure Bluet").build();
				ItemStack RedTulip = new ItemBuilder(Material.RED_ROSE, 1, (byte) 4).setName(ChatColor.LIGHT_PURPLE + "Red Tulip").build();
				ItemStack OrangeTulip = new ItemBuilder(Material.RED_ROSE, 1, (byte) 5).setName(ChatColor.LIGHT_PURPLE + "Orange Tulip").build();
				ItemStack WhiteTulip = new ItemBuilder(Material.RED_ROSE, 1, (byte) 6).setName(ChatColor.LIGHT_PURPLE + "White Tulip").build();
				ItemStack PinkTulip = new ItemBuilder(Material.RED_ROSE, 1, (byte) 7).setName(ChatColor.LIGHT_PURPLE + "Pink Tulip").build();
				ItemStack Grass = new ItemBuilder(Material.LONG_GRASS, 1, (byte) 1).setName(ChatColor.LIGHT_PURPLE + "Grass").build();
				ItemStack Fern = new ItemBuilder(Material.LONG_GRASS, 1, (byte) 2).setName(ChatColor.LIGHT_PURPLE + "Fern").build();
				
				open.setItem(21, Dandelion);
				open.setItem(22, RedRose);
				open.setItem(23, Orchid);
				open.setItem(24, Allium);
				open.setItem(25, OxeyeDaisy);
				open.setItem(26, Bluet);
				open.setItem(30, RedTulip);
				open.setItem(31, OrangeTulip);
				open.setItem(32, WhiteTulip);
				open.setItem(33, PinkTulip);
				open.setItem(34, Grass);
				open.setItem(35, Fern);
				
			} else if (slot == 6) {			
				ItemStack SunFlower = new ItemBuilder(Material.DOUBLE_PLANT, 1).setName(ChatColor.YELLOW + "Sunflower").build();
				ItemStack Lilac = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 1).setName(ChatColor.YELLOW + "Lilac").build();
				ItemStack RoseBush = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 4).setName(ChatColor.YELLOW + "Rose Bush").build();
				ItemStack Peony = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 5).setName(ChatColor.YELLOW + "Peony").build();
				ItemStack TallGrass = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 2).setName(ChatColor.YELLOW + "Tall Grass").build();
				ItemStack LargeFern = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 3).setName(ChatColor.YELLOW + "Large Fern").build();
				ItemStack air = new ItemBuilder(Material.AIR, 1).setName(ChatColor.YELLOW + "").build();
				
				open.setItem(21, SunFlower);
				open.setItem(22, Lilac);
				open.setItem(23, RoseBush);
				open.setItem(24, Peony);
				open.setItem(25, TallGrass);
				open.setItem(26, LargeFern);
				open.setItem(30, air);
				open.setItem(31, air);
				open.setItem(32, air);
				open.setItem(33, air);
				open.setItem(34, air);
				open.setItem(35, air);
			} else if (slot == 7) {
				ItemStack Cactus = new ItemBuilder(Material.CACTUS, 1).setName(ChatColor.DARK_AQUA + "Cactus").build();
				ItemStack DeadBush = new ItemBuilder(Material.DEAD_BUSH, 1).setName(ChatColor.DARK_AQUA + "Dead Bush").build();
				ItemStack Vines = new ItemBuilder(Material.VINE, 1).setName(ChatColor.DARK_AQUA + "Vines").build();
				ItemStack LilyPad = new ItemBuilder(Material.WATER_LILY, 1).setName(ChatColor.DARK_AQUA + "Lily Pad").build();
				ItemStack BrownMushroom = new ItemBuilder(Material.BROWN_MUSHROOM, 1).setName(ChatColor.DARK_AQUA + "Brown Mushroom").build();
				ItemStack RedMushroom = new ItemBuilder(Material.RED_MUSHROOM, 1).setName(ChatColor.DARK_AQUA + "Red Mushroom").build();
				ItemStack Redstone = new ItemBuilder(Material.REDSTONE, 1).setName(ChatColor.DARK_AQUA + "Redstone Dust").build();
				ItemStack Seeds = new ItemBuilder(Material.SEEDS, 1).setName(ChatColor.DARK_AQUA + "Seeds").build();
				ItemStack Wheat = new ItemBuilder(Material.WHEAT, 1).setName(ChatColor.DARK_AQUA + "Wheat").build();
				ItemStack Pumpkin = new ItemBuilder(Material.PUMPKIN_SEEDS, 1).setName(ChatColor.DARK_AQUA + " Grown Pumpkin Stem").build();
				ItemStack Beetroot = new ItemBuilder(Material.BEETROOT_SEEDS, 1).setName(ChatColor.DARK_AQUA + "Grown Beetroot").build();
				ItemStack air = new ItemBuilder(Material.AIR, 1).setName(ChatColor.DARK_AQUA + "").build();
				
				open.setItem(21, Cactus);
				open.setItem(22, DeadBush);
				open.setItem(23, Vines);
				open.setItem(24, LilyPad);
				open.setItem(25, BrownMushroom);
				open.setItem(26, RedMushroom);
				open.setItem(30, Redstone);
				open.setItem(31, Seeds);
				open.setItem(32, Wheat);
				open.setItem(33, Pumpkin);
				open.setItem(34, Beetroot);
				open.setItem(35, air);
			} else if (slot > 20 && slot < 36) {
				open.setItem(Util.findOpenLayer(open), item);
			} else if (slot == 49) {
				List<Integer> slots = Arrays.asList(46, 37, 28, 19, 10, 1);
				ItemStack air = new ItemBuilder(Material.AIR, 1).setName("").build();
				for(int loop : slots) {
					open.setItem(loop, air);
				}
			} else if (slot == 50) {
				ItemStack air = new ItemBuilder(Material.AIR, 1).setName("").build();
				open.setItem(Util.findLastLayer(open), air);
			} else if (slot == 51) {
				List<Integer> slots = Arrays.asList(46, 37, 28, 19, 10, 1);
				List<ItemStack> items = new ArrayList<>();
				for(int loop : slots) {
					if(open.getItem(loop) != null) items.add(open.getItem(loop));
				}
				if(!items.isEmpty()) {
					int id = (int) Math.floor(Math.random() * 999999);
					String id2 = Integer.toString(id);
					ItemStack pot = new ItemBuilder(Material.FLOWER_POT_ITEM)
							.setName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Custom Flower")
							.setLore("", ChatColor.GOLD + "ID: " + id2)
							.addUnsafeEnchant(Enchantment.KNOCKBACK, 1)
							.addFlag(ItemFlag.HIDE_ENCHANTS)
							.build();
					player.getInventory().addItem(pot);
					AdvFlowers.pots.put(id2, items);
					player.closeInventory();
				}
			} else if (item.getType() == Material.BARRIER) {
				player.closeInventory();
			}
				
		}
	}

}

