package net.tslat.aoa3.client.render.entities.boss.primordialfive;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.gui.render.BossBarRenderer;
import net.tslat.aoa3.client.model.entities.boss.primordialfive.ModelMiskel;
import net.tslat.aoa3.entity.boss.primordialfive.EntityMiskel;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class MiskelRenderer extends RenderLiving<EntityMiskel> {
	private final ResourceLocation texture;

	public MiskelRenderer(RenderManager renderManager, final ResourceLocation texture) {
		super(renderManager, new ModelMiskel(), EntityMiskel.entityWidth / 3);
		this.texture = texture;
	}

	@Override
	public void doRender(EntityMiskel entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (x + y + z != 0)
			BossBarRenderer.boss = entity;
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityMiskel Miskel) {
		return texture;
	}
}