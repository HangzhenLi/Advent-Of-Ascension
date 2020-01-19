package net.tslat.aoa3.block.generation.misc;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.tslat.aoa3.block.UnbreakableBlock;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class KaiyuTempleTrapFire extends UnbreakableBlock {
	private final AxisAlignedBB COLLIDABLE_BLOCK_AABB = new AxisAlignedBB(0.05, 0.05, 0.05, 0.95, 0.95, 0.95);

	public KaiyuTempleTrapFire() {
		super("KaiyuTempleTrapSquares", "kaiyu_temple_trap_squares", Material.ROCK);
	}

	@Nullable
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return COLLIDABLE_BLOCK_AABB;
	}

	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (entity instanceof EntityPlayer && !((EntityPlayer)entity).capabilities.isCreativeMode) {
			((EntityPlayer)entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 70, 3, true, false));
			entity.setFire(5);
		}
	}
}
