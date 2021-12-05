package lesson28.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Factory implements Runnable{

    @Override
    public void run() {

        Random random=new Random();
        Dump dump=Dump.getInstance();
        int iteration;

        for (int i = 0; i < 50; i++) {

            iteration= random.nextInt(4)+1;

            if(i==0){
                iteration=20;
            }
            synchronized (dump){
            for (int j = 0; j < iteration; j++) {
                dump.throwDetailIntoDump();
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
