package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

import engine.graphics.Window;

public class KeyInput extends Listener implements KeyListener {
    
    public KeyInput(Window window, Handler handler) {
        super(handler);
        window.addListeners(null, this);
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
