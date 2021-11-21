package lesson26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        byte[] bytes=scanner.nextLine().getBytes();
        OutputStream fileOutputStream = new FileOutputStream("1.txt");
        fileOutputStream.write(bytes,0,bytes.length);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("1.txt");
        StringBuilder str=new StringBuilder();
        int symbol;
        while((symbol=fileInputStream.read())!=-1){
            str.append((char)symbol);
        }
        fileInputStream.close();
        System.out.println(str);
        String stringText=str.toString();
        System.out.println(stringText.replaceAll(" ","_"));
    }
}
