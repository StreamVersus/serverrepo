package com.server.test;

import com.server.test.eventslisteners.onPlayerDeath;
import com.server.test.eventslisteners.onPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;
public final class test extends JavaPlugin{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onPlayerDeath(),this);
        getServer().getPluginManager().registerEvents(new onPlayerJoin(),this);
    }

    @Override
    public void onDisable() {

    }
}
