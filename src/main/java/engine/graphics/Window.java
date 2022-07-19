package engine.graphics;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.*;

import com.jogamp.newt.event.MouseListener;
import com.jogamp.newt.event.KeyListener;

public class Window {
    private GLWindow glWindow;

    public Window(GLProfile profile) {
        glWindow = GLWindow.create(new GLCapabilities(profile));
    }

    public Window setup(Runnable destroyNotify, int width, int height, boolean resizable) {
        this.glWindow.setWindowDestroyNotifyAction(destroyNotify);
        this.glWindow.setSize(width, height);
        this.glWindow.setResizable(resizable);
        return this;
    }

    public Window addEventListener(boolean visibleOnSetup, GLEventListener eventListener) {
        if (eventListener != null) this.glWindow.addGLEventListener(eventListener);
        this.glWindow.setVisible(visibleOnSetup);
        return this;
    }

    public GLWindow getGlWindow() {
        return this.glWindow;
    }

    //this method is meant only for use internally
    public void addInputListeners(MouseListener mouse, KeyListener keys) {
        if (mouse != null) this.glWindow.addMouseListener(mouse);
        if (keys != null) this.glWindow.addKeyListener(keys);
    }
}
