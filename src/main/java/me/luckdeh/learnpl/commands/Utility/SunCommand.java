package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SunCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){
            p.performCommand("weather clear");
            p.sendMessage(ChatColor.GREEN + "Weather has been set to sun.");
        }


        return true;
    }
}
