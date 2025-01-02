package team.gif.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkPIDController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class SparkController extends SubsystemBase {
    public static CANSparkMax motor_R = new CANSparkMax(RobotMap.SPARK_MAX_ID, CANSparkLowLevel.MotorType.kBrushless);
    public static SparkPIDController pidController_R = motor_R.getPIDController();



    private static DifferentialDrive drive;

    boolean isRunning = false;
    private double targetRPM;

    public SparkController(){

       motor_R.restoreFactoryDefaults();
       motor_R.setInverted(true);
       motor_R.setIdleMode(CANSparkBase.IdleMode.kBrake);
       pidController_R.setP(Constants.NEOConstants.kP_IDLE);
       pidController_R.setFF(Constants.NEOConstants.FF_IDLE);


        // turn off the drive train watchdog - otherwise it outputs unnecessary errors on the console
        drive.setSafetyEnabled(false);
    }

    public void setMotor(double percent){
        motor_R.setVoltage(percent);
    }

    public void setNEOMotorRPM(double rpm){
        pidController_R.setReference(rpm, CANSparkBase.ControlType.kVelocity);
    }

    public double getMotorRPM(){
        return motor_R.getEncoder().getVelocity();
    }
    public void stop(){
        motor_R.setVoltage(0);
    }


}
