package de.flo56958.MineTinker.Listeners;

import de.flo56958.MineTinker.Data.Lists;
import de.flo56958.MineTinker.Modifiers.ModManager;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateToolListener implements Listener {

    private static final ModManager modManager = ModManager.instance();

    @EventHandler
    public void PrepareCraft(PrepareItemCraftEvent e) {
        if (e.getRecipe() == null) {
            return;
        }

        Player player = null;

        for (HumanEntity humans : e.getViewers()){
            if (humans instanceof Player) {
                player = (Player) humans;
            }
        }

        if (player == null) {
            return;
        }

        if (!player.hasPermission("minetinker.tool.create")) {
            return;
        }

        if (Lists.WORLDS.contains(player.getWorld().getName())) {
            return;
        }

        ItemStack currentItem = e.getInventory().getResult();

        if (currentItem == null) {
            return;
        }

        int totalItems = 0;
        ItemStack lastItem = null;

        for (ItemStack item : e.getInventory().getMatrix()) {
            if (item != null && item.getType() != Material.AIR) {
                totalItems += 1;
                lastItem = item;
            }
        }

        if (lastItem == null) {
            return;
        }

        ItemMeta m = currentItem.getItemMeta();

        if (m != null) {
            if (modManager.isWandViable(currentItem)) {
                return;
            }
        }

        if (totalItems == 1 && lastItem.getType() == currentItem.getType()) {
            return;
        }

        currentItem.setAmount(1);
        modManager.convertItemStack(currentItem);
    }
}