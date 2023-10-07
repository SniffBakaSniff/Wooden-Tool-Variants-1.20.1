package xyz.subaka.woodentoolvariants.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.subaka.woodentoolvariants.WoodenToolVariants;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodenToolVariants.MOD_ID);

    public static final RegistryObject<Item> BIRCH_SWORD = ITEMS.register("birch_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PICKAXE = ITEMS.register("birch_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_AXE = ITEMS.register("birch_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SHOVEL = ITEMS.register("birch_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_HOE = ITEMS.register("birch_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> WARPED_SWORD = ITEMS.register("warped_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PICKAXE = ITEMS.register("warped_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_AXE = ITEMS.register("warped_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SHOVEL = ITEMS.register("warped_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> WARPED_HOE = ITEMS.register("warped_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_SWORD = ITEMS.register("crimson_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PICKAXE = ITEMS.register("crimson_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_AXE = ITEMS.register("crimson_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_SHOVEL = ITEMS.register("crimson_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_HOE = ITEMS.register("crimson_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_SWORD = ITEMS.register("mangrove_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PICKAXE = ITEMS.register("mangrove_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_AXE = ITEMS.register("mangrove_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_SHOVEL = ITEMS.register("mangrove_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_HOE = ITEMS.register("mangrove_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_SWORD = ITEMS.register("cherry_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_PICKAXE = ITEMS.register("cherry_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_AXE = ITEMS.register("cherry_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_SHOVEL = ITEMS.register("cherry_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_HOE = ITEMS.register("cherry_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_OAK_SWORD = ITEMS.register("dark_oak_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_PICKAXE = ITEMS.register("dark_oak_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_AXE = ITEMS.register("dark_oak_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_SHOVEL = ITEMS.register("dark_oak_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_HOE = ITEMS.register("dark_oak_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_SWORD = ITEMS.register("spruce_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_PICKAXE = ITEMS.register("spruce_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_AXE = ITEMS.register("spruce_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_SHOVEL = ITEMS.register("spruce_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_HOE = ITEMS.register("spruce_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_SWORD = ITEMS.register("acacia_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PICKAXE = ITEMS.register("acacia_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_AXE = ITEMS.register("acacia_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_SHOVEL = ITEMS.register("acacia_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_HOE = ITEMS.register("acacia_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_SWORD = ITEMS.register("jungle_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PICKAXE = ITEMS.register("jungle_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_AXE = ITEMS.register("jungle_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_SHOVEL = ITEMS.register("jungle_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_HOE = ITEMS.register("jungle_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_SWORD = ITEMS.register("bamboo_sword",
            () -> new SwordItem(Tiers.WOOD, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_PICKAXE = ITEMS.register("bamboo_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_AXE = ITEMS.register("bamboo_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SHOVEL = ITEMS.register("bamboo_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5F, -3, new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_HOE = ITEMS.register("bamboo_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3, new Item.Properties()));









    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
