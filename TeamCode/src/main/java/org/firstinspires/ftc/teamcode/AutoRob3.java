package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// autonomous OpMode for Rob3
@Autonomous(name="AutonomousRob3", group="UltimateGoal")
public class AutoRob3 extends Auto {

    public double shooterRevTime = 2;
    public double flickerMoveTimeShoot = 0.5;
    public double flickerMoveTimeRetreat = 1;

    @Override
    public Robot getRobot() {
        return RobotTypes.newRob3(hardwareMap, telemetry);
    }

    @Override
    public void shootAllRings() {
        //encoderShoot(2);
        //encoderShoot(2);
        //encoderShoot(2);
        raiseElevator();
        robot.flicker.setPosition(1);
        robot.shooter.setPower(robot.ringSpeeds[2][1]);
        sleep((long)(shooterRevTime * 1000));
        for (int i = 0; i < 3; i++) {
            robot.flicker.setPosition(0);
            sleep((long)(flickerMoveTimeShoot * 1000));
            robot.flicker.setPosition(1);
            sleep((long)(flickerMoveTimeRetreat * 1000));
        }
        robot.flicker.setPosition(0);
        robot.shooter.setPower(0);
        raiseElevator();
    }
}
