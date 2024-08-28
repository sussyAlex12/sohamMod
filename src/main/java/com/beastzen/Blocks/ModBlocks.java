package com.beastzen.Blocks;

import com.beastzen.SohamBirthday;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.beastzen.SohamBirthday.MOD_ID;

public class ModBlocks {


    private static Block registerBlocks(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block){

        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerCheck(){
        SohamBirthday.LOGGER.info("Registering Mod Blocks");
    }

}
