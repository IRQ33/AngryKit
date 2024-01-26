package org.irq3.angrykit.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.irq3.angrykit.inventory.AInventory;

public class Kitcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player)
        {
            AInventory aInventory = new AInventory("Kit", 9,(Player) commandSender);
        }

        return false;
    }
}
