package HomeWork_1;


public class App {

    public static void main(String[] args) {
        RunInterface training[] = new RunInterface[3];
        training[0] = new Human(400, 2);
        training[1] = new Robot(500,2);
        training[2] = new Cat(400, 2);
        for (RunInterface real : training){
            System.out.printf("пробежал дистанцию %d и прыгнул %d",real.runMovie(), real.);
        }

        Human human = new Human(600, 3);
        human.runMovie();

    }
}
