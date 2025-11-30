package org.elpepe.pruebahola;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ITEMRANDOM implements Listener {

    @EventHandler
    public void alRomper(BlockBreakEvent e) {
        e.setDropItems(false);
        Material[] listaMateriales = Material.values();
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(listaMateriales.length);
        Material materialGanador = listaMateriales[indice];
        if (!materialGanador.isItem() || materialGanador == Material.AIR) {
            return;
        }
        e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(materialGanador)
        );
    }
}