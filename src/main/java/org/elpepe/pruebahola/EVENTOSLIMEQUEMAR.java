package org.elpepe.pruebahola;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;


public class EVENTOSLIMEQUEMAR implements Listener {
    @EventHandler
    public void quemarSlime(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Block b=p.getLocation().subtract(0, 1, 0).getBlock();
        if(b.getType()== Material.SLIME_BLOCK){
            p.addPotionEffect(new PotionEffect(PotionEffectType.POISON,100,1));
        }
    }
}
