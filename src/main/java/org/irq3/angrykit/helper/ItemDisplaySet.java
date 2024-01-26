package org.irq3.angrykit.helper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemDisplaySet {
    public static ItemStack SetDisplayName(Material material,int amount, String title)
    {
        ItemStack itemBack = new ItemStack(material,amount);
        ItemMeta itemMeta = itemBack.getItemMeta();
        itemMeta.setDisplayName(title);
        itemBack.setItemMeta(itemMeta);
        return itemBack;

    }

}
