package lesson27.homeworkTask8;

import java.util.Scanner;
import java.util.function.Supplier;

public class HomeworkTask8 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        System.out.println(reversString(str));

    }
    public static String reversString(String str){
        Supplier<String> supplier=()->{return new StringBuilder(str).reverse().toString();};
        return supplier.get();
    }
}
