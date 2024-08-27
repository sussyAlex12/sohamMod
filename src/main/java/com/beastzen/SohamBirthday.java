package com.beastzen;

import com.beastzen.Items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SohamBirthday implements ModInitializer {
    public static final String MOD_ID = "soham-birthday";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID + " loaded");
		ModItems.registerCheck();
	}
}