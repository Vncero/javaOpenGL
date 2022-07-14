package engine;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;

public class Window {
    GLWindow window;

    public Window() {
        window = GLWindow.create(new GLCapabilities(GLProfile.get("GL4")));
    }

    public void setup(Runnable destroyNotify, int width, int height) {
        window.setWindowDestroyNotifyAction(destroyNotify);
        window.setSize(width, height);
    }
}
