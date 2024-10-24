package team.gif.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkPIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class SparkController extends SubsystemBase {
    public static CANSparkMax motor = new CANSparkMax(RobotMap.SPARK_MAX_ID, CANSparkLowLevel.MotorType.kBrushless);
    public static SparkPIDController pidController = motor.getPIDController();
    boolean isRunning = false;
    private double targetRPM;

    public SparkController(){
       motor.restoreFactoryDefaults();
       motor.setInverted(true);
       motor.setIdleMode(CANSparkBase.IdleMode.kBrake);
       pidController.setP(Constants.NEOConstants.kP_IDLE);
       pidController.setFF(Constants.NEOConstants.FF_IDLE);
    }

    public void setMotor(double percent){
        motor.setVoltage(percent);
    }

    public void setNEOMotorRPM(double rpm){
        pidController.setReference(rpm, CANSparkBase.ControlType.kVelocity);
    }

    public double getMotorRPM(){
        return motor.getEncoder().getVelocity();
    }
    public void stop(){
        motor.setVoltage(0);
    }


}
