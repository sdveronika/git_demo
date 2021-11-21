package lesson26;

import java.io.*;

public class HomeworkTask1 {
    public static void main(String[] args) throws IOException {

        FileReader reader= new FileReader("2.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line=bufferedReader.readLine();
        int i=1;
        while(line!=null){
            System.out.println(i+"  " +line);
            line=bufferedReader.readLine();
            i++;
        }
        bufferedReader.close();
    }

}
