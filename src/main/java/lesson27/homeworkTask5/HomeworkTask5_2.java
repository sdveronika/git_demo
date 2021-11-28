package lesson27.homeworkTask5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class HomeworkTask5_2 {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator=(x,y)->x+" "+y;
        List<String> strings1=new ArrayList<>();
        strings1.add("Hello");
        strings1.add("World");
        strings1.add("Green");
        strings1.add("Apple");
        strings1.add("Blue");
        strings1.add("Sky");
        for (int i = 0; i < strings1.size()-1; i++) {
            System.out.println(binaryOperator.apply(strings1.get(i),strings1.get(i+1)));
        }
    }
}
