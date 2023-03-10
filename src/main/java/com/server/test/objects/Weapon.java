package com.server.test.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

import static com.server.test.utilities.makeasWeapon;

public class Weapon {
    private final ItemStack item;

    public Weapon(ItemStack stack,
                  List<String> lore,
                  String display,
                  String model,
                  Integer clipsize,
                  Integer ammotype,
                  Integer soundtype,
                  Integer damage) {
        this.item = makeasWeapon(stack, lore, display, model, clipsize, ammotype, soundtype, damage);
    }
    public void givetoplayer(Player p){
        p.getInventory().addItem(item);
    }
}
