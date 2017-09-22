package org.firstinspires.ftc.robotcontroller.TeamCode;

import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Pompeii: Teleop Tank", group="Pompeii")
public class TeleOp extends OpMode {
    // TeleOp
    MotorController motor;
    // Initialization code that happens TeleOp starts
    @Override
    public void init() {
        motor = new MotorController(hardwareMap, false, 100);
        motor.add("motor");
    }

    @Override
    public void loop() {

        motor.toggleOnButtonStateChange(gamepad1.x);
    }
}
//              \═─←¬__
//               \     \
//                |     |
//             ___|     |___
//            (__-╝_____╚-__)
//               |   • •  |
//               | |▄▄▄| |
//              _\_|   |_/_
//         ____|\__╘,,,╛__/|____
//        / ---┌───|   |───┐---\
//      //     | Campbells |    \\
//     //      |           |    \\
//    //       |-__▄███▄__-|    \\
//   ╘-╛       |   ▀███▀   |    ╘-╛
//             |           |
//             |    SOUP   |
//             ╚-_________-╝
//              | |     | |
//              | |     | |
//              | |     | |
//             _| |     | |_
//            ╘-==╛     ╘=-╛