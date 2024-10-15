package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.CIM;

public class MotorForward extends Command {
    public MotorForward(){
        super();
        addRequirements(Robot.motor);

    }

    // Called when the command is initially scheduled.

    public void initialize() {
        System.out.println("Started Talon");

    }

    @Override
    public void execute() {
        System.out.println("Running Motor");
        Robot.motor.moveCIM(0.2);
    }


    @Override
    public boolean isFinished() {
        return false;
    }


    @Override
    public void end(boolean interrupted) {
        System.out.println("Stopped Talon");
        Robot.motor.moveCIM(0);


    }

}
