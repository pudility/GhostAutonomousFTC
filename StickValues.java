package org.GhostAutonomousFTC;

import org.GhostAutonomousFTC.ControllerValues;

import java.util.ArrayList;
import java.util.Arrays;

public class StickValues extends ControllerValues<Double> {
  public final static String leftStickY="ly";
  public final static String rightStickY="ry";
  public final static String leftStickX="lx";
  public final static String rightStickX="rx";
  
  public StickValues() {
    super(0.0,
          new ArrayList<Double>(Arrays.asList(new Double[]{0.0,0.0,0.0,0.0})),
          new ArrayList<String>(Arrays.asList(new String[]{leftStickY,rightStickY,leftStickX,rightStickX}))
          );
  }
}
