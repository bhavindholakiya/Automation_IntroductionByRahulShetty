package JavaPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class FindRunningNumber {
	public static final int TIME = 20000;
    public static final int MAX_Y = 500;
    public static final int MAX_X = 500;
    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Random random = new Random();
        while(true){
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(TIME);
        }
    }
}
