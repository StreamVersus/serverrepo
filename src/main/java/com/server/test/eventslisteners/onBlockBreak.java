package com.server.test.eventslisteners;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class onBlockBreak implements Listener {
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event){
        NBTItem nbt = new NBTItem(event.getPlayer().getInventory().getItemInMainHand());
        event.setCancelled(nbt.getBoolean("Weapon"));
    }
}
