package org.firstinspires.ftc.robotcontroller.TeamCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TeleOpMain extends OpMode{

    private MotorController frontLeftMotor;
    private MotorController backLeftMotor;
    private MotorController frontRightMotor;
    private MotorController backRightMotor;

    @Override
    public void init() {
        frontLeftMotor = new MotorController(MotorNames.FRONT_LEFT_DRIVE, hardwareMap, true, 0);
        backLeftMotor = new MotorController(MotorNames.BACK_LEFT_DRIVE, hardwareMap, true, 0);
        frontRightMotor = new MotorController(MotorNames.FRONT_RIGHT_DRIVE, hardwareMap, true, 0);
        backRightMotor = new MotorController(MotorNames.BACK_RIGHT_DRIVE, hardwareMap, true, 0);
    }

    @Override
    public void loop() {
        frontLeftMotor.toggleOnButtonStateChange(gamepad1.y);
        backLeftMotor.toggleOnButtonStateChange(gamepad1.x);
        backRightMotor.toggleOnButtonStateChange(gamepad1.b);
        frontRightMotor.toggleOnButtonStateChange(gamepad1.a);
    }
}
