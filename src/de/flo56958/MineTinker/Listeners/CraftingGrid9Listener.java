package de.flo56958.MineTinker.Listeners;

import de.flo56958.MineTinker.Data.Lists;
import de.flo56958.MineTinker.Data.Strings;
import de.flo56958.MineTinker.Main;
import de.flo56958.MineTinker.Utilities.ItemGenerator;
import de.flo56958.MineTinker.Utilities.LevelCalculator;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class CraftingGrid9Listener implements Listener {

    @EventHandler(priority = EventPriority.LOW)
    public void onCraft(CraftItemEvent e) {

        List<String> tools = new ArrayList<>(Lists.SWORDS); //Setting up List of tools
        tools.addAll(Lists.AXES);
        tools.addAll(Lists.PICKAXES);
        tools.addAll(Lists.SHOVELS);

        for (String current : tools) {
            if (e.getCurrentItem().getType().toString().equals(current)) {
                ArrayList<String> lore = new ArrayList<>();
                lore.add(Strings.IDENTIFIER);
                lore.add(Strings.LEVELLINE + "1");
                lore.add(Strings.EXPLINE + "0 / " + LevelCalculator.getNextLevelReq(1));
                lore.add(Strings.FREEMODIFIERSLOTS + "1");
                lore.add(Strings.MODIFIERSTART);
                ItemStack temp = ItemGenerator.changeItem(e.getCurrentItem(), lore);
                e.setCurrentItem(temp);
                if (Main.getPlugin().getConfig().getBoolean("Sound.OnCrafting") || Main.getPlugin().getConfig().getBoolean("Sound.OnEveryCrafting")) {
                    ((Player) e.getWhoClicked()).playSound(e.getWhoClicked().getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 0.5F);
                }
                break;
            } else {
                if (Main.getPlugin().getConfig().getBoolean("Sound.OnEveryCrafting")) {
                    ((Player) e.getWhoClicked()).playSound(e.getWhoClicked().getLocation(), Sound.BLOCK_ANVIL_USE, 1.0F, 0.5F);
                }
            }
        }
    }
}