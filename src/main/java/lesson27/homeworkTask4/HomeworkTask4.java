package lesson27.homeworkTask4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HomeworkTask4 {
    public static void main(String[] args) {
        Predicate<Integer> predicate=x->x>0;
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(-2);
        integers.add(8);
        integers.add(100);
        integers.add(0);
        integers.add(70);
        integers.add(-10);
        integers.add(-78);
        integers.add(48);
        for (Integer element:
             integers) {
            if(predicate.test(element)){
                System.out.println(element);
            }
        }
    }
}
