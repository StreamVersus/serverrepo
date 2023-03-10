package com.server.test;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

import static com.server.test.test.plugin;

public class utilities {
    public static Object getPDCData(String namekey, Player p, PersistentDataType<Integer, Integer> type) {
        NamespacedKey key = new NamespacedKey(plugin, namekey);
        return p.getPersistentDataContainer().get(key, type);
    }
    public static void setPDCData(String namekey, Player p, Integer content) {
        NamespacedKey key = new NamespacedKey(plugin, namekey);
        p.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, content);
    }
    public static void setPDCData(String namekey, Player p, String content) {
        NamespacedKey key = new NamespacedKey(plugin, namekey);
        p.getPersistentDataContainer().set(key, PersistentDataType.STRING, content);
    }
    public static void setPDCData(String namekey, ItemMeta p, Integer content) {
        NamespacedKey key = new NamespacedKey(plugin, namekey);
        p.getPersistentDataContainer().set(key, PersistentDataType.INTEGER, content);
    }
    public static void setPDCData(String namekey, ItemMeta p, String content) {
        NamespacedKey key = new NamespacedKey(plugin, namekey);
        p.getPersistentDataContainer().set(key, PersistentDataType.STRING, content);
    }
    @SuppressWarnings("deprecation")
    public static ItemStack makeasWeapon(
            ItemStack stack,
            List<String> lore,
            String display,
            String model,
            Integer clipsize,
            Integer ammotype,
            Integer soundtype,
            Integer damage){
        ItemMeta meta  = stack.getItemMeta();


        meta.setUnbreakable(true);
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.BLUE + display);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
        // setting pdc tags
        setPDCData("clipsize", meta, clipsize);
        setPDCData("ammo", meta, 0);
        setPDCData("ammotype", meta, ammotype);
        setPDCData("soundtype", meta, soundtype);
        setPDCData("damage", meta, damage);
        NBTItem nbti = new NBTItem(stack);
        nbti.setBoolean("Weapon", true);
        nbti.setString("model", model);
        stack.setItemMeta(meta);
        return nbti.getItem();
    }
    public static ItemStack createitemstack(){
        return new ItemStack(Material.WOODEN_SWORD);
    }

}
