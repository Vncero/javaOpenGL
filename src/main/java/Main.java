import com.jogamp.newt.opengl.GLWindow;
import engine.GameLoop;
import engine.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        window.setup(() -> System.exit(0), 1080, 720);
        Handler handler = new Handler() {
            //implement handler functions
            void handleClick(MouseEvent m) {
                
            }
            void handleKeyDown(KeyEvent k) {

            }
            void handleKeyUp(KeyEvent k) {

            }
        };
        GameLoop gameLoop = new GameLoop();
        gameLoop.start();
    }
}
