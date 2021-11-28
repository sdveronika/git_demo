package lesson27.homeworkTask9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HomeworkTask9 {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("aac");
        strings.add("gaa");
        strings.add("abc");
        strings.add("bkl");
        strings.add("afr");
        strings.add("aaa");
        strings.add("aan");
        strings.add("afg");
        strings.add("aaR");
        strings.stream().filter(x -> x.matches("aa[a-zA-Z]+")).forEach(x->System.out.println(x));
    }
}
