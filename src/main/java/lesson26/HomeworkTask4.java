package lesson26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask4 {
    static final String reg="\\d+";
    public static void main(String[] args) throws IOException {

        FileReader reader= new FileReader("1.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<String> lines=bufferedReader.lines().toList();
        String longNumber;
        int i=1;
        for (String str:
             lines) {
            longNumber=findLongNumber(str);
            if(!(longNumber.equals(""))){
               System.out.println("The length of the longest number in the line "+i+" is "+longNumber.length()+" and this number is "+longNumber);           }
                i++;
        }
        bufferedReader.close();
        reader.close();

    }
    public static String findLongNumber(String line){
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(line);
        String longNumber="";
        while(matcher.find()){
                if(matcher.group().length()>longNumber.length()){
                    longNumber=matcher.group();
                }
            }
        return longNumber;
    }
}
