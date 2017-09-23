package org.firstinspires.ftc.robotcontroller.TeamCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TestDrive extends OpMode {


    private DcMotor frontLeftMotor;
    private DcMotor backLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backRightMotor;

    @Override
    public void init() {
//        frontLeftMotor = new MotorController("frontLeftMotor", hardwareMap, true, 0);
//        backLeftMotor = new MotorController("backLeftMotor", hardwareMap, true, 0);
//        frontRightMotor = new MotorController("frontRightMotor", hardwareMap, true, 0);
//        backRightMotor = new MotorController("backRightMotor", hardwareMap, true, 0);
        frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        backRightMotor = hardwareMap.dcMotor.get("backRightMotor");
    }

    @Override
    public void loop() {
        frontLeftMotor.setPower(gamepad1.left_stick_y);
        backLeftMotor.setPower(gamepad1.left_stick_y);
        backRightMotor.setPower(gamepad1.right_stick_y);
        frontRightMotor.setPower(gamepad1.right_stick_y);
    }
}