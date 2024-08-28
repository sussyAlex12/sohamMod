package com.beastzen.Items;

import com.beastzen.SohamBirthday;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.beastzen.SohamBirthday.MOD_ID;

public class ModItems {
    public static final Item TEST_ITEM = registerItems("test_item",
            new Item(new FabricItemSettings().group(ModItemGroup.SOHAM)));

    public static SohamBirthday obj = new SohamBirthday();
    public static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerCheck(){
        SohamBirthday.LOGGER.info("Registering Mod Items");
    }
}
