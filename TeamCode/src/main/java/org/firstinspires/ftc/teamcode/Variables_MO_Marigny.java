package org.firstinspires.ftc.teamcode;
import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "Variables_MO_Marigny")
public class Variables_MO_Marigny extends OpMode{
    private DcMotor motor1;
    @Override
    public void init () {
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
        motor1  = hardwareMap.get(DcMotor.class, "motor1");
    }
    @Override
    public void loop () {
        if(gamepad1.a) {
            motor1.setPower(1);
        }
        telemetry.update();
    }
}

