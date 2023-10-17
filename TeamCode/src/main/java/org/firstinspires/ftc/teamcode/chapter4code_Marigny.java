package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp()
public class chapter4code_Marigny extends OpMode {
    @Override
    public void init() {}
    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        if(gamepad1.a) {
            speedForward = speedForward * 1;
            telemetry.addData("y = x" ,gamepad1.left_stick_y = gamepad1.left_stick_x );
            telemetry.addData("x = y" ,gamepad1.left_stick_x = gamepad1.left_stick_y );
        }
        else {
            speedForward = speedForward * 0.5;
        }}}