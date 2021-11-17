package lesson25;

import java.util.Random;

public class HomeworkTask7 {
    public static void main(String[] args) {
        try{
            method();
        }catch(NullPointerException exception){
            exception.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }

    public static void method(){
        Random random = new Random();
        Object cat=null;
        switch (random.nextInt(2)+1){
            case 1:
                System.out.println(cat.toString());
                break;
            case 2:
                System.out.println("No exceptions!");
                break;
            default:
                System.out.println("All is right");
        }
    }
}
