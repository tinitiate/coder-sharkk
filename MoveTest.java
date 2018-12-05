package code.shark;

import java.awt.AWTException;
import java.awt.Robot;

public class MoveTest {

    public static void main(String[] args) throws InterruptedException {

        int sX = 0;
        int sY = 0;

        while (true) {

            try {
                if (sX == 500) {
                    sX = 54;
                    sY = 34;
                }
                Thread.sleep(20000);

                // Move the cursor
                Robot robot = new Robot();
                robot.mouseMove(sX, sY);
                sX++;
                sY++;

            } catch (AWTException e) { }
        }
    }
}
