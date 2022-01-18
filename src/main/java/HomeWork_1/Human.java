package HomeWork_1;

public class Human implements RunInterface, JumpInterface {
    private int run;
    private double jump;

    public Human(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }


    @Override
    public void runMovie() {
        if (run > 0 && run < 500) {
            System.out.println("Человек успешно пробежал дистанцию " + run + " метров");
        } else if (run < 0) {
            System.out.println("Человек никуда не побежал " + run + " метров");
        } else {
            System.out.println("Человек не смог пробежать дистанцию " + run + " метров");
        }
    }

    @Override
    public void jumpUp() {

    }

}
