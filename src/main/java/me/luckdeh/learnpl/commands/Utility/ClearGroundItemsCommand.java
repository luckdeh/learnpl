package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearGroundItemsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){
            p.performCommand("kill @e[type=item]");
            p.sendMessage(ChatColor.GREEN + "You have now succesfully cleared all ground items!");
        }


        return true;
    }
}
