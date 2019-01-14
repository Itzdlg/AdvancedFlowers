package me.schooltests.advflowers.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.schooltests.advflowers.GUI;

public class CreateFlower implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			GUI.open_CreateFlower(player, 1);
			
		}
		
		return true;
	}
	
}
