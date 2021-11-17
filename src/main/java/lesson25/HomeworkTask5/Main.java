package lesson25.HomeworkTask5;

import lesson25.HomeworkTask4.NegativeMeaningException;

public class Main {
    public static void main(String[] args) {
        Object cat=null;
        try{
            System.out.println(cat.toString());
        }catch (NullPointerException exception){
            try{
                throw new MyException("Null pointer exception ");
            }catch(MyException exception1){
                exception1.printStackTrace();
            }
        }
    }
}
