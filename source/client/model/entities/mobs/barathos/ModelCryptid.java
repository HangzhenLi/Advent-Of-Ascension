package net.tslat.aoa3.client.model.entities.mobs.barathos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCryptid extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer body;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer head2;
	private ModelRenderer leg4p2;
	private ModelRenderer leg2p2;
	private ModelRenderer leg1p2;
	private ModelRenderer leg3p2;
	private ModelRenderer leg4p3;
	private ModelRenderer leg2p3;
	private ModelRenderer leg1p3;
	private ModelRenderer leg3p3;
	private ModelRenderer head3;
	private ModelRenderer body5;
	private ModelRenderer body6;

	public ModelCryptid() {
		textureWidth = 128;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, 4.0f, -11.0f, 8, 3, 11);
		head.setRotationPoint(0.0f, 13.0f, -10.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 29, 53)).addBox(1.0f, 10.0f, -5.0f, 2, 2, 3);
		leg1.setRotationPoint(-7.0f, 12.0f, 7.0f);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 29, 53)).addBox(1.0f, 10.0f, -5.0f, 2, 2, 3);
		leg2.setRotationPoint(7.0f, 12.0f, 7.0f);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 29, 53)).addBox(1.0f, 10.0f, -6.0f, 2, 2, 3);
		leg3.setRotationPoint(-7.0f, 12.0f, -5.0f);
		leg3.setTextureSize(128, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 29, 53)).addBox(1.0f, 10.0f, -6.0f, 2, 2, 3);
		leg4.setRotationPoint(7.0f, 12.0f, -5.0f);
		leg4.setTextureSize(128, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 64, 4)).addBox(-5.0f, 0.0f, 2.0f, 10, 10, 2);
		body.setRotationPoint(0.0f, 13.0f, 10.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 1.134464f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 90, 35)).addBox(-6.0f, -10.0f, -7.0f, 12, 22, 6);
		body2.setRotationPoint(0.0f, 10.0f, 0.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 93, 4)).addBox(-6.0f, -10.0f, -4.0f, 10, 15, 2);
		body3.setRotationPoint(1.0f, 5.0f, 8.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 1.797689f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 65, 18)).addBox(-4.0f, 0.0f, -2.0f, 8, 10, 4);
		body4.setRotationPoint(0.0f, 13.0f, 10.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 1.134464f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 41, 49)).addBox(-5.0f, -6.0f, -12.0f, 10, 2, 12);
		head2.setRotationPoint(0.0f, 13.0f, -10.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 44)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		leg4p2.setRotationPoint(7.0f, 12.0f, -5.0f);
		leg4p2.setTextureSize(128, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 0, 44)).addBox(-3.0f, 0.0f, -2.0f, 6, 12, 6);
		leg2p2.setRotationPoint(7.0f, 12.0f, 7.0f);
		leg2p2.setTextureSize(128, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 0, 44)).addBox(-3.0f, 0.0f, -2.0f, 6, 12, 6);
		leg1p2.setRotationPoint(-7.0f, 12.0f, 7.0f);
		leg1p2.setTextureSize(128, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 44)).addBox(-3.0f, 0.0f, -3.0f, 6, 12, 6);
		leg3p2.setRotationPoint(-7.0f, 12.0f, -5.0f);
		leg3p2.setTextureSize(128, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 29, 53)).addBox(-3.0f, 10.0f, -6.0f, 2, 2, 3);
		leg4p3.setRotationPoint(7.0f, 12.0f, -5.0f);
		leg4p3.setTextureSize(128, 64);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg2p3 = new ModelRenderer(this, 29, 53)).addBox(-3.0f, 10.0f, -5.0f, 2, 2, 3);
		leg2p3.setRotationPoint(7.0f, 12.0f, 7.0f);
		leg2p3.setTextureSize(128, 64);
		leg2p3.mirror = true;
		setRotation(leg2p3, 0.0f, 0.0f, 0.0f);
		(leg1p3 = new ModelRenderer(this, 29, 53)).addBox(-3.0f, 10.0f, -5.0f, 2, 2, 3);
		leg1p3.setRotationPoint(-7.0f, 12.0f, 7.0f);
		leg1p3.setTextureSize(128, 64);
		leg1p3.mirror = true;
		setRotation(leg1p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 29, 53)).addBox(-3.0f, 10.0f, -6.0f, 2, 2, 3);
		leg3p3.setRotationPoint(-7.0f, 12.0f, -5.0f);
		leg3p3.setTextureSize(128, 64);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 22)).addBox(-4.0f, -4.0f, -12.0f, 8, 8, 12);
		head3.setRotationPoint(0.0f, 13.0f, -10.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 94, 4)).addBox(-7.0f, -10.0f, -4.0f, 14, 22, 2);
		body5.setRotationPoint(0.0f, 7.0f, 0.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 1.570796f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 93, 4)).addBox(-6.0f, -10.0f, -4.0f, 10, 18, 2);
		body6.setRotationPoint(1.0f, 4.0f, -1.0f);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 1.919862f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		body.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		head2.render(par7);
		leg4p2.render(par7);
		leg2p2.render(par7);
		leg1p2.render(par7);
		leg3p2.render(par7);
		leg4p3.render(par7);
		leg2p3.render(par7);
		leg1p3.render(par7);
		leg3p3.render(par7);
		head3.render(par7);
		body5.render(par7);
		body6.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p2.rotateAngleY = 0.0f;
		leg1p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1p3.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg2p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
