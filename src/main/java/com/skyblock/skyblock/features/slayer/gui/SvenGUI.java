package com.skyblock.skyblock.features.slayer.gui;

import com.skyblock.skyblock.features.slayer.SlayerType;
import com.skyblock.skyblock.utilities.Util;
import com.skyblock.skyblock.utilities.gui.Gui;
import com.skyblock.skyblock.utilities.item.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class SvenGUI extends Gui {
    public SvenGUI(Player opener) {
        super("Sven Packmaster", 54, new HashMap<String, Runnable>());

        Util.fillEmpty(this);

        addItem(49, Util.buildBackButton(""));

        addItem(11, SlayerGUI.getStartItem(SlayerType.SVEN, 1, 2000, 60, 5, 100, 1));
        addItem(12, SlayerGUI.getStartItem(SlayerType.SVEN, 2, 40000, 80, 25, 2000, 2));
        addItem(13, SlayerGUI.getStartItem(SlayerType.SVEN, 3, 750000, 180, 100, 10000, 3));
        addItem(14, SlayerGUI.getStartItem(SlayerType.SVEN, 4, 2000000, 440, 500, 50000, 3));

        addItem(15, new ItemBuilder(ChatColor.RED + "Not released yet!", Material.COAL_BLOCK).addLore(ChatColor.GRAY + "This boss is still in", ChatColor.GRAY + "development!").toItemStack());
    }
}
