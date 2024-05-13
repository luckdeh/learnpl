package me.luckdeh.learnpl.commands.Gamemode;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player p){
            if(args.length == 0){
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Survival");
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("That player is not online.");
                }else{
                    p.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Survival " + ChatColor.GREEN + "for " + ChatColor.GREEN + "" + ChatColor.BOLD + target.getDisplayName() + ".");
                    target.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Survival");
                    target.setGameMode(GameMode.SURVIVAL);
                }

            }


        }


        return true;
    }
}
