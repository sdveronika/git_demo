package lesson27.homeworkTask5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class HomeworkTask5_1 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=x->x*x;
        List<Integer> integers=new ArrayList<>();
        integers.add(6);
        integers.add(58);
        integers.add(18);
        integers.add(100);
        integers.add(3);
        for (Integer element:
             integers) {
            System.out.println(unaryOperator.apply(element));
        }
    }
}
