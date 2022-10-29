package net.bones.bonetech.item;

import net.bones.bonetech.BoneTech;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BONETECH = FabricItemGroupBuilder.build(new Identifier(BoneTech.MOD_ID, "bonetech"),
            () -> new ItemStack(ModItems.CALCIUM_INGOT));
}
