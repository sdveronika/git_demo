package lesson27.homeworkTask6;

import java.util.Scanner;
import java.util.function.Function;

public class HomeworkTask6 {
    public static void main(String[] args) {
       String moneyAndCurrency= new Scanner(System.in).nextLine();
        System.out.println(amountOfMoney(moneyAndCurrency));

    }
    public static double amountOfMoney(String str){
        String[] s = str.split(" ");
        Function<String,Double> function=x->
            Double.parseDouble(x);
        return function.apply(s[0])/2.556;
    }
}

