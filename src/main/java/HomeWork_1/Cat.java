package HomeWork_1;

public class Cat implements RunInterface, JumpInterface{
    private int run;
    private double jump;

    public Cat(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void runMovie() {
        if (run > 0 && run < 300) {
            System.out.println("Кот успешно пробежал дистанцию " + run + " метров");
        } else if (run < 0) {
            System.out.println("Кот никуда не побежал " + run + " метров");
        } else {
            System.out.println("Кот не смог пробежать дистанцию " + run + " метров");
        }

    }

    @Override
    public void jumpUp() {

    }
}