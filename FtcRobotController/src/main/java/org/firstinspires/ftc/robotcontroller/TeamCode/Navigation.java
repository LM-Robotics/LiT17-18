package org.firstinspires.ftc.robotcontroller.TeamCode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Navigation {

    //TODO: Calculate the robot speed and turn speed by testing it

    // This is the speed of the robot.
    private static final double SPEED = 1;
    // This is the speed that the robot turns
    private static final double TURN_SPEED = 1;
    // This is the power of the drive motors
    private static final double POWER = 100;

    static private double xPos;
    static private double yPos;
    static private double rotation;

    static private MotorController leftFrontMotor;
    static private MotorController leftBackMotor;
    static private MotorController rightFrontMotor;
    static private MotorController rightBackMotor;

    static void setNav(HardwareMap hardWareMap, double x, double y, double angle) {
        leftFrontMotor = new MotorController(MotorNames.FRONT_LEFT_DRIVE, hardWareMap, false, POWER);
        leftBackMotor = new MotorController(MotorNames.FRONT_LEFT_DRIVE, hardWareMap, false, POWER);
        rightFrontMotor = new MotorController(MotorNames.FRONT_RIGHT_DRIVE, hardWareMap, false, POWER);
        rightBackMotor = new MotorController(MotorNames.FRONT_RIGHT_DRIVE, hardWareMap, false, POWER);
        xPos = x;
        yPos = y;
        rotation = angle;
    }

    static void drive(double distance, boolean forward) throws InterruptedException {
        if (forward)
            turnOn(true, true);
        else
            turnOn(false, false);
        Thread.sleep((long) (distance / SPEED));
        turnOff();
    }

    static void turn(double angle, boolean clockWise) throws InterruptedException {
        if (clockWise)
            turnOn(true, false);
        else
            turnOn(false, true);
        Thread.sleep((long) (angle / TURN_SPEED));
        turnOff();
    }


    static void turnOn(boolean leftForward, boolean rightForward) {
        if (leftForward) {
            leftFrontMotor.setPower(POWER);
            leftBackMotor.setPower(POWER);
        } else {
            leftFrontMotor.setPower(-POWER);
            leftBackMotor.setPower(-POWER);
        }
        if (rightForward) {
            rightFrontMotor.setPower(POWER);
            rightBackMotor.setPower(POWER);
        } else {
            rightFrontMotor.setPower(-POWER);
            rightBackMotor.setPower(-POWER);
        }
    }

    static void turnOff() {
        leftBackMotor.setPower(0);
        leftFrontMotor.setPower(0);
        rightBackMotor.setPower(0);
        rightFrontMotor.setPower(0);
    }

    static void moveToPoint(double x, double y) throws InterruptedException {
        double dx = xPos - x;
        double dy = yPos - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        if(dx > 0) {
            if(dy > 0) {

            } else {

            }
        } else {
            if(dy > 0) {

            } else {

            }
        }
        double angle = 5;
        drive(distance, true);
    }
}
