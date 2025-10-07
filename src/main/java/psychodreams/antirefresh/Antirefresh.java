package psychodreams.antirefresh;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class Antirefresh implements ClientModInitializer
{
    public static MinecraftClient mc;

    @Override
    public void onInitializeClient()
    {
        mc = MinecraftClient.getInstance();
    }
}
