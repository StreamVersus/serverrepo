package com.server.test.eventslisteners;

import com.server.test.test;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class onPlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event){
        NamespacedKey key = new NamespacedKey(getPlugin(test.class), "deathcounter");
        Player p = event.getPlayer();
        PersistentDataContainer container = p.getPersistentDataContainer();
        int death = container.get(key, PersistentDataType.INTEGER);
        p.sendMessage(String.valueOf(death));
        p.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, death+1);
    }
}
