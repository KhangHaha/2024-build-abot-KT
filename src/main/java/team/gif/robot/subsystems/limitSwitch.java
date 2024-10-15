package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;


public class limitSwitch extends SubsystemBase {
    public static DigitalInput limit = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);
    public limitSwitch(){}
    public boolean getLimitSwitch() {
        return limit.get();
    }
}