package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class SparkMotorControl extends Command {

    public SparkMotorControl(){
        super();

    }
    @Override
    public void initialize(){

    }
    @Override
    public void execute(){
        System.out.println("Neo is running. ");
        Robot.sparky.setMotor(Constants.NEOConstants.NEO_VOLT);

    }
    @Override
    public boolean isFinished(){
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        Robot.sparky.setMotor(0);
    }

}
