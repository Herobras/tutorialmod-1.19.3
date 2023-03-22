package net.herobras.tutorialmod.item;

import net.herobras.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> DOLLAR_BILL =ITEMS.register("dollar_bill",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BLACK_OPAL =ITEMS.register("raw_black_opal",
            ()->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
