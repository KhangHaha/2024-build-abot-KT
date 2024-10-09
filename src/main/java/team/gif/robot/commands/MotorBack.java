package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

public class MotorBack extends Command {
    public MotorBack(){
        super();
        addRequirements(Robot.motor);

    }
    @Override
    public void initialize() {
        System.out.println("Started Talon");
    }


    @Override
    public void execute() {
        System.out.println("Running Motor");
        Robot.motor.moveCIM(-0.2);

    }


    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        System.out.println("Stopped Talon");
        Robot.motor.moveCIM(0);
    }
}
