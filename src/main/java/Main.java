import com.jogamp.newt.opengl.GLWindow;
import engine.GameLoop;
import engine.Window;

public class Main {

    public static void main(String[] args) {
        GLWindow window = Window.createWindow();
        Window.defaultWindowSetup(window);
        GameLoop gameLoop = new GameLoop();
        gameLoop.start();
    }
}
