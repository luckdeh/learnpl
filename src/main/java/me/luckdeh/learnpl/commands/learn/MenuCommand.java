package me.luckdeh.learnpl.commands.learn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class MenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player p = (Player) sender;


        Inventory inventory = Bukkit.createInventory(p, 9, ChatColor.RED + "Monkey Exhibit");

        ItemStack item = new ItemStack(Material.BEEF, 16);
        inventory.addItem(item);

        ItemStack flower = new ItemStack(Material.OAK_BOAT, 1);
        ItemMeta flowerMeta = flower.getItemMeta();
        flowerMeta.setDisplayName("Sexy flower");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("This is the ");
        lore.add("coolest flower ");
        lore.add("on the planet");
        flowerMeta.setLore(lore);

        flowerMeta.addEnchant(Enchantment.DAMAGE_ALL, 3000, true);
        flower.setItemMeta(flowerMeta);

        inventory.setItem(3, flower);

        p.openInventory(inventory);

        return true;
    }
}
