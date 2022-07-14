package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

abstract class Handler {
    //these methods are abstract to force implementation
    abstract Handler();
    abstract void handleClick(MouseEvent m);
    abstract void handleKeyDown(KeyEvent k);
    abstract void handleKeyUp(KeyEvent k);

    //these methods may not be as common, so they can be optionally overridden
    public void handleMouseEntry() {}
    public void handleMouseExit() {}
}