package org.elpepe.pruebahola;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AZADAORO implements Listener {
    @EventHandler
    public void ConvertirEnOro(PlayerInteractEvent e){
        if(e.getAction()!= Action.RIGHT_CLICK_BLOCK){
            return;
        }
        if(e.getItem()==null||e.getItem().getType()!= Material.GOLDEN_HOE) {
            return;
        }
        Block block = e.getClickedBlock();
        if(block==null){
            return;
        }
        block.setType(Material.GOLD_BLOCK);
    }
}
