import com.jogamp.newt.opengl.GLWindow;
import engine.GameLoop;
import engine.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new Window().setup(() -> System.exit(0), 1080, 720);
        Handler handler = new Handler() {
            //implement handler functions
            @Override
            void handleClick(MouseEvent m) {
                
            }
            @Override
            void handleKeyDown(KeyEvent k) {

            }
            @Override
            void handleKeyUp(KeyEvent k) {

            }
        };
        GameLoop gameLoop = new GameLoop();
        gameLoop.start();
    }
}
