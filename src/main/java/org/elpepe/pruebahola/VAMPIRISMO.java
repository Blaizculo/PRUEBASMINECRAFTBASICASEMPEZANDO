package org.elpepe.pruebahola;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class VAMPIRISMO implements Listener {
    @EventHandler
    public void pegar(EntityDamageByEntityEvent e) {
        Player atacante=null;
        if (e.getDamager() instanceof Player) {
            atacante=(Player) e.getDamager();
        }
        else if(e.getDamager() instanceof Projectile) {
            Projectile proyectil = (Projectile) e.getDamager();
            if (proyectil.getShooter() instanceof Player) {
                atacante = (Player) proyectil.getShooter();
            }
        }
        if(atacante==null){
            return;
        }
        double vidarobada = e.getFinalDamage() * 0.5;
        double vidamaxima = atacante.getAttribute(Attribute.MAX_HEALTH).getValue();
        if (atacante.getHealth() >= vidamaxima) {
            return;
        }
        double nuevavida = atacante.getHealth() + vidarobada;
        if (nuevavida >= vidamaxima) {
            atacante.setHealth(20);

        } else{
            atacante.setHealth(nuevavida);
    }
    }}

