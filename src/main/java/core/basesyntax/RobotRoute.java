package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int robotX = robot.getX();
        int robotY = robot.getY();
        Direction mainDirection = toX > robotX ? Direction.RIGHT: Direction.LEFT;
        if (toX > robotX) {
            while (robot.getDirection() != mainDirection) {
                robot.turnRight();

            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
         else if (toX < robotX) {
            while (robot.getDirection() != mainDirection) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
         else if (toX == robotX) {
             if (toY > robotY) {
                 Direction UpDirection = Direction.UP;
                 if (robot.getDirection() == Direction.RIGHT) {
                     robot.turnLeft();
                 }
                 if (robot.getDirection() == Direction.LEFT) {
                     robot.turnRight();
                 }
                 while (robot.getY() != toY) {
                     robot.stepForward();
                 }

             }

            if (toY < robotY) {
                Direction UpDirection = Direction.DOWN;
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                }
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
         }
    }
}


