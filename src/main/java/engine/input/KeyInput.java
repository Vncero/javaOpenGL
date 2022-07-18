package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

import engine.graphics.Window;

public class KeyInput extends Listener implements KeyListener {

    public static void add(Window window) {
        window.addInputListeners(null, new KeyInput());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.handler.handleKeyDown(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.handler.handleKeyUp(e);
    }
}
