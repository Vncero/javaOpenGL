package engine.input;

import com.jogamp.newt.event.MouseListener;
import com.jogamp.newt.event.MouseEvent;

public class MouseInputListener implements MouseListener {
    
    InputManager receiver;

    public MouseInputListener(InputManager receiver) {
        this.receiver = receiver;
    }

    @Override
    public void mouseEntered(MouseEvent m) {
        //send to game
    }

    @Override
    public void mousePressed(MouseEvent m) {
        //send to game
    }
    
    @Override
    public void mouseClicked(MouseEvent m) {
        //send to game
    }

    @Override
    public void mouseDragged(MouseEvent m) {
        //send to game
    }

    @Override
    public void mouseMoved(MouseEvent m) {
        //send to game
    }

    @Override
    public void mouseWheelMoved(MouseEvent m) {
        //send to game
    }

    @Override
    public void mouseReleased(MouseEvent m) {
        //send to game
    }
    
    @Override
    public void mouseExited(MouseEvent m) {
        //send to game
    }
}