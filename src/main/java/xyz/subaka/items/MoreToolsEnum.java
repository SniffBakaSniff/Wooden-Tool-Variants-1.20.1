package xyz.subaka.items;

import net.minecraft.util.Identifier;
import xyz.subaka.WoodenToolVariants;

public enum MoreToolsEnum {

    spruce,
    birch,
    jungle,
    acacia,
    dark_oak,
    mangrove,
    cherry,
    bamboo,
    crimson,
    warped;

    public Identifier getId(){
        return new Identifier(WoodenToolVariants.MOD_ID, this.name());
    }

}
