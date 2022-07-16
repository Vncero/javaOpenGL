package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

//effectively another layer of abstraction
//considering removal in the future
public abstract class Handler {
    //these methods are abstract to force implementation
    protected abstract void handleClick(MouseEvent m);

    protected abstract void handleKeyDown(KeyEvent k);
    protected abstract void handleKeyUp(KeyEvent k);

    //these methods may not be as common, so they can be optionally overridden
    public void handleMouseEntry(MouseEvent m) {}
    public void handleMouseExit(MouseEvent m) {}

    public void handleMousePress(MouseEvent m) {}
    public void handleMouseDrag(MouseEvent m) {}
    public void handleMouseRelease(MouseEvent m) {}

    public void handleMouseMove(MouseEvent m) {}
    public void handleMouseWheelMove(MouseEvent m) {}
}