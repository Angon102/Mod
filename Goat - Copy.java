// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Goat extends EntityModel<Entity> {
	private final ModelRenderer Main;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer cube_r5;
	private final ModelRenderer main_body;
	private final ModelRenderer legs;
	private final ModelRenderer tail;

	public Goat() {
		texWidth = 16;
		texHeight = 16;

		Main = new ModelRenderer(this);
		Main.setPos(0.0F, 24.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		Main.addChild(head);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.5951F, -12.8544F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.texOffs(-2, -2).addBox(-3.0F, -22.0F, -7.0F, 7.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -1.4555F, -10.8799F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.3963F, 0.0F, 0.0F);
		cube_r2.texOffs(0, 0).addBox(-2.0F, -15.0F, -7.0F, 5.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -5.8516F, -2.8277F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.4835F, 0.0F, 0.0F);
		cube_r3.texOffs(-3, -3).addBox(-3.0F, -12.0F, -7.0F, 7.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.texOffs(-1, -1).addBox(-3.0F, -12.0F, -7.0F, 7.0F, 6.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		Main.addChild(body);
		

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(neck);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -11.3326F, -1.8062F);
		neck.addChild(cube_r5);
		setRotationAngle(cube_r5, -2.1817F, 0.0F, 0.0F);
		cube_r5.texOffs(-6, -6).addBox(-3.0F, -18.0F, -8.0F, 7.0F, 11.0F, 8.0F, 0.0F, false);

		main_body = new ModelRenderer(this);
		main_body.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(main_body);
		

		legs = new ModelRenderer(this);
		legs.setPos(0.0F, 0.0F, 0.0F);
		Main.addChild(legs);
		

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 0.0F, 0.0F);
		Main.addChild(tail);
		
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}