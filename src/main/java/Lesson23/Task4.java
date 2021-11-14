package Lesson23;

class Fruit4{

    private String fruitName = "Apple";

    static class FruitPit4{
        private int pit =10;

        public int getAmount(){
            Fruit3 apple=new Fruit3();
            return pit;
        }

        public static void innerStaticMethod(){
            System.out.println("inner static method in inner static class FruitPit4");
        }

    }
}


public class Task4 {
    public static void main(String[] args) {
        Fruit4.FruitPit4.innerStaticMethod();
    }
}
