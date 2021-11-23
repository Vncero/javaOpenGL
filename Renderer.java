package org.graphics;

import com.jogamp.nativewindow.util.Point;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.FPSAnimator;

import org.characters.*;
import org.inputs.*;

import java.lang.Thread;
import java.util.Random;

public class Renderer extends Thread{
	
	
	private static GLWindow window = null;
	public static int x = 800;
	public static int y = 800;
	
	public static float unitsWide = 10;
	
	public static void init() {
		Renderer thread = new Renderer();
		thread.start();
		GLProfile.initSingleton();
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities caps = new GLCapabilities(profile);
		
		window = GLWindow.create(caps);
		window.setSize(x, y);
		window.setResizable(true);
		//window.setFullscreen(true);
		window.addGLEventListener(new EventListener());
		window.addMouseListener(new mouseListener());
		window.addKeyListener(new keyListener());
		FPSAnimator animator = new FPSAnimator(window, 60);
		animator.start();
		animator.getThread();
		
		Player player = new Player();
		
		window.setVisible(true);
		
		System.out.println(animator.getFPS());
		}
	
	public static double getScreenWidth() {
		return window.getWidth();
	}
	
	public static double getScreenHeight () {
		return window.getHeight();
	}
	
	public static void main(String[] args) throws InterruptedException {
		init();
		Random random = new Random();
		Point randPoint = new Point(random.nextInt(x), random.nextInt(y));
		
		
	}
	
	
}
