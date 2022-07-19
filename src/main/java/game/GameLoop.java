package game;

import com.jogamp.opengl.GLAutoDrawable;
import engine.graphics.Window;

public class GameLoop extends Thread {
    private Window window;
    private double maxNsPerFrame;

    public GameLoop(Window window, double fps) {
        this.window = window;
        maxNsPerFrame = 1000000000 / fps;
    }
    
    @Override
    public void run() {
        double start = System.nanoTime();
        //update

        //render
        this.window.getGlWindow().display();

        double timeTaken = System.nanoTime() - start;

        try {
            Thread.sleep((long)(this.maxNsPerFrame - timeTaken) / 1000000); //convert to millis
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
            System.err.println("failed to control fps, time taken for frame:" + timeTaken);
        }
    }
}
