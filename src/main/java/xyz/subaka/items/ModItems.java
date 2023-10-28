package xyz.subaka.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.subaka.WoodenToolVariants;

public class ModItems {
    public static final RegistryKey<ItemGroup> WOODTOOLS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(WoodenToolVariants.MOD_ID, "wood_tools"));
    public static final ItemGroup Wooden_Tools = FabricItemGroup.builder().icon(() -> new ItemStack(Registries.ITEM.get(new Identifier(WoodenToolVariants.MOD_ID, "warped_axe")))).displayName(Text.translatable("itemGroup.woodentoolvariants.wood_tools")).build();
    public static void register() {
        for(MoreToolsEnum WoodType : MoreToolsEnum.values()){
            Item sword = Registry.register(Registries.ITEM, WoodType.getId() + "_sword", new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings()));
            ItemGroupEvents.modifyEntriesEvent(WOODTOOLS).register(entries -> entries.add(sword));

            Item pickaxe = Registry.register(Registries.ITEM, WoodType.getId() + "_pickaxe", new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings()));
            ItemGroupEvents.modifyEntriesEvent(WOODTOOLS).register(entries -> entries.add(pickaxe));

            Item axe = Registry.register(Registries.ITEM, WoodType.getId() + "_axe", new AxeItem(ToolMaterials.WOOD, 6, -3.2F, new Item.Settings()));
            ItemGroupEvents.modifyEntriesEvent(WOODTOOLS).register(entries -> entries.add(axe));

            Item shovel = Registry.register(Registries.ITEM, WoodType.getId() + "_shovel", new ShovelItem(ToolMaterials.WOOD, 1.5F, -3, new Item.Settings()));
            ItemGroupEvents.modifyEntriesEvent(WOODTOOLS).register(entries -> entries.add(shovel));

            Item hoe = Registry.register(Registries.ITEM, WoodType.getId() + "_hoe", new HoeItem(ToolMaterials.WOOD, 0, -3, new Item.Settings()));
            ItemGroupEvents.modifyEntriesEvent(WOODTOOLS).register(entries -> entries.add(hoe));
        }

        Registry.register(Registries.ITEM_GROUP, new Identifier(WoodenToolVariants.MOD_ID, "wood_tools"), Wooden_Tools);

    }

}
