package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class limitSwitch extends SubsystemBase {
    public static DigitalInput limit = new DigitalInput(8);
    public limitSwitch(){}
    public boolean getLimitSwitch() {
        return limit.get();
    }
}