package me.luckdeh.learnpl.commands.learn;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class Learn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /die - kills the player :o
        if (command.getName().equalsIgnoreCase("die")){

            if (sender instanceof Player p){

                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "U killed urself💀");

            } else if (sender instanceof ConsoleCommandSender) {

                System.out.println("The command was run by the console.");

            } else if (sender instanceof BlockCommandSender) {

                System.out.println("The command was run by a command block");

            }

        }else if (command.getName().equalsIgnoreCase("poop")){


        }

        return false;
    }
}

