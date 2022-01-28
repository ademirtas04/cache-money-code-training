package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {   
    //Motor Variable setup
    private static TalonSRX motor1= new TalonSRX(RobotMap.SHOOTER_MOTOR_1_ID);
    private static TalonSRX motor2= new TalonSRX(RobotMap.SHOOTER_MOTOR_2_ID);
    
    public static void setMotor1(double speed){
        motor1.set(ControlMode.PercentOutput, speed);
 
    }
    public static void setMotor2(double speed){
        motor2.set(ControlMode.PercentOutput, speed);
    }
    public static void shoot(double right){
        setMotor1(right);
        setMotor2(right);
    }
    @Override
    protected void initDefaultCommand() {
        
    }
}