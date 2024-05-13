package me.luckdeh.learnpl.commands.Utility;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;
        ItemStack handItem = player.getInventory().getItemInMainHand();

        if (handItem == null || handItem.getType().isAir()) {
            player.sendMessage("You must be holding an item to use it as a hat.");
            return true;
        }

        ItemStack headItem = player.getInventory().getHelmet();
        player.getInventory().setHelmet(handItem);
        player.getInventory().setItemInMainHand(headItem);

        player.sendMessage("Your hat has been updated!");

        return true;
    }
}
