package com.skyblock.skyblock.features.minions.types;

import com.skyblock.skyblock.Skyblock;
import com.skyblock.skyblock.features.minions.MiningMinion;
import org.bukkit.*;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class GlowstoneMinion extends MiningMinion {
    public GlowstoneMinion() {
        this(UUID.randomUUID());
    }
    public GlowstoneMinion(UUID uuid) {
        super(uuid, "Glowstone", "mining", Color.fromRGB(145, 133, 3), Material.GLOWSTONE);

        this.plugin = Skyblock.getPlugin();
    }

    @Override
    public ItemStack getHand(int level) {
        return new ItemStack(Material.WOOD_PICKAXE, 1);
    }
    
    @Override
    public String getHead(int level) {
        return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjBmNGQ3YzI2YjAzMTA5OTBhN2QzYTNiNDU5NDhiOTVkZDRhYjQwN2ExNmE0YjZkM2I3Y2I0ZmJhMDMxYWVlZCJ9fX0=";
    }

    @Override
    public int getActionDelay(int level) {
        switch (level) {
            case 1:
            case 2:
                return 25;
            case 3:
            case 4:
                return 23;
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 19;
            case 9:
            case 10:
                return 16;
            case 11:
                return 11;
            default:
                return 11;
        }
    }

    @Override
    public int getMaxStorage(int level) {
        switch (level) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
                return 6;
            case 6:
            case 7:
                return 9;
            case 8:
            case 9:
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public ArrayList<ItemStack> calculateDrops(int level) {
        return new ArrayList<ItemStack>(Arrays.asList(new ItemStack(Material.GLOWSTONE_DUST, 4)));
        
    }

    @Override
    public int getSlotLevelRequirement(int slot) {
        switch (slot) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
            case 5:
                return 4;
            case 6:
            case 7:
            case 8:
                return 6;
            case 9:
            case 10:
            case 11:
                return 8;
            case 12:
            case 13:
            case 14:
                return 10;
            default:
                return 0;
        }
    }
}
