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
        this.handler.handleMouseEntry(m);
    }

    @Override
    public void mousePressed(MouseEvent m) {
        this.handler.handleMousePress(m);
    }
    
    @Override
    public void mouseClicked(MouseEvent m) {
        this.handler.handleClick(m);
    }

    @Override
    public void mouseDragged(MouseEvent m) {
        this.handler.handleMouseDrag(m);
    }

    @Override
    public void mouseMoved(MouseEvent m) {
        this.handler.handleMouseMove(m);
    }

    @Override
    public void mouseWheelMoved(MouseEvent m) {
        this.handler.handleMouseWheelMove(m);
    }

    @Override
    public void mouseReleased(MouseEvent m) {
        this.handler.handleMouseRelease(m);
    }
    
    @Override
    public void mouseExited(MouseEvent m) {
        this.handler.handleMouseExit(m);
    }
}