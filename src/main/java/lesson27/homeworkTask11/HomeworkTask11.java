package lesson27.homeworkTask11;

import lesson27.homeworkTask10.Tester;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask11 {
    public static void main(String[] args) {
        lesson27.homeworkTask10.Tester nik = new lesson27.homeworkTask10.Tester("Nik", 4);
        lesson27.homeworkTask10.Tester rik = new lesson27.homeworkTask10.Tester("Rik", 1);
        lesson27.homeworkTask10.Tester mark=new lesson27.homeworkTask10.Tester("Mark", 5);
        lesson27.homeworkTask10.Tester adam=new lesson27.homeworkTask10.Tester("Adam", 6);
        lesson27.homeworkTask10.Tester jack=new lesson27.homeworkTask10.Tester("Jack", 3);
        lesson27.homeworkTask10.Tester ivan=new lesson27.homeworkTask10.Tester("Ivan",7);
        List<Tester> testers=new ArrayList<>();
        testers.add(nik);
        testers.add(rik);
        testers.add(mark);
        testers.add(adam);
        testers.add(jack);
        testers.add(ivan);
        List<String> names = testers.stream().map(x -> x.getName()).toList();
        for (String element:
             names) {
            System.out.println(element);
        }
    }
}
