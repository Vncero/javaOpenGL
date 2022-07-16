package engine.graphics;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;

public class Window {
    GLWindow window;

    public Window() {
        window = GLWindow.create(new GLCapabilities(GLProfile.get("GL4")));
    }

    public Window setup(Runnable destroyNotify, int width, int height) {
        this.window.setWindowDestroyNotifyAction(destroyNotify);
        this.window.setSize(width, height);
        return this;
    }
}
