package org.irq3.angrykit.inventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class AInventory {

    private String name;
    private int size;
    Player player;
    Inventory inv;
    static int numberofinventorys;
    public AInventory(String name, int size, Player player) {
        this.name = name;
        this.size = size;
        this.player = player;
        makeInventory();

    }

    private void makeInventory()
    {
        if(numberofinventorys>1)
        {
            for (int i = 0; i>=numberofinventorys; i++)
            {
                player.closeInventory();
            }
        }
        inv = Bukkit.createInventory(player,size,name);
    }

    public void AddItem(ItemStack itemStack)
    {
        inv.addItem(itemStack);
    }
}
