package Lesson23;
class Fruit{

    private String fruitName;
    private FruitPit fruitPits;

    Fruit(String name,int pits){
        this.fruitName=name;
        this.fruitPits=new FruitPit(pits);
    }

    public int getNumberOfPits(){
        return fruitPits.getAmount();
    }

    class FruitPit{

        private int pit;

        FruitPit(int pits){
            pit=pits;
        }
        public int getAmount(){
            return pit;
        }
    }
}


public class Task1 {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 10);
        System.out.println(apple.getNumberOfPits());

    }
}
