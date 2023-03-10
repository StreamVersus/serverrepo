package com.server.test.eventslisteners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataType;

import static com.server.test.utilities.getPDCData;
import static com.server.test.utilities.setPDCData;

public class onPlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        Player p = event.getPlayer();
        if(getPDCData("deathcounter", p, PersistentDataType.INTEGER) == null){
            setPDCData("deathcounter", p, 0);
        }
    }
}
