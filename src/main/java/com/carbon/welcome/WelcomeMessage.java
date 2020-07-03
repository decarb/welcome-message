package com.carbon.welcome;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeMessage extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Welcome message enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Welcome message disabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent join) {
        Player them = join.getPlayer();
        them.sendMessage(this.getConfig().getString("message"));
    }
}
