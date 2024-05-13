package me.luckdeh.learnpl.commands.learn;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SetMessageCommand implements CommandExecutor {


    private final Learnpl plugin;

    public SetMessageCommand(Learnpl plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (args.length > 0){
            StringBuilder message = new StringBuilder();
            for (int i = 0; i < args.length; i++){
                message.append(args[i] + " ");
            }

            this.plugin.getConfig().set("join-message", message.toString());
            this.plugin.saveConfig();

        }else{
            sender.sendMessage("you must provide a new message!");
        }


        return true;
    }
}
