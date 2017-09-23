package org.firstinspires.ftc.robotcontroller.TeamCode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcontroller.internal.FtcRobotControllerActivity;

import java.util.List;

public class SensorTest extends OpMode{

    @Override
    public void init() {
        SensorManager mSensorManager = (SensorManager) FtcRobotControllerActivity.context.getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> sensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor: sensorList) {
            Log.i("logtag", sensor.getName());
            Log.i("logtag", sensor.toString());
            //Log.i("logtag", sensor.getStringType());
        }

        Sensor mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);

        SensorEventListener eventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                telemetry.addData("X: ", sensorEvent.values[0]);
                telemetry.addData("Y: ", sensorEvent.values[1]);
                telemetry.addData("Z: ", sensorEvent.values[2]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
    }

    @Override
    public void loop() {
    }
}
