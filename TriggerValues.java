package org.GhostAutonomousFTC;

import org.GhostAutonomousFTC.ControllerValues;

import java.util.ArrayList;
import java.util.Arrays;

public class TriggerValues extends ControllerValues<Double> {
  public final static String rightTrigger="rt";
  public final static String leftTrigger="lt";

  public TriggerValues() {
    super(0.0,
          new ArrayList<Double>(Arrays.asList(new Double[]{0.0,0.0,0.0,0.0})),
          new ArrayList<String>(Arrays.asList(new String[]{leftTrigger,rightTrigger}))
          );
  }
}
