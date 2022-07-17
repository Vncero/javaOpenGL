package engine.input;

public class Listener {
    protected static Handler handler;
    public static void setHandler(Handler handler) {
        Listener.handler = handler;
    }
}