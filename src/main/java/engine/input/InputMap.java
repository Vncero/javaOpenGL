package engine.input;

import java.util.Map;
import java.util.HashMap;
import static java.util.Map.entry;

//this is a demo for saving input state for later reference
public class InputMap {
    public static Character lastKeySymbol = null;
    public static HashMap<Character, Double> lastClickCoords = new HashMap<>(Map.ofEntries(
      entry('x', 0d),
      entry('y', 0d)
    ));
}
