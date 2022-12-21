package com.skyblock.skyblock.features.entities.pigman;

import com.skyblock.skyblock.features.entities.EntityDrop;
import com.skyblock.skyblock.features.entities.EntityDropRarity;
import com.skyblock.skyblock.features.entities.SkyblockEntity;
import com.skyblock.skyblock.utilities.Util;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.craftbukkit.v1_8_R3.entity.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RedstonePigman extends SkyblockEntity {
    public RedstonePigman() {
        super(EntityType.PIG_ZOMBIE);
        loadStats(250, 75, false, false, false, new Equipment(), "Redstone Pigman", 10, 20);
    }

    @Override
    public List<EntityDrop> getDrops() {
        List<EntityDrop> drops = new ArrayList<>(Arrays.asList(
                new EntityDrop(handler.getItem("REDSTONE.json"), EntityDropRarity.COMMON, 0.5, 1),
                new EntityDrop(handler.getItem("GOLD_NUGGET.json"), EntityDropRarity.COMMON, 0.5, 1)
        ));
        return drops;
    }
}
