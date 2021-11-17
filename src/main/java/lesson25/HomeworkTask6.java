package lesson25;

import java.util.Random;

public class HomeworkTask6 {
    public static void main(String[] args) {
        try{
           method();
        }catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            exception.printStackTrace();
        }
    }

    public static void method(){
        Random random = new Random();
        Object cat = null;
        int []integers=new int[]{1,2,3,4,5};
        switch (random.nextInt(3)+1){
            case 1:
                System.out.println(integers[10]);
                break;
            case 2:
                System.out.println(cat.toString());
                break;
            case 3:
                System.out.println(10/0);
                break;
            default:
                System.out.println("All is right!");
        }
    }
}
