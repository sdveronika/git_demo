package lesson27.homeworkTask1;

import lesson27.homeworkTask1.GetSquareInfo;

import java.util.Locale;
import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        String temp="";
        double a;
        double b;
       GetSquareInfo getSquareInfo=new GetSquareInfo();
        while (flag){
            System.out.println("Shapes:\n"+
                    "1.Square\n" +
                    "2.Rectangle\n" +
                    "3.Triangle\n" +
                    "Select the shape for which you want to find the area.");
            temp=sc.next();
            switch (temp){
                case "1":
                    System.out.println("What is the side of the square?");
                    a=sc.nextDouble();
                    getSquareInfo.testSqure(a,a,(double x,double y)->{return x*y;});
                    break;
                case "2":
                    System.out.println("Enter the first side of the rectangle");
                    a=sc.nextDouble();
                    System.out.println("Enter the second side of the rectangle");
                    b=sc.nextDouble();
                    getSquareInfo.testSqure(a,b,(double x,double y)->{return x*y;});
                    break;
                case "3":
                    System.out.println("Enter the side of the triangle to which the height is plotted");
                    a=sc.nextDouble();
                    System.out.println("Enter the height of the triangle");
                    b= sc.nextDouble();
                    getSquareInfo.testSqure(a,b,(double x, double h)->{return x*h/2;});
                    break;
                default:
                    System.out.println("The shape is selected incorrectly.");
            }
            System.out.println("Do you want to continue?(yes/no)");
            temp=sc.next();
            if(temp.toLowerCase(Locale.ROOT).equals("no")){
                flag=false;
            }
        }
    }
}
