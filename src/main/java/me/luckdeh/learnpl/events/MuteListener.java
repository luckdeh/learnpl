package me.luckdeh.learnpl.events;

import me.luckdeh.learnpl.Learnpl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MuteListener implements Listener{


    private final Learnpl plugin;

    public MuteListener(Learnpl plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMutedPlayer(AsyncPlayerChatEvent e){
        String mutedPlayers = plugin.getConfig().getStringList("mutedPlayers.").toString();

    }
}
