package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player p){
            if (strings.length == 0){
                if (p.isFlying()){
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying" + ChatColor.RED + " disabled");
            }else {
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying" + ChatColor.RED + " enabled");
                }
            }else{
                String playerName = strings[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("That player is not online.");
            }else{
                    if (target.isFlying()){
                        target.setAllowFlight(false);
                        target.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying" + ChatColor.RED + " disabled");
                    }else {
                        target.setAllowFlight(true);
                        target.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Flying" + ChatColor.RED + " enabled");
                    }
                }

        }


        return true;
    }
        return true;
    }
}
