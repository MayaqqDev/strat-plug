package dev.mayaqq.stratplug;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class StratinePlugItem extends TrinketItem {
    public StratinePlugItem(Settings settings) {
        super(settings);
    }
    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setVelocity(0, -20, 0);
    }
}
