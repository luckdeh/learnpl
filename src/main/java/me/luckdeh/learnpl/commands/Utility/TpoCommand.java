package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player p) {
            if (args.length == 0) {
                p.sendMessage("You need to set an arg to tpo to.");
            } else {

                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if (target == null) {
                    p.sendMessage("This player is not online.");
                }else {
                    p.sendMessage(ChatColor.GREEN + "Tping to: " + target);
                    p.teleport(target);
                }
            }


            return true;
        }
        return false;
    }
}
