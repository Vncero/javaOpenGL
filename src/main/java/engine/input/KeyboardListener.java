package engine.input;

import java.util.ArrayList;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;


public class KeyboardListener implements KeyListener {

    private ArrayList<KeyEvent> lastKeys;
    
    public KeyboardListener(InputManager receiver) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //send to game
    }
}
