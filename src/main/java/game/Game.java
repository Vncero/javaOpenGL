package game;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

import com.jogamp.opengl.GL4;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;

import com.jogamp.opengl.util.FPSAnimator;
import engine.graphics.Graphics;
import engine.graphics.Window;

import engine.input.Listener;
import engine.input.Handler;
import engine.input.KeyInput;
import engine.input.MouseInput;

public class Game {
    public void init() {
        GLProfile.initSingleton(); //GLProfile.get() implicitly calls this, keep it if you want
        Window window = new Window(GLProfile.get(GLProfile.GL4))
                .setup(() -> System.exit(0), 1080, 720, true, true)
                .addEventListener(new GLEventListener() {
                    public static GL4 gl = null;
                    @Override
                    public void init(GLAutoDrawable drawable) {
                        gl = drawable.getGL().getGL4();
                        //should be reusable for all events

                        Graphics.gl = gl.getGL2();
                        //prevents the need to pass in gl on every Graphics method

                        System.out.println("It worked");
                    }

                    @Override
                    public void dispose(GLAutoDrawable drawable) {

                    }

                    @Override
                    public void display(GLAutoDrawable drawable) {

                    }

                    @Override
                    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

                    }
                });

        Listener.setHandler(new Handler() {
            //implement handling here
            @Override
            protected void handleClick(MouseEvent m) {
                System.out.println("Click at (" + m.getX() + ", " + m.getY() + ")");
            }

            @Override
            protected void handleKeyDown(KeyEvent k) {
                System.out.println("Key pressed: " + k.getKeyChar());
            }

            @Override
            protected void handleKeyUp(KeyEvent k) {
                System.out.println("Key released: " + k.getKeyChar());
            }
        });

        //static methods to prevent creating useless instances
        //they're still made internally, but they're never exposed
        MouseInput.add(window);
        KeyInput.add(window);

        //use Window#getGlWindow() to customize the window further
        window.getGlWindow().setTitle("Vncero's Game");

        FPSAnimator animator = new FPSAnimator(window.getGlWindow(), 60);
        animator.start();

        GameLoop gameLoop = new GameLoop(60d);
        gameLoop.start();
    }
}