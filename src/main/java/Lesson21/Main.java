package Lesson21;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person anna=new Person ("Anna", 18);
        Person oleg=new Person ("Oleg", 20);
        Person ivan=new Person ("Ivan", 16);

        HashSet<Person> people = new HashSet<>();
        people.add(anna);
        people.add(oleg);
        people.add(ivan);

        System.out.println(people.toString());

        Person maksim=new Person ("Maksim", 22);
        Person anna2=new Person ("Anna", 16);

        people.add(maksim);
        people.add(anna2);

        for (Person p:
                people) {
                System.out.println(p.toString());
        }

        people.remove(maksim);
        people.remove(anna);
        people.remove(ivan);

        System.out.println(people.toString());

        System.out.println(people.contains(anna));
    }
}
