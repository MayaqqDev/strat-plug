package dev.mayaqq.stratplug;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StratPlug implements ModInitializer {
    public static StratinePlugItem STRATINE_PLUG = new StratinePlugItem(new FabricItemSettings().fireproof().maxCount(1));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("strat-plug", "stratine_plug"), STRATINE_PLUG);

    }
}
