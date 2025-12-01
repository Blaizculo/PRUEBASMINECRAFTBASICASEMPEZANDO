package org.elpepe.pruebahola;


import org.bukkit.plugin.java.JavaPlugin;

public final class Pruebahola extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("Enabling plugin");
        getServer().getPluginManager().registerEvents(new EVENTOINICIAR(), this);
        getServer().getPluginManager().registerEvents(new EVENTOSLIMEQUEMAR(),this);
        getCommand("volar").setExecutor(new Comandodevolar());
        getServer().getPluginManager().registerEvents(new LANASALTO(),this);
        getServer().getPluginManager().registerEvents(new AZADAORO(),this);
        getServer().getPluginManager().registerEvents(new ITEMRANDOM(),this);
        getServer().getPluginManager().registerEvents(new FlechasExplosivas(),this);
        getServer().getPluginManager().registerEvents(new VAMPIRISMO(),this);
    }


    @Override
    public void onDisable() {

    }
}
