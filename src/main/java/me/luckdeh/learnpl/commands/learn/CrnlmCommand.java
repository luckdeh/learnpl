package me.luckdeh.learnpl.commands.learn;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CrnlmCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player p) {
            p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "i like hamburgers.");
            p.performCommand("give @p bread");
        }

        return true;
    }
}


