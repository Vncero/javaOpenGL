package game;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

import com.jogamp.opengl.*;
import com.jogamp.opengl.util.FPSAnimator;

import engine.graphics.Window;

import engine.input.Listener;
import engine.input.Handler;
import engine.input.KeyInput;
import engine.input.MouseInput;

public class Game {
    public void init() {
        GLProfile.initSingleton(); //GLProfile.get() implicitly calls this, keep it if you want
        Window window = new Window(GLProfile.get(GLProfile.GL4))
                .setup(() -> System.exit(0), 1080, 720, true)
                .addEventListener(true, new GLEventListener() {
                    //window needs to have a GLEventListener before being shown
                    @Override
                    public void init(GLAutoDrawable drawable) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        GL4 gl4 = drawable.getGL().getGL4();

                        //boilerplate block
                        //modify if you know what you're doing (or don't need DebugGL)
                        drawable.setGL(
                                drawable.getGL().isGL4bc()
                                ? new DebugGL4bc(drawable.getGL().getGL4bc())
                                : drawable.getGL().isGL4()
                                ? new DebugGL4(drawable.getGL().getGL4())
                                : drawable.getGL().isGL3bc()
                                ? new DebugGL3bc(drawable.getGL().getGL3bc())
                                : drawable.getGL().isGL3()
                                ? new DebugGL3(drawable.getGL().getGL3())
                                : drawable.getGL().isGL2()
                                ? new DebugGL2(drawable.getGL().getGL2())
                                : drawable.getGL()
                        );

                        System.out.println("It worked");
                    }

                    @Override
                    public void dispose(GLAutoDrawable drawable) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        GL4 gl4 = drawable.getGL().getGL4();

                    }

                    @Override
                    public void display(GLAutoDrawable drawable) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        GL4 gl4 = drawable.getGL().getGL4();

                    }

                    @Override
                    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        GL4 gl4 = drawable.getGL().getGL4();

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

//        GameLoop gameLoop = new GameLoop(60d);
//        gameLoop.start();
    }
}