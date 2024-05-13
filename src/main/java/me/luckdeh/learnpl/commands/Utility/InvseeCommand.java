package me.luckdeh.learnpl.commands.Utility;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if(commandSender instanceof Player p){
            if(args.length == 0){
                p.sendMessage("You cannot open your own inv.");
            }else{

                String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("This player is not online.");
                    p.openInventory(target.getInventory());
                }else{
                    p.openInventory(target.getInventory());

                }
            }


        }


        return true;
    }
}
