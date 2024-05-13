package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player p) {
            if(args.length == 0){
                p.setHealth(20);
                p.sendMessage(ChatColor.RED+ "" + ChatColor.BOLD + "Health " + ChatColor.GREEN + "Has been restored");
            }else{
                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("This player is not online.");
                }else{
                    p.sendMessage(ChatColor.RED+ "" + ChatColor.BOLD + "Health " + ChatColor.GREEN + "Has been restored for " + target.getDisplayName() + ".");
                    target.sendMessage(ChatColor.RED+ "" + ChatColor.BOLD + "Health " + ChatColor.GREEN + "Has been restored.");
                    target.setHealth(20);
                }

            }
        }

        return true;
    }
}
