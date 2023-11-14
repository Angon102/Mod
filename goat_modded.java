// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class goat_modded extends EntityModel<Entity> {
	private final ModelRenderer Goat;
	private final ModelRenderer head;
	private final ModelRenderer top_head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer horn_1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer horn_2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer body;
	private final ModelRenderer body_part_1;
	private final ModelRenderer cube_r14;
	private final ModelRenderer body_part_2;
	private final ModelRenderer cube_r15;
	private final ModelRenderer body_part_3;
	private final ModelRenderer cube_r16;
	private final ModelRenderer neck_part_1;
	private final ModelRenderer cube_r17;
	private final ModelRenderer neck_part_2;
	private final ModelRenderer cube_r18;
	private final ModelRenderer neck_part3;
	private final ModelRenderer cube_r19;
	private final ModelRenderer legs;
	private final ModelRenderer leg1_part_1;
	private final ModelRenderer leg1_part_2;
	private final ModelRenderer leg1_part_3;
	private final ModelRenderer bone16;
	private final ModelRenderer leg2_part_2;
	private final ModelRenderer leg3_part_3;
	private final ModelRenderer tail;
	private final ModelRenderer bone20;

	public goat_modded() {
		texWidth = 16;
		texHeight = 16;

		Goat = new ModelRenderer(this);
		Goat.setPos(0.0F, 24.0F, 5.0F);
		

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		Goat.addChild(head);
		

		top_head = new ModelRenderer(this);
		top_head.setPos(0.0F, -7.0F, -3.0F);
		head.addChild(top_head);
		top_head.texOffs(-8, -8).addBox(-4.0F, -2.0821F, -7.7848F, 6.0F, 5.0F, 9.0F, 0.0F, false);
		top_head.texOffs(-4, -4).addBox(-5.0F, -2.0821F, -2.0F, 8.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -1.8289F, 0.2221F);
		top_head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.829F, 0.0F, 0.0F);
		cube_r1.texOffs(-4, -4).addBox(-1.0F, -3.2532F, 0.9932F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-1.7361F, -1.3324F, -1.631F);
		top_head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.262F, 0.0421F, 0.0113F);
		cube_r2.texOffs(-8, -8).addBox(0.0F, -3.2532F, -6.0068F, 2.0F, 3.0F, 10.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.5311F, -1.3505F, -1.5635F);
		top_head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2657F, -0.1685F, -0.0456F);
		cube_r3.texOffs(-10, -10).addBox(-2.0F, -3.2532F, -6.0068F, 2.0F, 3.0F, 12.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0735F, -1.3776F, -1.4625F);
		top_head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2657F, 0.1685F, 0.0456F);
		cube_r4.texOffs(-9, -9).addBox(0.0F, -3.2532F, -6.0068F, 2.0F, 3.0F, 11.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -1.8289F, 0.2221F);
		top_head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.texOffs(0, 0).addBox(-3.0F, -3.2532F, -8.0068F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 1.9471F, 2.4441F);
		top_head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
		cube_r6.texOffs(-4, -4).addBox(-5.0F, -8.2532F, -0.0068F, 8.0F, 9.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, -1.3013F, -1.0755F);
		top_head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
		cube_r7.texOffs(-5, -5).addBox(-4.0F, -7.2532F, 0.9932F, 6.0F, 9.0F, 7.0F, 0.0F, false);

		horn_1 = new ModelRenderer(this);
		horn_1.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(horn_1);
		setRotationAngle(horn_1, 0.0F, 0.0F, 0.0873F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-6.8904F, -14.1406F, -4.3879F);
		horn_1.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.943F, 0.101F, -0.5599F);
		cube_r8.texOffs(1, 1).addBox(0.0F, -14.2532F, 1.9932F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-4.7341F, -10.5462F, -5.194F);
		horn_1.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7248F, 0.101F, -0.5599F);
		cube_r9.texOffs(0, 0).addBox(0.0F, -13.2532F, 1.9932F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(-0.7808F, -5.2466F, 0.0864F);
		horn_1.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0267F, 0.101F, -0.5599F);
		cube_r10.texOffs(-1, -1).addBox(0.0F, -12.2532F, 1.9932F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		horn_2 = new ModelRenderer(this);
		horn_2.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(horn_2);
		setRotationAngle(horn_2, 0.0F, 0.0F, -0.1309F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(5.0115F, -12.8182F, -4.8847F);
		horn_2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.943F, -0.101F, 0.5599F);
		cube_r11.texOffs(1, 1).addBox(-2.0F, -14.2532F, 1.9932F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(2.9533F, -9.3526F, -5.8363F);
		horn_2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7248F, -0.101F, 0.5599F);
		cube_r12.texOffs(0, 0).addBox(-2.0F, -13.2532F, 1.9932F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-1.0F, -4.0529F, -0.5559F);
		horn_2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0267F, -0.101F, 0.5599F);
		cube_r13.texOffs(-1, -1).addBox(-2.0F, -12.2532F, 1.9932F, 2.0F, 3.0F, 3.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		Goat.addChild(body);
		

		body_part_1 = new ModelRenderer(this);
		body_part_1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body_part_1);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.0F, 0.1986F, 14.5405F);
		body_part_1.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.6144F, 0.0F, 0.0F);
		cube_r14.texOffs(-11, -11).addBox(-6.0F, 17.7468F, -9.0068F, 10.0F, 7.0F, 13.0F, 0.0F, false);

		body_part_2 = new ModelRenderer(this);
		body_part_2.setPos(0.0F, 0.0F, 0.0F);
		body_part_1.addChild(body_part_2);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(0.0F, -4.6696F, -0.0003F);
		body_part_2.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.3963F, 0.0F, 0.0F);
		cube_r15.texOffs(-11, -11).addBox(-6.0F, 12.7468F, -9.0068F, 10.0F, 11.0F, 13.0F, 0.0F, false);

		body_part_3 = new ModelRenderer(this);
		body_part_3.setPos(0.0F, 0.0F, 0.0F);
		body_part_2.addChild(body_part_3);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, -0.659F, 14.3475F);
		body_part_3.addChild(cube_r16);
		setRotationAngle(cube_r16, 1.5708F, 0.0F, 0.0F);
		cube_r16.texOffs(-11, -11).addBox(-7.0F, 6.7468F, -9.0068F, 12.0F, 13.0F, 13.0F, 0.0F, false);

		neck_part_1 = new ModelRenderer(this);
		neck_part_1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(neck_part_1);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(0.0F, -5.0529F, -0.5559F);
		neck_part_1.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.6545F, 0.0F, 0.0F);
		cube_r17.texOffs(-5, -5).addBox(-3.0F, -1.2532F, -0.0068F, 4.0F, 6.0F, 7.0F, 0.0F, false);

		neck_part_2 = new ModelRenderer(this);
		neck_part_2.setPos(0.0F, 0.0F, 0.0F);
		neck_part_1.addChild(neck_part_2);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(0.0F, -4.6622F, -3.5111F);
		neck_part_2.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.0472F, 0.0F, 0.0F);
		cube_r18.texOffs(-5, -5).addBox(-4.0F, 6.7468F, -0.0068F, 6.0F, 7.0F, 7.0F, 0.0F, false);

		neck_part3 = new ModelRenderer(this);
		neck_part3.setPos(0.0F, 0.0F, 0.0F);
		neck_part_2.addChild(neck_part3);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(0.0F, -3.533F, 0.1134F);
		neck_part3.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.4835F, 0.0F, 0.0F);
		cube_r19.texOffs(-8, -8).addBox(-5.0F, 8.7468F, -7.0068F, 8.0F, 4.0F, 10.0F, 0.0F, false);

		legs = new ModelRenderer(this);
		legs.setPos(0.0F, 0.0F, 0.0F);
		Goat.addChild(legs);
		

		leg1_part_1 = new ModelRenderer(this);
		leg1_part_1.setPos(0.0F, 0.0F, 0.0F);
		legs.addChild(leg1_part_1);
		

		leg1_part_2 = new ModelRenderer(this);
		leg1_part_2.setPos(0.0F, 0.0F, 0.0F);
		leg1_part_1.addChild(leg1_part_2);
		

		leg1_part_3 = new ModelRenderer(this);
		leg1_part_3.setPos(0.0F, 0.0F, 0.0F);
		leg1_part_2.addChild(leg1_part_3);
		

		bone16 = new ModelRenderer(this);
		bone16.setPos(0.0F, 0.0F, 0.0F);
		legs.addChild(bone16);
		

		leg2_part_2 = new ModelRenderer(this);
		leg2_part_2.setPos(0.0F, 0.0F, 0.0F);
		bone16.addChild(leg2_part_2);
		

		leg3_part_3 = new ModelRenderer(this);
		leg3_part_3.setPos(0.0F, 0.0F, 0.0F);
		leg2_part_2.addChild(leg3_part_3);
		

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 0.0F, 0.0F);
		Goat.addChild(tail);
		

		bone20 = new ModelRenderer(this);
		bone20.setPos(0.0F, 0.0F, 0.0F);
		tail.addChild(bone20);
		
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Goat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}