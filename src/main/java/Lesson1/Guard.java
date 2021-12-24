package Lesson1;

public class Guard {

    boolean canPuss(User user) {
        return user.getAgeBefore18() == 0;
    }

}
