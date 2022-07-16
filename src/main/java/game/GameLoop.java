package game;

public class GameLoop extends Thread {
    /*desired fps: 60fps
    * run thread once every second / 60, sleep out the rest
    * */
    double maxNsPerFrame = 1000000000 / 60; //represents 1 nanosecond divided into 60

    public GameLoop() {
        //initialize things
    }
    
    @Override
    public void run() {
        double start = System.nanoTime();
        //update

        //render

        double timeTaken = System.nanoTime() - start;

        try {
            Thread.sleep((long)(maxNsPerFrame - timeTaken));
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("failed to control fps, time taken for frame:" + timeTaken);
        }
    }
}
