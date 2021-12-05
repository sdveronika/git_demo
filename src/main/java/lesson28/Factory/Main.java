package lesson28.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        AssembledRobotParts assembledRobotParts = AssembledRobotParts.getInstance();
        Dump dump = Dump.getInstance();

        Thread factory = new Thread(new Factory());
        Minion minion = new Minion();

        factory.start();
        minion.start();

        minion.join();

        System.out.println("\nЗа 50 ночей безумный ученый собрал "+assembledRobotParts.getCollectedRobots()+" роботов.");

    }
}
