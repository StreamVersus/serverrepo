package com.server.test;

import com.server.test.db.testgun;
import com.server.test.eventslisteners.onPlayerDeath;
import com.server.test.eventslisteners.onPlayerJoin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class test extends JavaPlugin{
    public static Plugin plugin;
    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new onPlayerDeath(), plugin);
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), plugin);
        registering();
    }
    @Override
    public void onDisable() { }
    public static void registering(){
        new testgun();
    }
}
