package engine.input;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;

import engine.graphics.Window;

public class Inputs extends Listener implements MouseListener, KeyListener {
    
    public static void add(Window window) {
        Inputs inputs = new Inputs();
        window.addInputListeners(inputs, inputs);
    }

    //mouse
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

    //keys
    @Override
    public void keyPressed(KeyEvent e) {
        Listener.handler.handleKeyDown(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Listener.handler.handleKeyUp(e);
    }
}
