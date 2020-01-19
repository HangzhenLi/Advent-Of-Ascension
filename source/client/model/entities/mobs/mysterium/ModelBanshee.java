package net.tslat.aoa3.client.model.entities.mobs.mysterium;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBanshee extends ModelBase {
	private ModelRenderer head1;
	private ModelRenderer body;
	private ModelRenderer rightArm;
	private ModelRenderer leftArm;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer head2;
	private ModelRenderer head3;
	private ModelRenderer head4;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;

	public ModelBanshee() {
		textureWidth = 128;
		textureHeight = 64;
		(head1 = new ModelRenderer(this, 85, 25)).addBox(-5.0f, -11.0f, 4.0f, 10, 13, 6);
		head1.setRotationPoint(0.0f, -4.0f, 1.0f);
		head1.setTextureSize(128, 64);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 2, 47)).addBox(-7.0f, 20.0f, -5.0f, 14, 6, 10);
		body.setRotationPoint(0.0f, -3.0f, 0.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0.1745329f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm.setRotationPoint(-5.0f, -1.0f, 0.0f);
		rightArm.setTextureSize(128, 64);
		rightArm.mirror = true;
		setRotation(rightArm, 0.4363323f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm.setRotationPoint(5.0f, -1.0f, 0.0f);
		leftArm.setTextureSize(128, 64);
		leftArm.mirror = true;
		setRotation(leftArm, 0.4363323f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightLeg.setRotationPoint(-2.0f, 9.0f, 2.0f);
		rightLeg.setTextureSize(128, 64);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.1745329f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftLeg.setRotationPoint(2.0f, 9.0f, 2.0f);
		leftLeg.setTextureSize(128, 64);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.1745329f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, -3.0f, 0.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 62, 0)).addBox(-5.0f, -8.0f, -4.0f, 10, 9, 4);
		head3.setRotationPoint(0.0f, -4.0f, 1.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 96, 0)).addBox(-5.0f, -10.0f, 0.0f, 10, 12, 4);
		head4.setRotationPoint(0.0f, -4.0f, 1.0f);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 52, 35)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body2.setRotationPoint(0.0f, -3.0f, 0.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.1745329f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 2, 33)).addBox(-6.0f, 16.0f, -4.0f, 12, 4, 8);
		body3.setRotationPoint(0.0f, -3.0f, 0.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 0.1745329f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 53, 53)).addBox(-5.0f, 12.0f, -3.0f, 10, 4, 6);
		body4.setRotationPoint(0.0f, -3.0f, 0.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 0.1745329f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 61, 15)).addBox(3.5f, -1.0f, -3.5f, 5, 12, 5);
		body5.setRotationPoint(0.0f, -3.0f, 0.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 0.4363323f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 88, 45)).addBox(-5.0f, 0.0f, -3.0f, 10, 12, 6);
		body6.setRotationPoint(0.0f, -3.0f, 0.0f);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 0.1745329f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 61, 15)).addBox(-8.5f, -1.0f, -3.5f, 5, 12, 5);
		body7.setRotationPoint(0.0f, -3.0f, 0.0f);
		body7.setTextureSize(128, 64);
		body7.mirror = true;
		setRotation(body7, 0.4363323f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head1.render(par7);
		body.render(par7);
		rightArm.render(par7);
		leftArm.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head1.rotateAngleY = par4 / 57.295776f;
		head1.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 54.11268f;
		head4.rotateAngleY = par4 / 57.295776f;
		head4.rotateAngleX = par5 / 54.11268f;
	}
}
