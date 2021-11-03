package Lesson21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HomeworkTask1 {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerArrayList.add(random.nextInt(100));
        }

        System.out.println("Количество уникальных целых чисел в списке: "+uniqueCount(integerArrayList));
    }
    public static int uniqueCount(ArrayList arrayList){
        if (arrayList.size()==0) return 0;
        HashSet<Integer> uniqueIntegers = new HashSet<>();
        uniqueIntegers.addAll(arrayList);
        return uniqueIntegers.size();
    }
}
