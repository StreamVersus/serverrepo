package com.server.test.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

import static com.server.test.utilities.makeasWeapon;

public class Weapon {

    private final String display;
    private final ItemStack stack;
    private final List<String> lore;
    private final String model;
    private final Integer clipsize;
    private final Integer ammotype;
    private final Integer soundtype;
    private final Integer damage;

    public Weapon(ItemStack stack,
                  List<String> lore,
                  String display,
                  String model,
                  Integer clipsize,
                  Integer ammotype,
                  Integer soundtype,
                  Integer damage) {
        this.stack = stack;
        this.lore = lore;
        this.display = display;
        this.model = model;
        this.clipsize = clipsize;
        this.ammotype = ammotype;
        this.soundtype = soundtype;
        this.damage = damage;
        makeasWeapon(stack, lore, display, model, clipsize, ammotype, soundtype, damage);
    }
    public void givetoplayer(Player p){
        p.getInventory().addItem(stack);
    }
}
