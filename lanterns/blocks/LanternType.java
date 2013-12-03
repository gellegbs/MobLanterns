package lanterns.blocks;

public enum LanternType {
	
	BLAZE (BlockIds.BLAZE_UNLOCALIZED_NAME, "mob.blaze.breathe", BlockIds.BLAZETOP, BlockIds.BLAZEFRONT, BlockIds.BLAZESIDE, BlockIds.BLAZESIDEACTIVE),
	CREEPER (BlockIds.CREEPER_UNLOCALIZED_NAME, "random.fuse", BlockIds.CREEPERTOP, BlockIds.CREEPERFRONT, BlockIds.CREEPERSIDE, BlockIds.CREEPERSIDEACTIVE),
	ENDERMEN (BlockIds.ENDERMEN_UNLOCALIZED_NAME, "mob.endermen.stare", BlockIds.ENDERMENTOP, BlockIds.ENDERMENFRONT, BlockIds.ENDERMENSIDE, BlockIds.ENDERMENSIDEACTIVE),
	GHAST (BlockIds.GHAST_UNLOCALIZED_NAME, "mob.ghast.scream", BlockIds.GHASTTOP, BlockIds.GHASTFRONT, BlockIds.GHASTSIDE, BlockIds.GHASTSIDEACTIVE),
	JACKO (BlockIds.JACKOLANTERN_UNLOCALIZED_NAME, null, BlockIds.JACKOLANTERNTOP, BlockIds.JACKOLANTERNFRONT, BlockIds.JACKOLANTERNSIDE, BlockIds.JACKOLANTERNFRONT),
	MAGMA_CUBE (BlockIds.MAGMA_UNLOCALIZED_NAME, "mob.slime.attack", BlockIds.MAGMATOP, BlockIds.MAGMAFRONT, BlockIds.MAGMASIDE, BlockIds.MAGMASIDEACTIVE),
	PIGMEN (BlockIds.PIGMEN_UNLOCALIZED_NAME, "mob.zombiepig.zpigangry", BlockIds.PIGMENTOP, BlockIds.PIGMENFRONT, BlockIds.PIGMENSIDE, BlockIds.PIGMENSIDEACTIVE),
	SKELETON (BlockIds.SKELETON_UNLOCALIZED_NAME, "mob.skeleton.say", BlockIds.SKELETONTOP, BlockIds.SKELETONFRONT, BlockIds.SKELETONSIDE, BlockIds.SKELETONSIDEACTIVE),
	SLIME (BlockIds.SLIME_UNLOCALIZED_NAME, "mob.slime.big", BlockIds.SLIMETOP, BlockIds.SLIMEFRONT, BlockIds.SLIMESIDE, BlockIds.SLIMESIDEACTIVE),
	SPIDER (BlockIds.SPIDER_UNLOCALIZED_NAME, "mob.spider.say", BlockIds.SPIDERTOP, BlockIds.SPIDERFRONT, BlockIds.SPIDERSIDE, BlockIds.SPIDERSIDEACTIVE),
	WITHER_SKELETON (BlockIds.WITHERSKELE_UNLOCALIZED_NAME, "mob.skeleton.step", BlockIds.WITHERSKELETOP, BlockIds.WITHERSKELEFRONT, BlockIds.WITHERSKELESIDE, BlockIds.WITHERSKELESIDEACTIVE),
	ZOMBIE (BlockIds.ZOMBIE_UNLOCALIZED_NAME, "mob.zombie.say", BlockIds.ZOMBIETOP, BlockIds.ZOMBIEFRONT, BlockIds.ZOMBIESIDE, BlockIds.ZOMBIESIDEACTIVE);

	
	public final String unlocalizedName, sound, textureTop, textureFront, textureSide, textureSideActive;
	
	
	LanternType(String unlocalizedName, String sound, String textureTop, String textureFront, String textureSide, String textureSideActive) {
		this.unlocalizedName = unlocalizedName;
		this.sound = sound;
		this.textureTop = textureTop;
		this.textureFront = textureFront;
		this.textureSide = textureSide;
		this.textureSideActive = textureSideActive;
	}
}
