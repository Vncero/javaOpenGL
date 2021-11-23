package org.inputs;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;

public class mouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent click) {
		// TODO Auto-generated method stub
		double clickX = click.getX();
		double clickY = click.getY();
		System.out.println("Click at: " + clickX + ", " + clickY);
		
	}

	@Override
	public void mouseDragged(MouseEvent drag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent enter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent exit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent move) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent press) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent release) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(MouseEvent wheelMove) {
		// TODO Auto-generated method stub
		
	}

}
