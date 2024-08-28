package com.beastzen.Items;

import com.beastzen.SohamBirthday;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup SOHAM = FabricItemGroupBuilder.build(
            new Identifier(SohamBirthday.MOD_ID, "soham"), () -> new ItemStack(ModItems.TEST_ITEM));

}
