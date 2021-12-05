package lesson28.Factory;

import java.util.Random;

public class Minion extends Thread{
    @Override
    public void run() {

        AssembledRobotParts assembledRobotParts = AssembledRobotParts.getInstance();
        Dump dump = Dump.getInstance();
        Random random = new Random();

            for (int i = 0; i < 50; i++) {
                synchronized (dump) {
                for (int j = 0; j < random.nextInt(4) + 1; j++) {
                    assembledRobotParts.addBroughtDetail(dump.pickUpFromDump());
                }
            }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
