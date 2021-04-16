package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class RobotTypes {

    public static Robot newFuji(HardwareMap map, Telemetry tele) {
        return new Robot(map, tele,
            new double[]{Robot.tprHdHex60, Robot.tprHdHex60, Robot.tprHdHex60, Robot.tprHdHex60,
                Robot.tprCoreHex, Robot.tprCoreHex, Robot.tprHdHex, Robot.tprNeveRest, 0},
            new boolean[]{false, false, false, false, false, false, false, false, false},
            new boolean[]{false, false, false, false, false},
            new double[]{0.2, 0.5, 0.55, 0.51},
            true,
            false,
            true,
            false);
    }

    public static Robot newBabi(HardwareMap map, Telemetry tele) {
        return new Robot(map, tele,
            new double[]{Robot.tprHdHex20, Robot.tprHdHex20, Robot.tprHdHex20, Robot.tprHdHex20,
                Robot.tprCoreHex, 0, Robot.tprHdHex, Robot.tprCoreHex, 0},
            new boolean[]{false, false, false, false, false, false, false, false, false},
            new boolean[]{true, true, true, true, false},
            new double[]{0.2, 0.5, 1, 0.51},
            true,
            false,
            true,
            false);
    }

    public static Robot newRob3(HardwareMap map, Telemetry tele) {
        double frontDriveGear = 30.0 / 36.0;
        double frontDriveLerp = 0.3;
        double frontDriveSpeed = lerp(frontDriveGear, 1, frontDriveLerp);
        return new Robot(map, tele,
            new double[]{Robot.tprHdHex20 * frontDriveSpeed, Robot.tprHdHex20, Robot.tprHdHex20 * frontDriveSpeed, Robot.tprHdHex20,
                Robot.tprHdHex, 0, Robot.tprHdHex, Robot.tprHdHex60, Robot.tprHdHex},
            new boolean[]{false, false, false, false, false, false, false, false, true},
            new boolean[]{false, false, true, true, false},
            new double[]{0.3, 0.7, 1, 0.73},
            true,
            true,
            true,
            true);
    }

    public static double lerp(double start, double end, double interpolation) {
        return start + (end - start) * interpolation;
    }
}
