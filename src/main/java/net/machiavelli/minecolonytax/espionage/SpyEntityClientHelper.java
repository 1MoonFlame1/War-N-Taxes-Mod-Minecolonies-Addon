package net.machiavelli.minecolonytax.espionage;

import net.minecraft.client.Minecraft;
import net.machiavelli.minecolonytax.gui.SpyDialogScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpyEntityClientHelper {
    public static void openSpyScreen() {
        Minecraft.getInstance().setScreen(new SpyDialogScreen());
    }
}