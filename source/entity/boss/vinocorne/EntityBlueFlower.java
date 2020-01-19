package net.tslat.aoa3.entity.boss.vinocorne;

import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.entity.properties.SpecialPropertyEntity;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.EntityUtil;

import javax.annotation.Nonnull;
import java.util.TreeSet;

public class EntityBlueFlower extends AoAMeleeMob implements SpecialPropertyEntity {
	public static final float entityWidth = 0.7f;

	public EntityBlueFlower(EntityVinocorne vinocorne) {
		this(vinocorne.world);

		setLocationAndAngles(vinocorne.posX, vinocorne.posY, vinocorne.posZ, rand.nextFloat() * 360, 0);
	}

	public EntityBlueFlower(World world) {
		super(world, entityWidth, 2.3125f);

		this.mobProperties.add(Enums.MobProperties.RANGED_IMMUNE);
		this.mobProperties.add(Enums.MobProperties.GUN_IMMUNE);
	}

	@Override
	public float getEyeHeight() {
		return 1.5f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0.8;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 40;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.2875;
	}

	@Override
	protected boolean isSpecialImmuneTo(DamageSource source, int damage) {
		return EntityUtil.isGunDamage(source) || EntityUtil.isRangedDamage(source, this, 1);
	}

	@Nonnull
	@Override
	public TreeSet<Enums.MobProperties> getMobProperties() {
		return mobProperties;
	}
}
