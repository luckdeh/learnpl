package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RulesCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){
            p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "                  RULES");
            p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "1." + ChatColor.GREEN + " No exploiting/cheating/abusing glitches.");
            p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "2." + ChatColor.GREEN + " No discimination/racism or hate towards groups.");
            p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "3." + ChatColor.GREEN + " No Hacking.");
        }


        return true;
    }
}
