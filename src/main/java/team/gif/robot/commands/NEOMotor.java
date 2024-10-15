package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class NEOMotor extends Command {

    public NEOMotor(){
        super();

    }
    @Override
    public void initialize(){

    }
    @Override
    public void execute(){
        System.out.println("Neo is running. ");
        Robot.sparky.setSparky(Constants.NEO_PERCENT);

    }
    @Override
    public boolean isFinished(){
        return false;
    }
    @Override
    public void end(boolean interrupted) {
        Robot.sparky.setSparky(0);
    }

}
