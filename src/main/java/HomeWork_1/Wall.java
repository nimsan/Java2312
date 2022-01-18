package HomeWork_1;

import java.util.Random;

public class Wall implements JumpInterface {
    Random random = new Random();
    int wall = random.nextInt(600);
    @Override
    public void jumpUp() {
        System.out.println("Стена высотой "+wall);
    }
}
