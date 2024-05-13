package me.luckdeh.learnpl.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Monkey Exhibit")){

            if(e.getCurrentItem() == null){
                return;
            }

            if(e.getCurrentItem().getType() == Material.OAK_BOAT){
                System.out.println("You clicked a boat");
            }else if (e.getCurrentItem().getType() == Material.BEEF){
                System.out.println("You didnt click on boat :( you click beef");
            }else{
                System.out.println("you didnt click on anythieng :( Sadly >:(");
            }
            e.setCancelled(true);
        }
    }
}
