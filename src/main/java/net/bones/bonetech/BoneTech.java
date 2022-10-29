package net.bones.bonetech;

import net.bones.bonetech.block.ModBlocks;
import net.bones.bonetech.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoneTech implements ModInitializer {
	public static final  String MOD_ID = "bonetech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
