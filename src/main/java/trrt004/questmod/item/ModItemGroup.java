package trrt004.questmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import trrt004.questmod.QuestMod;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(new Identifier(QuestMod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));
}
