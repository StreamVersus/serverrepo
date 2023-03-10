package com.server.test.eventslisteners;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class onPlayerInteract implements Listener {
    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event){
        Player p = event.getPlayer();
        ItemStack stack = event.getItem();
        if (stack == null) {
            return;
        }
        NBTItem nbt = new NBTItem(stack);
        //weapon instance
        if(nbt.getBoolean("Weapon")){
            if (event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)){
                p.sendMessage("shooting");
            }
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                p.sendMessage("reloading");
            }
        }
    }
}
