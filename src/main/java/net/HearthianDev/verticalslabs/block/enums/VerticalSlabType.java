package net.HearthianDev.verticalslabs.block.enums;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum VerticalSlabType implements StringRepresentable {
    HALF("half"),
    DOUBLE("double");

    private final String name;

    VerticalSlabType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}