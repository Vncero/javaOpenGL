package org.graphics;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class EventListener extends Renderer implements GLEventListener {
	
	@Override
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		GL2 gl = drawable.getGL().getGL2();
		gl.glColor3f(1, 0, 1);
		gl.glBegin(GL2.GL_QUADS);
		 gl.glVertex2f(1f, -1f);
		 gl.glVertex2f(1f, 1f);
		 gl.glVertex2f(-1f, 1f);
		 gl.glVertex2f(-1f, -1f);
		gl.glEnd();
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		GL2 gl = drawable.getGL().getGL2();
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		GL2 gl = drawable.getGL().getGL2();
		gl.glClearColor(0.1f, 1.25f, 0.1f, 2.5f);


	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		//Renderer.window.setVisible(false);
		GL2 gl = drawable.getGL().getGL2();
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		
	    double unitsTall = Renderer.getScreenHeight() / (Renderer.getScreenWidth()/ Renderer.unitsWide);
		
		gl.glOrtho(-unitsWide / 2, unitsWide / 2, -unitsTall, unitsTall, -1, 1);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		
	}

}
