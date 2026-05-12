package net.kalbskinder.crumbEssentials;

import net.kalbskinder.helpers.Helpers;
import org.bukkit.plugin.java.JavaPlugin;

public final class CrumbEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        Helpers.initialize(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
