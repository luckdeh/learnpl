package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player p){
            if(args.length == 0){
                if (p.isInvisible()){
                    p.setInvisible(false);
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Vanish mode" + ChatColor.RED + "" + ChatColor.BOLD + " disabled.");
            }else{
                    p.setInvisible(true);
                    p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Vanish mode" + ChatColor.GREEN + "" + ChatColor.BOLD + " enabled");
                }
            } else if (args.length == 1) {
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("That player is not online.");

                }else{
                    if (target.isInvisible()){
                        target.setInvisible(false);
                        target.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Vanish mode" + ChatColor.RED + "" + ChatColor.BOLD + " disabled.");
                    }else{
                        target.setInvisible(true);
                        target.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Vanish mode" + ChatColor.GREEN + "" + ChatColor.BOLD + " enabled");
                    }

                }

        }

        return true;
    }

        return true;
    }
}
