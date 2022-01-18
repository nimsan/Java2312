package HomeWork_1;

public class Robot implements RunInterface, JumpInterface{
    private int run;
    private double jump;

    public Robot(int run, double jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void runMovie() {
        if (run > 0 && run < 200) {
            System.out.println("Робот успешно пробежал дистанцию " + run + " метров");
        } else if (run < 0) {
            System.out.println("Робот никуда не побежал " + run + " метров");
        } else {
            System.out.println("Робот не смог пробежать дистанцию " + run + " метров");
        }

    }

    @Override
    public void jumpUp() {

    }
}
