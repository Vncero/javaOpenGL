package engine.input;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;
import engine.graphics.Window;

public class MouseInput extends Listener implements MouseListener {

    public static void add(Window window) {
        window.addInputListeners(new MouseInput(), null);
    }

    @Override
    public void mouseEntered(MouseEvent m) {
        Listener.handler.handleMouseEntry(m);
    }

    @Override
    public void mousePressed(MouseEvent m) {
        Listener.handler.handleMousePress(m);
    }
    
    @Override
    public void mouseClicked(MouseEvent m) {
        Listener.handler.handleClick(m);
    }

    @Override
    public void mouseDragged(MouseEvent m) {
        Listener.handler.handleMouseDrag(m);
    }

    @Override
    public void mouseMoved(MouseEvent m) {
        Listener.handler.handleMouseMove(m);
    }

    @Override
    public void mouseWheelMoved(MouseEvent m) {
        Listener.handler.handleMouseWheelMove(m);
    }

    @Override
    public void mouseReleased(MouseEvent m) {
        Listener.handler.handleMouseRelease(m);
    }
    
    @Override
    public void mouseExited(MouseEvent m) {
        Listener.handler.handleMouseExit(m);
    }
}