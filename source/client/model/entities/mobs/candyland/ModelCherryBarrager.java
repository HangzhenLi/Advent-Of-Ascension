package net.tslat.aoa3.client.model.entities.mobs.candyland;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCherryBarrager extends ModelBase {
	private ModelRenderer body;
	private ModelRenderer rightLeg;
	private ModelRenderer leftLeg;
	private ModelRenderer body2;
	private ModelRenderer body3;
	private ModelRenderer body4;
	private ModelRenderer body5;
	private ModelRenderer body6;
	private ModelRenderer body7;
	private ModelRenderer body8;
	private ModelRenderer body9;
	private ModelRenderer body10;
	private ModelRenderer body11;
	private ModelRenderer body12;
	private ModelRenderer body13;
	private ModelRenderer body14;
	private ModelRenderer body15;
	private ModelRenderer body16;
	private ModelRenderer body17;
	private ModelRenderer body18;
	private ModelRenderer body19;

	public ModelCherryBarrager() {
		textureWidth = 64;
		textureHeight = 64;
		(body = new ModelRenderer(this, 32, 30)).addBox(0.0f, 0.0f, -3.0f, 4, 5, 12);
		body.setRotationPoint(12.0f, 5.0f, 0.0f);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightLeg = new ModelRenderer(this, 0, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4);
		rightLeg.setRotationPoint(-3.0f, 20.0f, 0.0f);
		rightLeg.setTextureSize(64, 32);
		rightLeg.mirror = true;
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 0, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4);
		leftLeg.setRotationPoint(3.0f, 20.0f, 0.0f);
		leftLeg.setTextureSize(64, 32);
		leftLeg.mirror = true;
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 16, 15)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body2.setRotationPoint(8.0f, 10.0f, 0.0f);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 6, 16)).addBox(0.0f, -12.0f, 2.0f, 4, 4, 4);
		body3.setRotationPoint(-2.0f, 3.0f, -3.0f);
		body3.setTextureSize(64, 32);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 0, 49)).addBox(-2.0f, 0.0f, 5.0f, 6, 5, 4);
		body4.setRotationPoint(8.0f, 5.0f, 0.0f);
		body4.setTextureSize(64, 32);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 0, 30)).addBox(-6.0f, 0.0f, -3.0f, 4, 5, 12);
		body5.setRotationPoint(8.0f, 5.0f, 0.0f);
		body5.setTextureSize(64, 32);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 16, 0)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body6.setRotationPoint(8.0f, 1.0f, 0.0f);
		body6.setTextureSize(64, 32);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 1, 11)).addBox(-2.466667f, -13.0f, 1.0f, 1, 14, 1);
		body7.setRotationPoint(10.0f, 1.0f, 0.0f);
		body7.setTextureSize(64, 32);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, -0.8726646f);
		(body8 = new ModelRenderer(this, 16, 15)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body8.setRotationPoint(-1.0f, 16.0f, -3.0f);
		body8.setTextureSize(64, 32);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 32, 30)).addBox(0.0f, 0.0f, -3.0f, 4, 5, 12);
		body9.setRotationPoint(3.0f, 11.0f, -3.0f);
		body9.setTextureSize(64, 32);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 0, 30)).addBox(-6.0f, 0.0f, -3.0f, 4, 5, 12);
		body10.setRotationPoint(-1.0f, 11.0f, -3.0f);
		body10.setTextureSize(64, 32);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 16, 0)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body11.setRotationPoint(-1.0f, 7.0f, -3.0f);
		body11.setTextureSize(64, 32);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 0, 49)).addBox(-2.0f, 0.0f, 5.0f, 6, 5, 4);
		body12.setRotationPoint(-1.0f, 11.0f, -3.0f);
		body12.setTextureSize(64, 32);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 16, 15)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body13.setRotationPoint(-10.0f, 10.0f, 0.0f);
		body13.setTextureSize(64, 32);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 32, 30)).addBox(0.0f, 0.0f, -3.0f, 4, 5, 12);
		body14.setRotationPoint(-6.0f, 5.0f, 0.0f);
		body14.setTextureSize(64, 32);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 0, 30)).addBox(-6.0f, 0.0f, -3.0f, 4, 5, 12);
		body15.setRotationPoint(-10.0f, 5.0f, 0.0f);
		body15.setTextureSize(64, 32);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
		(body16 = new ModelRenderer(this, 16, 0)).addBox(-4.0f, 0.0f, -2.0f, 10, 4, 10);
		body16.setRotationPoint(-10.0f, 1.0f, 0.0f);
		body16.setTextureSize(64, 32);
		body16.mirror = true;
		setRotation(body16, 0.0f, 0.0f, 0.0f);
		(body17 = new ModelRenderer(this, 0, 49)).addBox(-2.0f, 0.0f, 5.0f, 6, 5, 4);
		body17.setRotationPoint(-10.0f, 5.0f, 0.0f);
		body17.setTextureSize(64, 32);
		body17.mirror = true;
		setRotation(body17, 0.0f, 0.0f, 0.0f);
		(body18 = new ModelRenderer(this, 1, 11)).addBox(0.5333334f, -10.0f, 2.5f, 1, 14, 1);
		body18.setRotationPoint(-1.0f, 3.0f, -3.0f);
		body18.setTextureSize(64, 32);
		body18.mirror = true;
		setRotation(body18, 0.0f, 0.0f, 0.0f);
		(body19 = new ModelRenderer(this, 1, 11)).addBox(-2.466667f, -13.0f, 3.0f, 1, 14, 1);
		body19.setRotationPoint(-8.0f, 4.0f, -3.0f);
		body19.setTextureSize(64, 32);
		body19.mirror = true;
		setRotation(body19, 0.0f, 0.0f, 0.8726646f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		rightLeg.render(par7);
		leftLeg.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		body14.render(par7);
		body15.render(par7);
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		body19.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightLeg.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
