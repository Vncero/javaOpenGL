package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;


public class KeyboardListener implements KeyListener {

    InputManager receiver;
    
    public KeyboardListener(InputManager receiver) {
        this.receiver = receiver;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        receiver.putKey(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        receiver.putKey(e);
    }
}
