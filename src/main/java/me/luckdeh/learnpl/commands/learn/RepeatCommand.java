package me.luckdeh.learnpl.commands.learn;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RepeatCommand implements CommandExecutor {

    // /repeat bob is really cool
    //["bob", "is", "really", "cool"]

    //args[0] - "bob"
    //args[1] - "is"

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player p) {

            if(args.length == 0){
                p.sendMessage("You did not provide any arguments. Try again");
                p.sendMessage("example: /repeat <msg>");
            }else if (args.length == 1){
                String word = args[0];

                p.sendMessage("Message: " + word);
            }else {
                StringBuilder builder = new StringBuilder();

                for(int i = 0; i < args.length; i++){
                    builder.append(args[i]);
                    builder.append(" ");
                }

                String finalMessage = builder.toString();
                finalMessage = finalMessage.stripTrailing();

                p.sendMessage("Your Message: " + finalMessage);
            }

        }

        return true;
    }
}
