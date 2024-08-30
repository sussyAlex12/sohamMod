package com.beastzen.Blocks;

import com.beastzen.Items.ModItemGroup;
import com.beastzen.Items.ModItems;
import com.beastzen.SohamBirthday;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.beastzen.SohamBirthday.MOD_ID;

public class ModBlocks {

    private static final Block PALLADIUM_BLOCK = registerBlock("palladium_block",
            new Block(FabricBlockSettings.of(Material.METAL)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        SohamBirthday.LOGGER.info("block item registered");
        return Registry.register(Registry.BLOCK, new Identifier(SohamBirthday.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SohamBirthday.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab).group(ModItemGroup.SOHAM)));
    }

    public static void registerCheck(){
        SohamBirthday.LOGGER.info("Registering Mod Blocks");
    }

}
