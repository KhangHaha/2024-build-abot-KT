package team.gif.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class SparkController extends SubsystemBase {

    CANSparkMax sparky = new CANSparkMax(RobotMap.SPARK_MAX_ID, CANSparkLowLevel.MotorType.kBrushless);
    public SparkController(){
    }
    public void setSparky(double percent){
        sparky.setVoltage(percent);
    }
}
