package club.krist.minimalperipherals.tile;

import club.krist.minimalperipherals.MinimalPeripherals;
import club.krist.minimalperipherals.util.LuaMethod;
import dan200.computercraft.api.lua.LuaException;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * Created by justy on 7/6/2016.
 */
public class TileIronNoteblock extends TilePeripheral {
    public static final String name = "tileIronNoteblock";

    private final String[] instruments = {"harp", "bd", "snare", "hat", "basstattack"};

    @LuaMethod
    public void playNote(Object[] arguments) throws LuaException {
        if (arguments.length < 2)
            throw new LuaException("Wrong number of arguments. 2 expected.");
        if (!(arguments[0] instanceof Double))
            throw new LuaException("Bad argument #1 (expected number)");
        if (!(arguments[1] instanceof Double))
            throw new LuaException("Bad argument #2 (expected number)");

        String instrument = "note." + instruments[(int) (double) (Double) arguments[0]];
        float note = (float) Math.pow(2D, ((int) (double) (Double) arguments[1] - 12) / 12D);

        getWorld().playSoundEffect(getPos().getX() + 0.5D, getPos().getY() + 0.5D, getPos().getZ() + 0.5D, instrument, 3F, note);
    }

    @LuaMethod
    public void playSound(Object[] arguments) throws LuaException {
        if (arguments.length < 3)
            throw new LuaException("Wrong number of arguments. 3 expected.");
        if (!(arguments[0] instanceof String))
            throw new LuaException("Bad argument #1 (expected string)");
        if (!(arguments[1] instanceof Double))
            throw new LuaException("Bad argument #2 (expected number)");
        if (!(arguments[2] instanceof Double))
            throw new LuaException("Bad argument #3 (expected number)");

        String sound = (String) arguments[0];
        float volume = (float) (double) (Double) arguments[1];
        float pitch = (float) (double) (Double) arguments[2];

        getWorld().playSoundEffect(getPos().getX() + 0.5D, getPos().getY() + 0.5D, getPos().getZ() + 0.5D, sound, volume, pitch);
    }

    public String getType() {
        return "iron_noteblock";
    }

}
