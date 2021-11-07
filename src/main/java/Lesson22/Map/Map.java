package Lesson22.Map;

import java.util.*;

public class Map {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Клубника", "Красный");
        map.put("Клюква", "Красный");
        map.put("Банан", "Желтый");
        map.put("Яблоко", "Зеленый");
        map.put("Груша", "Зеленый");
        map.put("Голубика", "Голубой");

        List<String> valuesList= new ArrayList<>();
        valuesList.addAll(map.values());

        Set<String> valuesSet=new HashSet<>();
        valuesSet.addAll(valuesList);

        System.out.println(valuesList.size()>valuesSet.size());

    }

}
