package me.luckdeh.learnpl.commands.learn;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final Learnpl plugin;

    public SetSpawnCommand(Learnpl plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){

            Location location = p.getLocation();


            plugin.getConfig().set("spawn", location);

            plugin.saveConfig();

            p.sendMessage("Spawn location set");


        }else{
            System.out.println("Bro get yo ass on the server");
        }


        return true;
    }
}
