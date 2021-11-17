package lesson25;

public class HomeworkTask1 {
    public static void main(String[] args) {
        Object cat=null;
        try{
            cat.toString();
        }catch (NullPointerException exception){
            System.out.println("Null pointer exception!");
        }
    }
}
