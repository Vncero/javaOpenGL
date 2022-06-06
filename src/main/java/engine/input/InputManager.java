package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

public class InputManager {
    private MouseInputListener mouseSource;
    private KeyboardListener keySource;

    public InputManager() {
        //change if necessary
        mouseSource = new MouseInputListener();
        keySource = new KeyboardListener(this);
    }    

    // public MouseEvent getLastMouseEvent() {
    //     return lastMouseInputs.get(lastMouseInputs.size() - 1);
    // }

    // public KeyEvent getLastKeyEvent() {
    //     return lastKeys.get(lastKeys.size() - 1);
    // }

    // public void update() {

    // }


}
