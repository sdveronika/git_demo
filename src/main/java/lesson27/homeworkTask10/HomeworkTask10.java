package lesson27.homeworkTask10;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask10 {
    public static void main(String[] args) {
        Tester nik = new Tester("aaNik", 4);
        Tester rik = new Tester("bbRik", 1);
        Tester mark=new Tester("bbMark", 5);
        Tester adam=new Tester("aaAdam", 6);
        Tester jack=new Tester("bbJack", 3);
        Tester ivan=new Tester("bbIvan",7);
        List<Tester> testers=new ArrayList<>();
        testers.add(nik);
        testers.add(rik);
        testers.add(mark);
        testers.add(adam);
        testers.add(jack);
        testers.add(ivan);
        testers.stream()
                .filter(x->x.getId()>3)
                .filter(x->x.getName()
                        .matches("bb[a-zA-Z]+"))
                .forEach(x-> System.out.println(x.toString()));
    }
}
