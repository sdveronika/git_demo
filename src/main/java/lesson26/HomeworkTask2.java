package lesson26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask2 {
    static final String reg1="[a-z]+";
    static final String reg2="^[aeyuio][a-z]*";
    public static void main(String[] args) throws IOException {

        FileReader fileReader =new FileReader("2.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int symbol;
        while((symbol=fileReader.read())!=-1){
            stringBuilder.append((char) symbol);
        }

        Pattern pattern=Pattern.compile(reg1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            if(stringBuilder.substring(matcher.start(), matcher.end()).toLowerCase().matches(reg2)) {
                System.out.println(stringBuilder.substring(matcher.start(), matcher.end()));
            }
        }

        fileReader.close();
    }
}
