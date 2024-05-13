package me.luckdeh.learnpl.commands.learn;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){
            p.sendMessage(ChatColor.GOLD + "Discord link:" + ChatColor.BLUE + " https://discord.gg/uuxnxmu6Sb");
        }


        return true;
    }
}
