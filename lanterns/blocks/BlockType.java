package lanterns.blocks;

public enum BlockType {

    // lanterns
    BLAZE(BlockIds.BLAZE_UNLOCALIZED_NAME, "mob.blaze.breathe", BlockIds.BLAZETOP, BlockIds.BLAZEFRONT,
            BlockIds.BLAZESIDE, BlockIds.BLAZESIDEACTIVE, 0),

    CREEPER(BlockIds.CREEPER_UNLOCALIZED_NAME, "random.fuse", BlockIds.CREEPERTOP, BlockIds.CREEPERFRONT,
            BlockIds.CREEPERSIDE, BlockIds.CREEPERSIDEACTIVE, 0),

    ENDERMEN(BlockIds.ENDERMEN_UNLOCALIZED_NAME, "mob.endermen.stare", BlockIds.ENDERMENTOP, BlockIds.ENDERMENFRONT,
            BlockIds.ENDERMENSIDE, BlockIds.ENDERMENSIDEACTIVE, 0),

    GHAST(BlockIds.GHAST_UNLOCALIZED_NAME, "mob.ghast.scream", BlockIds.GHASTTOP, BlockIds.GHASTFRONT,
            BlockIds.GHASTSIDE, BlockIds.GHASTSIDEACTIVE, 0),

    JACKO(BlockIds.JACKOLANTERN_UNLOCALIZED_NAME, null, BlockIds.JACKOLANTERNTOP, BlockIds.JACKOLANTERNFRONT,
            BlockIds.JACKOLANTERNSIDE, BlockIds.JACKOLANTERNFRONT, 0),

    MAGMA_CUBE(BlockIds.MAGMA_UNLOCALIZED_NAME, "mob.slime.attack", BlockIds.MAGMATOP, BlockIds.MAGMAFRONT,
            BlockIds.MAGMASIDE, BlockIds.MAGMASIDEACTIVE, 0),

    PIGMEN(BlockIds.PIGMEN_UNLOCALIZED_NAME, "mob.zombiepig.zpigangry", BlockIds.PIGMENTOP, BlockIds.PIGMENFRONT,
            BlockIds.PIGMENSIDE, BlockIds.PIGMENSIDEACTIVE, 0),

    SKELETON(BlockIds.SKELETON_UNLOCALIZED_NAME, "mob.skeleton.say", BlockIds.SKELETONTOP, BlockIds.SKELETONFRONT,
            BlockIds.SKELETONSIDE, BlockIds.SKELETONSIDEACTIVE, 0),

    SLIME(BlockIds.SLIME_UNLOCALIZED_NAME, "mob.slime.big", BlockIds.SLIMETOP, BlockIds.SLIMEFRONT, BlockIds.SLIMESIDE,
            BlockIds.SLIMESIDEACTIVE, 0),

    SPIDER(BlockIds.SPIDER_UNLOCALIZED_NAME, "mob.spider.say", BlockIds.SPIDERTOP, BlockIds.SPIDERFRONT,
            BlockIds.SPIDERSIDE, BlockIds.SPIDERSIDEACTIVE, 0),

    WITHER_SKELETON(BlockIds.WITHERSKELE_UNLOCALIZED_NAME, "mob.skeleton.step", BlockIds.WITHERSKELETOP,
            BlockIds.WITHERSKELEFRONT, BlockIds.WITHERSKELESIDE, BlockIds.WITHERSKELESIDEACTIVE, 0),

    ZOMBIE(BlockIds.ZOMBIE_UNLOCALIZED_NAME, "mob.zombie.say", BlockIds.ZOMBIETOP, BlockIds.ZOMBIEFRONT,
            BlockIds.ZOMBIESIDE, BlockIds.ZOMBIESIDEACTIVE, 0),

    // spawners

    BLAZESPAWN(BlockIds.BLAZESPAWN_UNLOCALIZED_NAME, null, BlockIds.BLAZESPAWNTOP, BlockIds.BLAZESPAWNSIDE,
            BlockIds.BLAZESPAWNSIDE, BlockIds.BLAZESPAWNSIDE, 61),

    CREEPERSPAWN(BlockIds.CREEPERSPAWN_UNLOCALIZED_NAME, null, BlockIds.CREEPERSPAWNTOP, BlockIds.CREEPERSIDESPAWN,
            BlockIds.CREEPERSIDESPAWN, BlockIds.CREEPERSIDESPAWN, 50),

    ENDERMENSPAWN(BlockIds.ENDERMENSPAWN_UNLOCALIZED_NAME, null, BlockIds.ENDERMENSPAWNTOP, BlockIds.ENDERMENSPAWNSIDE,
            BlockIds.ENDERMENSPAWNSIDE, BlockIds.ENDERMENSPAWNSIDE, 58),

    GHASTSPAWN(BlockIds.GHASTSPAWN_UNLOCALIZED_NAME, null, BlockIds.GHASTSPAWNTOP, BlockIds.GHASTSPAWNSIDE,
            BlockIds.GHASTSPAWNSIDE, BlockIds.GHASTSPAWNSIDE, 56),

    MAGMASPAWN(BlockIds.MAGMASPAWN_UNLOCALIZED_NAME, null, BlockIds.MAGMASPAWNTOP, BlockIds.MAGMASPAWNSIDE,
            BlockIds.MAGMASPAWNSIDE, BlockIds.MAGMASPAWNSIDE, 62),

    PIGMENSPAWN(BlockIds.PIGMENSPAWN_UNLOCALIZED_NAME, null, BlockIds.PIGMENSPAWNTOP, BlockIds.PIGMENSPAWNSIDE,
            BlockIds.PIGMENSPAWNSIDE, BlockIds.PIGMENSPAWNSIDE, 57),

    SKELETONSPAWN(BlockIds.SKELETONSPAWN_UNLOCALIZED_NAME, null, BlockIds.SKELETONSPAWNTOP, BlockIds.SKELETONSPAWNSIDE,
            BlockIds.SKELETONSPAWNSIDE, BlockIds.SKELETONSPAWNSIDE, 51),

    SLIMESPAWN(BlockIds.SLIMESPAWN_UNLOCALIZED_NAME, null, BlockIds.SLIMESPAWNTOP, BlockIds.SLIMESPAWNSIDE,
            BlockIds.SLIMESPAWNSIDE, BlockIds.SLIMESPAWNSIDE, 55),

    SPIDERSPAWN(BlockIds.SPIDERSPAWN_UNLOCALIZED_NAME, null, BlockIds.SPIDERSPAWNTOP, BlockIds.SLIMESPAWNSIDE,
            BlockIds.SPIDERSPAWNSIDE, BlockIds.SPIDERSPAWNSIDE, 52),

    WITHERSKELESPAWN(BlockIds.WITHERSKELESPAWN_UNLOCALIZED_NAME, null, BlockIds.WITHERSKELESPAWNTOP,
            BlockIds.WITHERSKELESPAWNSIDE, BlockIds.WITHERSKELESPAWNSIDE, BlockIds.WITHERSKELESPAWNSIDE, 51),

    ZOMBIESPAWN(BlockIds.ZSPAWN_UNLOCALIZED_NAME, null, BlockIds.ZSPAWNTOP, BlockIds.ZSPAWNSIDE, BlockIds.ZSPAWNSIDE,
            BlockIds.ZSPAWNSIDE, 54), 

    // Tile Entities

    public final String unlocalizedName, sound, textureTop, textureFront, textureSide, textureSideActive;
    public int spawnerid;

    BlockType(String unlocalizedName, String sound, String textureTop, String textureFront, String textureSide,
            String textureSideActive, int spawnerid) {
        this.unlocalizedName = unlocalizedName;
        this.sound = sound;
        this.textureTop = textureTop;
        this.textureFront = textureFront;
        this.textureSide = textureSide;
        this.textureSideActive = textureSideActive;
        
    }
}
