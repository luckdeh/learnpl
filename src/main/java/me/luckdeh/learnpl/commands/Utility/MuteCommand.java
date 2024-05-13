package me.luckdeh.learnpl.commands.Utility;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MuteCommand implements CommandExecutor {

    private final Learnpl plugin;

    public MuteCommand(Learnpl plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player p){
            if (args.length == 0){
                p.sendMessage(ChatColor.RED + "Please Provide An Argument!");
            } else if (args.length == 1) {
                String word = args[0];
                Player target = Bukkit.getPlayerExact(word);

                plugin.getConfig().isConfigurationSection("mutedPlayers." + word);
            }
        }


        return true;
    }
}
