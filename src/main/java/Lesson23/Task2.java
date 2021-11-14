package Lesson23;
class Fruit2{

    private String fruitName;
    private FruitPit2 fruitPits2;

    class FruitPit2{
       public final static int pit=10;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Fruit2 apple = new Fruit2();
        System.out.println(Fruit2.FruitPit2.pit);
    }
}
