package me.luckdeh.learnpl.commands.Gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdventureCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player p){
            p.setGameMode(GameMode.ADVENTURE);
            p.sendMessage(ChatColor.GREEN + "Gamemode set to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Adventure");


        }


        return true;
    }
}
