package com.arterus.epicworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    public static Main get() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("EpicWorld yüklendi - Arterus kasabası başlıyor.");
    }

    @Override
    public void onDisable() {
        getLogger().info("EpicWorld kapandı.");
        instance = null;
    }
}
