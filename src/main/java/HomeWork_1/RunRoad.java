package HomeWork_1;

import java.util.Random;

public class RunRoad implements RunInterface {

    Random random = new Random();
    int distance = random.nextInt(600);

    @Override
    public void runMovie() {
        System.out.println("Дистанция составила = " + distance + " метров");
    }

}
