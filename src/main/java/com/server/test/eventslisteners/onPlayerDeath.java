package com.server.test.eventslisteners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataType;

import static com.server.test.utilities.getPDCData;
import static com.server.test.utilities.setPDCData;

public class onPlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent event){
        Player p = event.getPlayer();
        int death = (int) getPDCData("deathcounter", p, PersistentDataType.INTEGER);
        p.sendMessage(String.valueOf(death));
        setPDCData("deathcounter", p, death+1);
    }
}
