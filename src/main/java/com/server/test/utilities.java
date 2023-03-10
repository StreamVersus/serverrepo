package com.server.test;

import de.tr7zw.nbtapi.NBTItem;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

import static com.server.test.test.plugin;

public class utilities {
    public static Object getPDCData(String namekey, Player p, PersistentDataType type) {
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
    @SuppressWarnings("deprecation")
    public static void makeasWeapon(ItemStack stack, List<String> lore, String display, String model){
        ItemMeta meta  = stack.getItemMeta();

        meta.setUnbreakable(true);
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.DARK_BLUE + display);
        // setting CIT nbt tag
        NBTItem nbt = new NBTItem(stack);
        nbt.setString("model", model);

        stack.setItemMeta(meta);
    }
}
