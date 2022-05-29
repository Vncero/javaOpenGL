package engine;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;

public class Window {
    public static GLWindow createWindow() {
        //completely barebones GLWindow
        return GLWindow.create(new GLCapabilities(GLProfile.get("GL4")));
    }

    public static void defaultWindowSetup(GLWindow window) {
        window.setWindowDestroyNotifyAction(() -> System.exit(0));
        window.setSize(1000, 800);
    }
}
