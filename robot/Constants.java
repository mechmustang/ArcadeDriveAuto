// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class OperatorConstants {
    public static final int kXBoxControllerPort = 2;
  }

  public static final int kLeftChassisMotorPort = 1;
  public static final int kRightChassisMotorPort = 0;
  public static final boolean kLeftChassisMotorsInverted = true;
  public static final boolean kRightChassisMotorsInverted = false;
  public static final double kChassisMaxOutputLow = 0.5;
  public static final double kChassisMaxOutputHigh = 1.0;

  public final class kXBox {
    public static final int buttonX = 1;
    public static final int buttonY = 4;
    public static final int buttonA = 2;
    public static final int buttonB = 3;
    public static final int buttonLeftBumper = 5;
    public static final int buttonRightBumper = 6;
    public static final int buttonLeftLowerBumper = 7;
    public static final int buttonRightLowerBumper = 8;
    public static final int buttonBack = 9;
    public static final int buttonStart = 10;
    public static final int leftXAxis = 0;
    public static final int leftYAxis = 1;
    public static final int rightXAxis = 4;
    public static final int rightYAxis = 3;
  }
}