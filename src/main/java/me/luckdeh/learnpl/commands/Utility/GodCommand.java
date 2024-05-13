package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.isInvulnerable()){
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "God mode" + ChatColor.RED + "" + ChatColor.BOLD + " disabled.");
            }else{
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "God mode" + ChatColor.GREEN + "" + ChatColor.BOLD + " enabled");
            }

        }
        
        return true;
    }
    
}
