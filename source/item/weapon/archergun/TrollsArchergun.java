package net.nevermine.item.weapon.archergun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.nevermine.assist.StringUtil;
import net.nevermine.item.weapon.gun.BaseGun;
import net.nevermine.izer.equipment.Weaponizer;
import net.nevermine.projectiles.auxillary.EntityElementalArrow;

import java.util.List;

public class TrollsArchergun extends BaseGun {
	public TrollsArchergun(final int consumeChance, final String effect, final int uses, final int fireRate, final Item item) {
		super(consumeChance, effect, uses, fireRate, item);
		setCreativeTab(Weaponizer.ArchergunTab);
	}

	@Override
	public void fireGun(final World world, final ItemStack stack, final EntityPlayer player, final float multi, boolean consume) {
		final EntityElementalArrow var5 = new EntityElementalArrow(world, player, 3.3f * multi, 0, true);
		var5.setDamage(3.3f * multi);
		world.spawnEntityInWorld(var5);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean bool) {
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.damage.ranged", EnumChatFormatting.DARK_RED, "17"));
		list.add(StringUtil.getLocaleString("items.description.speed.fast"));
		list.add(StringUtil.getColourLocaleStringWithArguments("items.description.ammo", EnumChatFormatting.LIGHT_PURPLE, StringUtil.getLocaleString("item.ElementalArrow.name")));
	}
}