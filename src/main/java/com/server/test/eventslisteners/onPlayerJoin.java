package com.server.test.eventslisteners;

import com.server.test.test;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataType;

import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class onPlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        NamespacedKey key = new NamespacedKey(getPlugin(test.class), "deathcounter");
        Player p = event.getPlayer();
        if(p.getPersistentDataContainer().get(key, PersistentDataType.INTEGER) == null){
            p.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, 0);
        }
    }
}
