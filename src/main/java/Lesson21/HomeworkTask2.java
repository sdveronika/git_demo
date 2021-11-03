package Lesson21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {

        String text=new Scanner(System.in).nextLine();
        HashSet<String> uniqueWords = new HashSet<>();

        for (String str:
                text.split(" ")) {
            uniqueWords.add(str);
        }

        System.out.println("Уникальные слова из текста: "+uniqueWords);
    }
}
