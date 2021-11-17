package lesson25;

public class HomeworkTask2 {
    public static void main(String[] args) {
        int []integers=new int[]{1,3,6,9,};
        try{
            System.out.println("integers[5]="+integers[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array index out of bounds exception!");
        }
    }
}
