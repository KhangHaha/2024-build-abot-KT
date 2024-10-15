package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

public class JoyStickControl extends Command {
    public JoyStickControl(){
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
        double x = -Robot.oi.driver.getLeftY();
        Robot.motor.moveCIM(x);

    }


    @Override
    public boolean isFinished() {
        return false;
    }


    @Override
    public void end(boolean interrupted) {
    }
}
