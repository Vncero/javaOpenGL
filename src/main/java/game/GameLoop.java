package game;

public class GameLoop extends Thread {
    private double maxNsPerFrame;

    public GameLoop(double fps) {
         maxNsPerFrame = 1000000000 / fps;
    }
    
    @Override
    public void run() {
        double start = System.nanoTime();
        //update

        //render

        double timeTaken = System.nanoTime() - start;

        try {
            Thread.sleep((long)(this.maxNsPerFrame - timeTaken) / 1000000); //convert to millis
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
            System.err.println("failed to control fps, time taken for frame:" + timeTaken);
        }
    }
}
