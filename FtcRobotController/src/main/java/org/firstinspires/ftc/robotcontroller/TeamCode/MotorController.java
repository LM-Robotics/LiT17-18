package org.firstinspires.ftc.robotcontroller.TeamCode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.ArrayList;

public class MotorController {

    private DcMotor motor;
    private boolean motorState;
    private boolean buttonState = false;
    private double power;

    MotorController(String motorName, HardwareMap hardwareMap, boolean motorState, double power) {
        this.motorState = motorState;
        this.power = power;
        motor = hardwareMap.dcMotor.get(motorName);
    }

    // Sets power of all the motors
    void setPower(double power) {
        if (Math.abs(power) > 0.05) {
            this.power = power;
            if (motorState) {
                turnOn();
            } else {
                turnOff();
            }
        }
    }

    // Toggles the motor state
    private void toggle() {
        if (motorState) {
            turnOff();
        } else {
            turnOn();
        }
        motorState = !motorState;
    }


    // Toggles the motors when the button is pressed down
    public void toggleOnButtonStateChange(boolean button) {
        if (button && !buttonState)
            toggle();
        buttonState = button;
    }

    void turnOn() {
        motor.setPower(power);
    }


    void turnOff() {
        motor.setPower(0);
    }
}
