package org.elpepe.pruebahola;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.event.EventHandler;
import org.bukkit.potion.PotionEffectType;

import java.io.Serializable;

public class LANASALTO implements Listener {
    @EventHandler
    public void saltolana(PlayerMoveEvent e) {

        Player p = e.getPlayer();
        if(!p.getAllowFlight()){
        Block b = p.getLocation().subtract(0, 1, 0).getBlock();
        if(b.getType() == Material.RED_WOOL){
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 100, 10));
        }
        }
    }
}
