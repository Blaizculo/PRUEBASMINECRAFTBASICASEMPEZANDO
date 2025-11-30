package org.elpepe.pruebahola;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandodevolar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("solo los jugadores pueden volar");
            return true;
        }
        Player player = (Player) sender;
        if(player.getAllowFlight()){
            player.setAllowFlight(false);
            player.setFlying(false);
        }
        else{
            player.setAllowFlight(true);
        }
        return true;
    }
}
