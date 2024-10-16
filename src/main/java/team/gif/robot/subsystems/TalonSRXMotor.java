package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class TalonSRXMotor extends SubsystemBase {
    public static double output = .2;
    private final TalonSRX motor;

    public TalonSRXMotor() {
        motor = new TalonSRX(RobotMap.TALON_ID);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);
    }


    public void moveCIM(double x) {
        System.out.println(x);
        motor.set(ControlMode.PercentOutput,x);
    }

}
