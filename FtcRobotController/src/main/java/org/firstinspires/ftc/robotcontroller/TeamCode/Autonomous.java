package org.firstinspires.ftc.robotcontroller.TeamCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Pompeii: Autonomous", group="Pompeii")
public class Autonomous extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        Navigation.setNav(hardwareMap, 0, 0, 0);

        waitForStart();


    }
}
