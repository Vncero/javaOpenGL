package engine.input;

import java.util.Map;

//this is a demo for saving input state for later reference
public class InputMap {
    public static Character lastKeySymbol = null;
    public static Map<Character, Double> lastClick = Map.of(
      'x', 0d,
      'y', 0d
    ); //java maps are weird
}
