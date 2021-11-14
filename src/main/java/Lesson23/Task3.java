package Lesson23;

class Fruit3{

    private String fruitName = "Apple";

   static class FruitPit3{
        private int pit =10;

        public int getAmount(){
            Fruit3 apple=new Fruit3();
            return pit;
        }
    }
}


public class Task3 {
    public static void main(String[] args) {
        Fruit3.FruitPit3 apple=new Fruit3.FruitPit3();
        System.out.println(apple.getAmount());

    }
}
