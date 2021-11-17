package lesson25.HomeworkTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int age = new Scanner(System.in).nextInt();
            if (age<0){
                throw new NegativeMeaningException("Age can't be negative!");
            }
                Person person = new Person(age);
        } catch (NegativeMeaningException exception) {
            exception.printStackTrace();
        }
    }
}
