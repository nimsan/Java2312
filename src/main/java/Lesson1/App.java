package Lesson1;

public class App {
    public static void main(String[] args) {
        ComputerUser user = new ComputerUser();
        Guard guard = new Guard();
        boolean canPuss = guard.canPuss(user);
    }
}
