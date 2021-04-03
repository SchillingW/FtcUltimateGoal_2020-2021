package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// autonomous OpMode for Rob3
@Autonomous(name="AutonomousRob3", group="UltimateGoal")
public class AutoRob3 extends Auto {

    public double shooterRevTime = 1;
    public double flickerMoveTime = 0.5;

    @Override
    public Robot getRobot() {
        return RobotTypes.newRob3(hardwareMap, telemetry);
    }

    @Override
    public void shootAllRings() {
        //encoderShoot(2);
        //encoderShoot(2);
        //encoderShoot(2);
        robot.shooter.setPower(robot.ringSpeeds[3][1]);
        sleep((long)(shooterRevTime * 1000));
        for (int i = 0; i < 3; i++) {
            robot.flicker.setPosition(1);
            sleep((long)(flickerMoveTime * 1000));
            robot.flicker.setPosition(0);
            sleep((long)(flickerMoveTime * 1000));
        }
        robot.shooter.setPower(0);
    }
}
