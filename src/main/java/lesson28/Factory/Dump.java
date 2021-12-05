package lesson28.Factory;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Dump {

    private static Dump instance;
    private Map<RobotDetails,Integer> dump=new HashMap<>(){{
        put(RobotDetails.HEAD,0);
        put(RobotDetails.BODY,0);
        put(RobotDetails.LEFT_LEG,0);
        put(RobotDetails.RIGHT_LEG,0);
        put(RobotDetails.LEFT_HAND,0);
        put(RobotDetails.RIGHT_HAND,0);
        put(RobotDetails.CPU,0);
        put(RobotDetails.RAM,0);
        put(RobotDetails.HDD,0);
    }};

    private Dump() {
    }

    public static Dump getInstance() {
        if (instance == null) {
            instance = new Dump();
        }
        return instance;
    }

    public void throwDetailIntoDump(){
        RobotDetails robotDetails=RobotDetails.getDetail();
        if(dump.containsKey(robotDetails)){
           dump.put(robotDetails, dump.get(robotDetails)+1);
        }else {
            dump.put(robotDetails, 1);
        }
    }

    public RobotDetails pickUpFromDump(){
        RobotDetails robotDetails=RobotDetails.getDetail();
            if(dump.containsKey(robotDetails) && dump.get(robotDetails)>0) {
                dump.put(robotDetails, dump.get(robotDetails) - 1);
            }else{
                robotDetails=null;
            }
        return robotDetails;
    }

}
