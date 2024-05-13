package me.luckdeh.learnpl.commands.Gamemode;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpectatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player p){
            if(args.length == 0){
                p.setGameMode(GameMode.SPECTATOR);
                p.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Spectator");
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("That player is not online.");
                }else{
                    p.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Spectator " + ChatColor.GREEN + "for " + ChatColor.GREEN + "" + ChatColor.BOLD + target.getDisplayName() + ".");
                    target.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Spectator");
                    target.setGameMode(GameMode.SPECTATOR);
                }

            }


        }


        return true;
    }
}
