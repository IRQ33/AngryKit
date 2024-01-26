package org.irq3.angrykit;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.irq3.angrykit.Commands.Kitcommand;

public final class AngryKit extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("kit").setExecutor(new Kitcommand());

    }
}
