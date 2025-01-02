package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class PneumaticSolenoid extends SubsystemBase {

    private DoubleSolenoid solenoid;

    public PneumaticSolenoid(){
        solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.PNUEMATIC_IN, RobotMap.PNEUMATIC_OUT);
    }
    
}
