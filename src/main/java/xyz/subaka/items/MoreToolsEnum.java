package xyz.subaka.items;

import net.minecraft.util.Identifier;
import xyz.subaka.WoodenToolVariants;

public enum MoreToolsEnum {

    SPRUCE,
    BIRCH,
    JUNGLE,
    ACACIA,
    DARK_OAK,
    MANGROVE,
    CHERRY,
    BAMBOO,
    CRIMSON,
    WARPED;

    public Identifier getId(){
        return new Identifier(WoodenToolVariants.MOD_ID, this.name().toLowerCase());
    }

}
