package me.schooltests.advflowers;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CreateItemStack {

    @SuppressWarnings("unchecked")
    public static ItemStack get(Material material, Object ... args) {
        int amount = 1;
        short durability = 0;
        String displayName = null;
        List<String> lore = null;
        for(Object arg : args) {
            if(arg instanceof Integer) {
                amount = (int) arg;
                continue;
            }
            if(arg instanceof Short) {
                durability = (short) arg;
                continue;
            }
            if(arg instanceof String) {
                displayName = (String) arg;
                continue;
            }
            lore = (List<String>) arg;
        }
        ItemStack item = new ItemStack(material, amount, durability);
        ItemMeta itemMeta = item.getItemMeta();
        if(displayName != null) itemMeta.setDisplayName(displayName);
        if(lore != null) itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        return item;
    }
    
}