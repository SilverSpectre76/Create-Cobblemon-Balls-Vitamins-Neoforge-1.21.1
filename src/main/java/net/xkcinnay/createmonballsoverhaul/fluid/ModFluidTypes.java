package net.xkcinnay.createmonballsoverhaul.fluid;

import net.xkcinnay.createmonballsoverhaul.CreateCobblemonBallsOverhaul;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = ResourceLocation.fromNamespaceAndPath(CreateCobblemonBallsOverhaul.MOD_ID,"block/tumblestone_coating_still");
    public static final ResourceLocation WATER_FLOWING_RL = ResourceLocation.fromNamespaceAndPath(CreateCobblemonBallsOverhaul.MOD_ID,"block/tumblestone_coating_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = ResourceLocation.parse("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateCobblemonBallsOverhaul.MOD_ID);

    public static final Supplier<FluidType> STANDARD_TUMBLESTONE_COATING_FLUID_TYPE = registerFluidType("standard_tumblestone_coating_fluid",
            new BaseFluidType(WATER_STILL_RL,WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xf0ce653b,
                    new Vector3f(206f / 255f, 101f / 255f, 59f / 255f),
                    FluidType.Properties.create().viscosity(2000)));

    public static final Supplier<FluidType> LIGHT_TUMBLESTONE_COATING_FLUID_TYPE = registerFluidType("light_tumblestone_coating_fluid",
            new BaseFluidType(WATER_STILL_RL,WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xf089d4da,
                    new Vector3f(137f / 255f, 212f / 255f, 218f / 255f),
                    FluidType.Properties.create().viscosity(2000)));

    public static final Supplier<FluidType> DENSE_TUMBLESTONE_COATING_FLUID_TYPE = registerFluidType("dense_tumblestone_coating_fluid",
            new BaseFluidType(WATER_STILL_RL,WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xf0567266,
                    new Vector3f(86f / 255f, 114f / 255f, 102f / 255f),
                    FluidType.Properties.create().viscosity(2000)));



    private static Supplier<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}