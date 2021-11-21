package lesson26;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask3 {
    static final String reg1="[a-z]+";
    public static void main(String[] args) throws IOException {

        FileReader fileReader =new FileReader("2.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int symbol;
        while((symbol=fileReader.read())!=-1){
            stringBuilder.append((char) symbol);
        }

        Pattern pattern=Pattern.compile(reg1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringBuilder);
        boolean f= matcher.find();
        if(f){
        String wordWithLastCharacter=matcher.group();
        while (matcher.find()) {

            if(wordWithLastCharacter.toLowerCase().charAt(wordWithLastCharacter.length()-1)==matcher.group().toLowerCase().charAt(0)){
                System.out.println(wordWithLastCharacter);
            }
            wordWithLastCharacter=matcher.group();

        }
    }
        fileReader.close();
    }
}
