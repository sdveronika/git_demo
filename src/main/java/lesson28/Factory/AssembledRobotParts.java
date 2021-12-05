package lesson28.Factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AssembledRobotParts {


    private static AssembledRobotParts instance;

    private Map<RobotDetails,Integer> assembledRobotParts=new HashMap<>(){{
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

    private AssembledRobotParts() {
    }

    public static AssembledRobotParts getInstance() {
        if (instance == null) {
            instance = new AssembledRobotParts();
        }
        return instance;
    }

    public void addBroughtDetail(RobotDetails robotDetails){
        if(assembledRobotParts.containsKey(robotDetails)){
            assembledRobotParts.put(robotDetails, assembledRobotParts.get(robotDetails)+1);
        }else if(robotDetails!=null){
            assembledRobotParts.put(robotDetails,1);
        }
    }

    public int getCollectedRobots(){
        Collection<Integer> list = assembledRobotParts.values();
        return list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
    }

}
