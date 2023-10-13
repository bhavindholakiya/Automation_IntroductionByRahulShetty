package JavaPrograms;

import java.awt.*;
import java.util.Random;

public class RunningNumber {
    public static final int TIME = 20000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
    public static void main(String[] args) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        Random random = new Random();
        while(true){
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(TIME);
        }
    }
}
