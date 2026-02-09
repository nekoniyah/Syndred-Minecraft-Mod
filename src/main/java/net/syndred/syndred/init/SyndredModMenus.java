/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.world.inventory.SunderGUIMenu;
import net.syndred.syndred.world.inventory.EggIncubatorGUIMenu;
import net.syndred.syndred.world.inventory.AnimaConfluxGUIMenu;
import net.syndred.syndred.network.MenuStateUpdateMessage;
import net.syndred.syndred.SyndredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class SyndredModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SyndredMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<SunderGUIMenu>> SUNDER_GUI = REGISTRY.register("sunder_gui", () -> IMenuTypeExtension.create(SunderGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AnimaConfluxGUIMenu>> ANIMA_CONFLUX_GUI = REGISTRY.register("anima_conflux_gui", () -> IMenuTypeExtension.create(AnimaConfluxGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EggIncubatorGUIMenu>> EGG_INCUBATOR_GUI = REGISTRY.register("egg_incubator_gui", () -> IMenuTypeExtension.create(EggIncubatorGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof SyndredModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}