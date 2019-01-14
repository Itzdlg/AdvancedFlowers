package me.schooltests.advflowers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemBuilder {
	
	private ItemStack is;
	
	public ItemBuilder(Material m) {
		this(m, 1);
	}
	
	public ItemBuilder(ItemStack is) {
		this.is = is;
	}
	
	public ItemBuilder(Material m, int amount) {
		is = new ItemStack(m, amount);
	}
	
	public ItemBuilder(Material m, int amount, byte durability) {
		is = new ItemStack(m, amount, durability);
	}
	
	public ItemBuilder clone() {
		return new ItemBuilder(is);
	}
	
	public ItemBuilder setAmount(int amount) {
		is.setAmount(amount);
		return this;
	}
	
	public ItemBuilder setDurability(short dur) {
		is.setDurability(dur);
		return this;
	}
	
	public ItemBuilder setName(String name) {
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(name);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder addUnsafeEnchant(Enchantment ench, int level) {
		is.addUnsafeEnchantment(ench, level);
		return this;
	}
	
	public ItemBuilder addEnchant(Enchantment ench, int level) {
		is.addEnchantment(ench, level);
		return this;
	}
	
	public ItemBuilder removeEnchant(Enchantment ench) {
		is.removeEnchantment(ench);
		return this;
	}
	
	@SuppressWarnings("deprecation")
	public ItemBuilder setSkullOwner(String owner) {
		try {
			SkullMeta im = (SkullMeta) is.getItemMeta();
			im.setOwner(owner);
			is.setItemMeta(im);
		} catch (ClassCastException ex) {}
		return this;
	}
	
	public ItemBuilder setUnbreakable() {
		ItemMeta im = is.getItemMeta();
		im.setUnbreakable(true);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder setLore(String ... args) {
		ItemMeta im = is.getItemMeta();
		im.setLore(Arrays.asList(args));
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder setLore(List<String> lore) {
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder addLore(String lore) {
		ItemMeta im = is.getItemMeta();
		List<String> lores = new ArrayList<>();
		if(im.hasLore()) lores = new ArrayList<>(im.getLore());
		lores.add(lore);
		im.setLore(lores);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder addFlag(ItemFlag flag) {
		ItemMeta im = is.getItemMeta();
		im.addItemFlags(flag);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder removeFlag(ItemFlag flag) {
		ItemMeta im = is.getItemMeta();
		im.removeItemFlags(flag);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemBuilder addLore(String lore, int pos) {
		ItemMeta im = is.getItemMeta();
		List<String> lores = new ArrayList<>(im.getLore());
		lores.set(pos, lore);
		im.setLore(lores);
		is.setItemMeta(im);
		return this;
	}
	
	public ItemStack build() {
		return is;
	}
	
	
	
}
