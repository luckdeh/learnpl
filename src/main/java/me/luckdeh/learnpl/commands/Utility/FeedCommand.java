package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player p){
            if(args.length == 0){
                p.sendMessage(ChatColor.GREEN + " " +ChatColor.BOLD + "Food" + "" + ChatColor.GREEN + " is set to max!");
                p.setFoodLevel(20);
            }else{

                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("This player is not online.");
                }else{
                    p.sendMessage(ChatColor.GREEN + " " +ChatColor.BOLD + "Food" + "" + ChatColor.GREEN + " is set to max for " + target.getDisplayName() + "!");
                    target.sendMessage(ChatColor.GREEN + " " +ChatColor.BOLD + "Food" + "" + ChatColor.GREEN + " is set to max!");
                    target.setFoodLevel(20);
                }
            }


        }


        return true;
    }
}