package de.vepexlegit.fastplace;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyLoader
{
    public static KeyBinding showTime;

    public KeyLoader()
    {
        KeyLoader.showTime = new KeyBinding("key.fmltutor.showTime", Keyboard.KEY_F, "key.categories.fmltutor");

        ClientRegistry.registerKeyBinding(KeyLoader.showTime);
    }
}