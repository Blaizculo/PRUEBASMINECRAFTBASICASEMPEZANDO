package org.elpepe.pruebahola;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class EVENTOINICIAR  implements Listener {
    @EventHandler
    public void cuandoentrar(PlayerJoinEvent e) {
        Player p=e.getPlayer();
        p.sendMessage(ChatColor.BLUE+""+ChatColor.BOLD+"Bienvenido al server "+p.getName());
        ItemStack item=new ItemStack(Material.DIAMOND,100);
        p.getInventory().addItem(item);
        p.playSound(p.getLocation(), org.bukkit.Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);

    }

}
