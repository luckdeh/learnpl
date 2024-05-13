package me.luckdeh.learnpl.listeners;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {


    private final Learnpl plugin;

    public JoinListener(Learnpl plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

        String joinMessage = this.plugin.getConfig().getString("join-message");
        if (joinMessage != null){
            joinMessage = joinMessage.replace("%player%", e.getPlayer().getDisplayName());
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', joinMessage));
        }

        boolean feedPlayers = this.plugin.getConfig().getBoolean("feed-players");
        if(feedPlayers){
            e.getPlayer().setFoodLevel(20);
        }



    }
}
