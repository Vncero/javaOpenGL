package engine.graphics;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;

import com.jogamp.newt.event.MouseListener;
import com.jogamp.newt.event.KeyListener;

public class Window {
    GLWindow window;

    public Window() {
        window = GLWindow.create(new GLCapabilities(GLProfile.get("GL4")));
    }

    public Window setup(Runnable destroyNotify, int width, int height) {
        this.window.setWindowDestroyNotifyAction(destroyNotify);
        this.window.setSize(width, height);
        this.window.setVisible(true);
        return this;
    }

    public void addListeners(MouseListener mouse, KeyListener keys) {
        if (mouse != null) this.window.addMouseListener(mouse);
        if (keys != null) this.window.addKeyListener(keys);
    }
}
