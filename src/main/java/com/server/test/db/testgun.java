package com.server.test.db;

import com.server.test.objects.Weapon;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

import static com.server.test.utilities.createitemstack;

public class testgun {
    public static Weapon testgunWeapon(){
        List<String> lore = new ArrayList<>();
        lore.add("Тестовый плейсхолдер");
        lore.add("Использует AmmoPlaceHolder");
        lore.add("Если нашли этот предмет, обратитесь к администрации");
        Weapon testwp = new Weapon(createitemstack(), lore, "testgun", "testgun", 10, 0, 0);
        Bukkit.getServer().getConsoleSender().sendMessage("testgun");
        return testwp;
    }
}
