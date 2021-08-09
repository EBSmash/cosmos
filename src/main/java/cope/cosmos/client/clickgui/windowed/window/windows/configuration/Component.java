package cope.cosmos.client.clickgui.windowed.window.windows.configuration;

import cope.cosmos.client.clickgui.util.Util;
import net.minecraft.util.math.Vec2f;

public abstract class Component implements Util {

    private Vec2f position;
    private float width;
    private float height;

    public abstract void drawComponent(Vec2f position, float width);

    public abstract void handleLeftClick();

    public abstract void handleRightClick();

    public abstract void handleKeyPress(char typedCharacter, int key);

    public void setPosition(Vec2f in) {
        position = in;
    }

    public Vec2f getPosition() {
        return position;
    }

    public void setWidth(float in) {
        width = in;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float in) {
        height = in;
    }

    public float getHeight() {
        return height;
    }
}
