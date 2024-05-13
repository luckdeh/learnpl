package me.luckdeh.learnpl.commands.learn;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final Learnpl plugin;

    public SpawnCommand(Learnpl plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p) {

            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                p.teleport(location);

                p.sendMessage("You have been teleported to spawn");
            }else{
                p.sendMessage("there is no spawn point set. do /setspawn to make a spawnpoint");
            }

        }


        return true;
    }
}
