package lesson27.homeworkTask2;

public class HomeworkTask2 {
    public static void main(String[] args) {

        IOperation operation=(a,b)->{
            if(a<b){
                System.out.println(a);

            } else if(a==b){
                System.out.println(0);
            }else{
                System.out.println(b);
            }
        };
        operation.print(2,7);
        operation.print(9,1);
        operation.print(1,1);
    }
}
