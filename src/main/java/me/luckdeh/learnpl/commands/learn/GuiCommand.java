package me.luckdeh.learnpl.commands.learn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {


        if (sender instanceof Player){
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Custom GUI");

            ItemStack suicide =  new ItemStack(Material.TNT);
            ItemStack feed = new ItemStack(Material.BREAD);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

            ItemMeta suicide_meta = suicide.getItemMeta();
            suicide_meta.setDisplayName(ChatColor.RED + "Suicide");
            ArrayList<String> suicide_lore = new ArrayList<>();
            suicide_lore.add(ChatColor.GOLD + "Kill yourself !");
            suicide_meta.setLore(suicide_lore);
            suicide.setItemMeta(suicide_meta);

            ItemMeta feed_meta = feed.getItemMeta();
            feed_meta.setDisplayName(ChatColor.GOLD + "Food");
            ArrayList<String> feed_lore = new ArrayList<>();
            feed_lore.add(ChatColor.GOLD + "restore your hunger!!!");
            feed_meta.setLore(feed_lore);
            feed.setItemMeta(feed_meta);

            ItemMeta sword_meta = sword.getItemMeta();
            sword_meta.setDisplayName(ChatColor.AQUA + "Sword");
            ArrayList<String> sword_lore = new ArrayList<>();
            sword_lore.add(ChatColor.RED + "Slice someones neck open with this!!!");
            sword_meta.setLore(sword_lore);
            sword.setItemMeta(sword_meta);


            ItemStack[] menu_items = {suicide, feed, sword};
            gui.setContents(menu_items);
            player.openInventory(gui);


        }else{
            System.out.println("This command can only be executed by a player.");
        }


        return true;
    }
}
