package be.woubuc.minecraft.wader;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Player.class)
public class PlayerMixin {
	@Overwrite
	public boolean isPushedByFluid() {
		return false;
	}
}
