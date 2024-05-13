package me.luckdeh.learnpl.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Custom GUI")){

        switch(e.getCurrentItem().getType()){
            case TNT:
                player.closeInventory();
                player.setHealth(0.0);
                player.sendMessage("You just kiled yourself.");
                break;
            case BREAD:
                player.closeInventory();
                player.setFoodLevel(20);
                player.sendMessage("You just filled your hunger.");
                break;
            case DIAMOND_SWORD:
                player.closeInventory();
                player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                player.sendMessage("Slice someones neck please!!!");
                break;
        }

        e.setCancelled(true);
        }
    }
}
