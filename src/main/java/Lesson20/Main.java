package Lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> grades=new ArrayList<>();
        ListIterator<Integer> gradesIterator = grades.listIterator();
        for (int i = 0; i < 10; i++) {
            gradesIterator.add(random.nextInt(10)+1);
        }
        System.out.println("Исходный список оценок: "+grades);
        gradesIterator=grades.listIterator(0);
        while (gradesIterator.hasNext()){
            if(gradesIterator.next()<4){
                gradesIterator.remove();
            }
        }
        System.out.println("Модифицированный список оценок: "+grades);
        System.out.println("");


        int max=0;
        ArrayList<Integer> grades1=new ArrayList<>();
        ListIterator<Integer> grades1Iterator = grades1.listIterator();
        for (int i = 0; i < 10; i++) {
            grades1Iterator.add(random.nextInt(10)+1);
        }
        System.out.println("Исходный список оценок: "+grades1);
        grades1Iterator=grades1.listIterator(0);
        while (grades1Iterator.hasNext()){
            if(grades1Iterator.next()>max){
                max= grades1Iterator.previous();
            }
        }
        System.out.println("Максимальная оценка из списка: "+max);
        System.out.println("");

        ArrayList<String> students=new ArrayList<>();
        students.add("Марк");
        students.add("Олег");
        students.add("Алексей");
        students.add("Максим");
        students.add("Николай");
        students.add("Иван");
        students.add("Роман");
        students.add("Александр");
        students.add("Евгений");
        students.add("Даниил");
        ListIterator<String> studentsIterator = students.listIterator(students.size());
        System.out.println("Вывод списка учеников в обратном порядке при помощи ListIterator:");
        int i=10;
        while(studentsIterator.hasPrevious()){
            System.out.println(i+". "+studentsIterator.previous());
            i--;
        }
        System.out.println("");
        System.out.println("Вывод списка учеников в обратном порядке при помощи цикла:");
        for (int k=students.size()-1; k>-1; k--){
            System.out.println(k+1+". "+students.get(k));
        }
    }
}

