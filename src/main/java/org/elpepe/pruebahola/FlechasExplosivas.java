package org.elpepe.pruebahola;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class FlechasExplosivas implements Listener {
    @EventHandler
    public void flechasExplosivas(ProjectileHitEvent e) {
        Projectile p=e.getEntity();
        if(!(p.getShooter() instanceof Player)){
            return;
        }
        if(p instanceof Arrow){
            Location posicion = p.getLocation();
            p.getWorld().createExplosion(posicion, 4.0F, false, false);
            p.remove();

        }


    }
}
