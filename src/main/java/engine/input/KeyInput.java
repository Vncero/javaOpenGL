package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;


public class KeyInput extends Listener implements KeyListener {
    
    public KeyInput(Handler handler) {
        super(handler);
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
