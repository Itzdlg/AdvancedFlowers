package me.schooltests.advflowers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import me.schooltests.advflowers.ItemBuilder;

public class GUI {
	
	public static void open_CreateFlower(Player player, int page) {
		Inventory i = Bukkit.getServer().createInventory(null, 54, ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Create Flower");
		
		ItemStack GreenPane_Left = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 5).setName(ChatColor.GREEN + "< " + ChatColor.DARK_GREEN + "Plant Layers").build();
		ItemStack GreenPane_Right = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 5).setName(ChatColor.DARK_GREEN + "Plant Layers" + ChatColor.GREEN + " >").build();
		ItemStack Saplings = new ItemBuilder(Material.SAPLING).setName(ChatColor.GREEN + "Saplings/Leaves").build();
		ItemStack Flowers = new ItemBuilder(Material.RED_ROSE).setName(ChatColor.LIGHT_PURPLE + "Flowers").build();
		ItemStack DoublePlants = new ItemBuilder(Material.DOUBLE_PLANT, 1, (byte) 4).setName(ChatColor.YELLOW + "Double Plants").build();
		ItemStack Misc = new ItemBuilder(Material.CACTUS).setName(ChatColor.DARK_AQUA + "Misc").build();
		ItemStack Category = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setName(ChatColor.DARK_AQUA + "^ " + ChatColor.GRAY + "Categories" + ChatColor.DARK_AQUA + " ^").build();
		ItemStack EmptyGlass = new ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 7).setName(ChatColor.RED + "").build();
		ItemStack ResetLayers = new ItemBuilder(Material.INK_SACK, 1, (byte) 1).setName(ChatColor.RED + "Reset").setLore("", ChatColor.GRAY + "Clear all layers and start over").build();
		ItemStack MinusLayers = new ItemBuilder(Material.INK_SACK, 1, (byte) 11).setName(ChatColor.YELLOW + "Remove 1 Layer").setLore("", ChatColor.GRAY + "Remove the top layer").build();
		ItemStack CreateLayers = new ItemBuilder(Material.INK_SACK, 1, (byte) 7).setName(ChatColor.GREEN + "Create Flower").setLore("", ChatColor.GRAY + "Receive your custom flower").addUnsafeEnchant(Enchantment.KNOCKBACK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).build();
		ItemStack Close = new ItemBuilder(Material.BARRIER).setName(ChatColor.RED + "Exit Menu").build();
		
		i.setItem(0, GreenPane_Right);
		i.setItem(2, GreenPane_Left);
		i.setItem(4, Saplings);
		i.setItem(5, Flowers);
		i.setItem(6, DoublePlants);
		i.setItem(7, Misc);
		i.setItem(9, GreenPane_Right);
		i.setItem(11, GreenPane_Left);
		i.setItem(12, Category);
		i.setItem(13, Category);
		i.setItem(14, Category);
		i.setItem(15, Category);
		i.setItem(16, Category);
		i.setItem(17, Category);
		i.setItem(18, GreenPane_Right);
		i.setItem(20, GreenPane_Left);
		i.setItem(27, GreenPane_Right);
		i.setItem(29, GreenPane_Left);
		i.setItem(36, GreenPane_Right);
		i.setItem(38, GreenPane_Left);
		i.setItem(39, EmptyGlass);
		i.setItem(40, EmptyGlass);
		i.setItem(41, EmptyGlass);
		i.setItem(42, EmptyGlass);
		i.setItem(43, EmptyGlass);
		i.setItem(44, EmptyGlass);
		i.setItem(45, GreenPane_Right);
		i.setItem(47, GreenPane_Left);
		i.setItem(49, ResetLayers);
		i.setItem(50, MinusLayers);
		i.setItem(51, CreateLayers);
		i.setItem(53, Close);
		
		player.openInventory(i);
	}

}