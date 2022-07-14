package engine.input;

import com.jogamp.newt.event.MouseListener;
import com.jogamp.newt.event.MouseEvent;

public class MouseInput extends Listener implements MouseListener {

    public MouseInput(Handler handler) {
        super(handler);
    }

    @Override
    public void mouseEntered(MouseEvent m) {
        this.handler.handleMouseEntry();
    }

    @Override
    public void mousePressed(MouseEvent m) {
                
    }
    
    @Override
    public void mouseClicked(MouseEvent m) {
        
    }

    @Override
    public void mouseDragged(MouseEvent m) {
        
    }

    @Override
    public void mouseMoved(MouseEvent m) {
        
    }

    @Override
    public void mouseWheelMoved(MouseEvent m) {
        
    }

    @Override
    public void mouseReleased(MouseEvent m) {
        
    }
    
    @Override
    public void mouseExited(MouseEvent m) {
        this.handler.handleMouseExit();
    }
}