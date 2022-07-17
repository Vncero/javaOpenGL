package game;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.MouseEvent;

import engine.graphics.Window;

import engine.input.Listener;
import engine.input.Handler;
import engine.input.KeyInput;
import engine.input.MouseInput;

public class Game {
    public void init() {
        Listener.setHandler(new Handler() {
            //implement handling here
            @Override
            protected void handleClick(MouseEvent m) {
                System.out.println("Click X: " + m.getX());
                System.out.println("Click Y:" + m.getY());
            }

            @Override
            protected void handleKeyDown(KeyEvent k) {
                System.out.println("Key pressed" + k.getKeyChar());
            }

            @Override
            protected void handleKeyUp(KeyEvent k) {
                System.out.println("Key released" + k.getKeyChar());
            }
        });

        Window window = new Window()
                .setup(() -> System.exit(0), 1080, 720);

        //static methods to prevent creating useless instances
        //well, instances are still made internally, but they're never exposed
        MouseInput.add(window);
        KeyInput.add(window);

        GameLoop gameLoop = new GameLoop();
        gameLoop.start();
    }
}
