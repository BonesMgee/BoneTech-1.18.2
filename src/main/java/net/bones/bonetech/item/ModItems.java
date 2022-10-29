package net.bones.bonetech.item;

import net.bones.bonetech.BoneTech;
import net.bones.bonetech.item.tool.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item CALCIUM_INGOT = registerItem("calcium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BONETECH)));

    public static final Item CALCIUM_NUGGET = registerItem("calcium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.BONETECH)));

     public static final Item RAW_CALCIUM = registerItem("raw_calcium",
            new Item(new FabricItemSettings().group(ModItemGroup.BONETECH)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.BONETECH).maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BoneTech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BoneTech.LOGGER.info("Registering Items For " + BoneTech.MOD_ID);
    }
}
