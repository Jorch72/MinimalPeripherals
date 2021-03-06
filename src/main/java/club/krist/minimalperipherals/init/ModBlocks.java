package club.krist.minimalperipherals.init;

import club.krist.minimalperipherals.MinimalPeripherals;
import club.krist.minimalperipherals.block.BlockChatBox;
import club.krist.minimalperipherals.block.BlockIronNoteblock;
import club.krist.minimalperipherals.block.BlockSteel;
import club.krist.minimalperipherals.block.BlockTest;
import club.krist.minimalperipherals.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justy on 7/6/2016.
 */
public class ModBlocks {

    public static BlockTest circuit_block = new BlockTest();
    public static BlockChatBox chat_box = new BlockChatBox();
    public static BlockIronNoteblock iron_noteblock = new BlockIronNoteblock();
    public static BlockSteel steel_block = new BlockSteel();

    public static void init() {
        GameRegistry.registerBlock(circuit_block, circuit_block.getName());
        GameRegistry.registerBlock(chat_box, chat_box.getName());
        GameRegistry.registerBlock(iron_noteblock, iron_noteblock.getName());
        GameRegistry.registerBlock(steel_block, steel_block.getName());
    }
}
