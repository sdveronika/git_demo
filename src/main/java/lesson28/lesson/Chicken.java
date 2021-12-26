package lesson28.lesson;

public class Chicken extends Thread{
    public void run(){
        System.out.println("Chicken");
    }

    public static void main(String[] args) throws InterruptedException {
        Chicken chicken = new Chicken();
        Thread egg1 = new Thread(new Egg());
        Thread egg2 = new Thread(new Egg());
        Thread egg3 = new Thread(new Egg());
        Thread egg4 = new Thread(new Egg());


        egg1.start();
//        egg1.join();
        egg2.start();
//        egg2.join();
        egg3.start();
//        egg3.join();
        egg4.start();
        egg4.join();
        chicken.start();

    }
}
class Egg implements Runnable{
    @Override
    public void run() {
        System.out.println("Egg");
    }
}