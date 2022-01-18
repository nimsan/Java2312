package Lesson1.interfaces;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        Pupil pupil = new Pupil();

        Studyable[] studyables = new Studyable[]{pupil, student};
        for (Studyable studyable : studyables) {
            studyable.study();

        }
        System.out.println(1);
        student.workVeryHard();
    }

}
