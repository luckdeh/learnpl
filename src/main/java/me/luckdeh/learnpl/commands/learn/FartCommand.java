package me.luckdeh.learnpl.commands.learn;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player p){
            if(args.length == 0){
                p.sendMessage("You are so nasty, u just farted over urself.");
                p.setHealth(0.0);
            }else{

               String playerName = args[0];
                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null){
                    p.sendMessage("This player is not online.");
                }else{

                    p.sendMessage("You just farted on " + target.getDisplayName());
                    target.sendMessage("You have just been farted on by " + p.getDisplayName() + ". How does that make u feel.");
                    target.setHealth(0.0);

                }
            }


        }


        return true;
    }
}
