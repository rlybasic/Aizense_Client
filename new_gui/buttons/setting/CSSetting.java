//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Basic\Desktop\projects\java\deof\Minecraft-Deobfuscator3000-1.2.3\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 */
package new_gui.buttons.setting;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import ru.aizensense.module.Module;
import ru.aizensense.settings.Setting;

public class CSSetting {
    public int x;
    public int y;
    public int width;
    public int height;
    public Setting set;
    public Module mod;
    public String displayString;
    public Minecraft mc = Minecraft.getMinecraft();
    public FontRenderer fr;

    public CSSetting(int x, int y, int width, int height, Setting s) {
        this.fr = this.mc.fontRenderer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.set = s;
        this.displayString = s.getName();
    }

    public CSSetting(int x, int y, int width, int height, Module s) {
        this.fr = this.mc.fontRenderer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.mod = s;
        this.displayString = s.getName();
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    }

    public void keyTyped(char typedChar, int keyCode) throws IOException {
    }

    public void onKeyPress(int typedChar, int keyCode) {
    }

    public void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
    }

    public void mouseReleased(int mouseX, int mouseY, int state) {
    }

    public void initButton() {
    }
}

