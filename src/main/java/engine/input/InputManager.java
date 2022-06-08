package engine.input;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

public class InputManager {
    private MouseInputListener mouseSource;
    private KeyboardListener keySource;

    private Map<KeyEvent, Short> lastKeys;
    /*mouse input:
        - enter/exit
        - clicks & drags/releases
        - figure out what inputs are necessary and how to use them
    */

    public InputManager(int maxMouseInputs, int maxKeys) {
        //either poll or automatically send events once detected
        this.mouseSource = new MouseInputListener(this);
        this.keySource = new KeyboardListener(this);

        this.lastKeys = new LinkedHashMap<>(maxKeys);
    }

    public void putMouseInput(MouseEvent m) {
        // this.lastMouseInputs.put(m);
    }

    public void putKey(KeyEvent k) {
        this.lastKeys.put(k, k.getKeySymbol()); //KeySymbol is more standardized, KeyCode is restricted to US Keyboard
    }
}
