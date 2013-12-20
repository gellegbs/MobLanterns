package lanterns.tileentities;

import lanterns.blocks.BlockType;
import net.minecraft.entity.EntityList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TESpawner extends TileEntity {

    private TEType type;
    public boolean isActive;

    public void updateBlock(World world, int x, int y, int z, int currentMeta) {
        if (!world.isRemote) {
            boolean isActive = false;
            EntityList.createEntityByID(BlockType.spawnerid, world);
        }
    }

}