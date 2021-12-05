package lesson28.Factory;

import java.util.Random;

public enum RobotDetails {
    HEAD,
    BODY,
    LEFT_LEG,
    RIGHT_LEG,
    LEFT_HAND,
    RIGHT_HAND,
    CPU,
    RAM,
    HDD;

    private static Random random=new Random();

    public static RobotDetails getDetail(){
        int randomItem=random.nextInt(9);
        switch (randomItem){
            case 0:
                return RobotDetails.HEAD;
            case 1:
                return RobotDetails.BODY;
            case 2:
                return RobotDetails.LEFT_LEG;
            case 3:
                return RobotDetails.RIGHT_LEG;
            case 4:
                return RobotDetails.LEFT_HAND;
            case 5:
                return RobotDetails.RIGHT_HAND;
            case 6:
                return RobotDetails.CPU;
            case 7:
                return RobotDetails.RAM;
            case 8:
                return RobotDetails.HDD;
            default:
                throw new IllegalArgumentException("Item is incorrect. Item: "+randomItem);
        }
    }
}
