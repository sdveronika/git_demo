package lesson27.homeworkTask7;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class HomeworkTask7 {
    public static void main(String[] args) {
        String moneyAndCurrency= new Scanner(System.in).nextLine();
        amountOfMoney(moneyAndCurrency);

    }
    public static void amountOfMoney(String str){
        String[] s = str.split(" ");
        Function<String,Double> function= x->
                Double.parseDouble(x);
        Consumer<Double> consumer=x-> System.out.println(x/2.556);
        consumer.accept(function.apply(s[0]));
    }
}
