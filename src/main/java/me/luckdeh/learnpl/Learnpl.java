package me.luckdeh.learnpl;
import me.luckdeh.learnpl.commands.Gamemode.CreativeCommand;
import me.luckdeh.learnpl.commands.Gamemode.SpectatorCommand;
import me.luckdeh.learnpl.commands.Gamemode.SurvivalCommand;
import me.luckdeh.learnpl.commands.Utility.*;
import me.luckdeh.learnpl.commands.learn.*;
import me.luckdeh.learnpl.events.ClickEvent;
import me.luckdeh.learnpl.listeners.*;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class Learnpl extends JavaPlugin implements Listener {

    static Learnpl instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Learnpl.instance = this;
        saveDefaultConfig();

        getCommand("hat").setExecutor(new HatCommand());
        getCommand("tpo").setExecutor(new TpoCommand());
        getCommand("sun").setExecutor(new SunCommand());
        getCommand("gui").setExecutor(new GuiCommand());
        getCommand("enderchest").setExecutor(new EnderChestPeakCommand());
        getCommand("invsee").setExecutor(new InvseeCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("demoscreen").setExecutor(new DemoScreenCommand());
        getCommand("rules").setExecutor(new RulesCommand());
        getCommand("clearlag").setExecutor(new ClearGroundItemsCommand());
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("gmsp").setExecutor(new SpectatorCommand());
        getCommand("gms").setExecutor(new SurvivalCommand());
        getCommand("gmc").setExecutor(new CreativeCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());


        getCommand("menu").setExecutor(new MenuCommand());
        getCommand("setmessage").setExecutor(new SetMessageCommand(this));
        getCommand("fart").setExecutor(new FartCommand());
        getCommand("repeat").setExecutor(new RepeatCommand());
        getCommand("Pray").setExecutor(new DidYouPrayCommand());
        getCommand("crnlm").setExecutor(new CrnlmCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("die").setExecutor(new Learn());




        getServer().getPluginManager().registerEvents(new ClickEvent(),this);
        getServer().getPluginManager().registerEvents(new JoinListener(this),this);
        getServer().getPluginManager().registerEvents(new SpawnListeners(this), this);
        getServer().getPluginManager().registerEvents(new XPBottleBreakListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        new DelayedTask(this);






        ItemStack CheeseWand = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta cheeseWandMeta = CheeseWand.getItemMeta();
        cheeseWandMeta.setDisplayName(ChatColor.YELLOW + "Cheese wand!");
        cheeseWandMeta.setLore(List.of(ChatColor.GREEN + "shoot cheese"));
        cheeseWandMeta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        CheeseWand.setItemMeta(cheeseWandMeta);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "Cheese rod"), CheeseWand);
        recipe.shape("  X", " B ", "B  ");
        recipe.setIngredient('X', Material.GOLD_BLOCK);
        recipe.setIngredient('B', Material.BLAZE_ROD);






    }

}


