package lesson27.homeworkTask3;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask3 {
    public static void main(String[] args) {
        IOperation operation=x->{
        if(x.matches("xx[a-zA-z]+")){
        System.out.println(x);
         }};
        List<String> strings=new ArrayList<>();
        strings.add("rrklidxx");
        strings.add("xxxxl");
        strings.add("xxsdefr");
        strings.add("xkdkxxvg");
        strings.add("xxfkolresd");
        strings.add("xxryjknmg");
        for (String str:
             strings) {
            check(str,operation);
        }
    }
    public static void check(String str, IOperation operation){
        operation.print(str);
    }
}
