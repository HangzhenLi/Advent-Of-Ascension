package net.tslat.aoa3.client.model.entities.mobs.celeve;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBobo extends ModelBase {
	private ModelRenderer head;
	private ModelRenderer body;
	private ModelRenderer rightArm;
	private ModelRenderer leftArm;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer rightArm2;
	private ModelRenderer leftArm2;
	private ModelRenderer leftArm3;
	private ModelRenderer rightArm3;
	private ModelRenderer head2;

	public ModelBobo() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -4.0f, -5.0f, 2, 2, 1);
		head.setRotationPoint(0.0f, -2.0f, 0.0f);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body.setRotationPoint(0.0f, -2.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 40, 0)).addBox(-4.0f, -8.0f, -3.0f, 6, 6, 6);
		rightArm.setRotationPoint(-6.0f, 2.0f, 0.0f);
		rightArm.setTextureSize(64, 32);
		rightArm.mirror = true;
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 40, 0)).addBox(-2.0f, -8.0f, -3.0f, 6, 6, 6);
		leftArm.setRotationPoint(6.0f, 2.0f, 0.0f);
		leftArm.setTextureSize(64, 32);
		leftArm.mirror = true;
		setRotation(leftArm, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		rightLeg.setRotationPoint(-2.0f, 10.0f, 0.0f);
		rightLeg.setTextureSize(64, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 14, 4);
		leftLeg.setRotationPoint(2.0f, 10.0f, 0.0f);
		leftLeg.setTextureSize(64, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 40, 34)).addBox(-3.5f, 9.0f, -2.5f, 5, 5, 5);
		rightArm2.setRotationPoint(-6.0f, 2.0f, 0.0f);
		rightArm2.setTextureSize(64, 32);
		rightArm2.mirror = true;
		setRotation(rightArm2, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 40, 34)).addBox(-1.5f, 9.0f, -2.5f, 5, 5, 5);
		leftArm2.setRotationPoint(6.0f, 2.0f, 0.0f);
		leftArm2.setTextureSize(64, 32);
		leftArm2.mirror = true;
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftArm3.setRotationPoint(6.0f, 2.0f, 0.0f);
		leftArm3.setTextureSize(64, 32);
		leftArm3.mirror = true;
		setRotation(leftArm3, 0.0f, 0.0f, 0.0f);
		(rightArm3 = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightArm3.setRotationPoint(-6.0f, 2.0f, 0.0f);
		rightArm3.setTextureSize(64, 32);
		rightArm3.mirror = true;
		setRotation(rightArm3, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, -2.0f, 0.0f);
		head2.setTextureSize(64, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightArm.render(par7);
		leftArm.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		rightArm2.render(par7);
		leftArm2.render(par7);
		leftArm3.render(par7);
		rightArm3.render(par7);
		head2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm.rotateAngleZ = 0.0f;
		rightArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm2.rotateAngleZ = 0.0f;
		rightArm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightArm3.rotateAngleZ = 0.0f;
		leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm.rotateAngleZ = 0.0f;
		leftArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm2.rotateAngleZ = 0.0f;
		leftArm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftArm3.rotateAngleZ = 0.0f;
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
