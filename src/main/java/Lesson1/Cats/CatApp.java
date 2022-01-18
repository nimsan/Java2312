package Lesson1.Cats;

import java.util.Arrays;

public class CatApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Коричневый", 4);
        Cat cat2 = new Cat("Мурзик", "Белый", 5);
        Cat[] cats = new Cat[2];
        cat1.putMeInArray(cats, 0);
        cat2.putMeInArray(cats, 1);
        System.out.println(Arrays.toString(cats));
        System.out.println(cat1);
        System.out.println(cat2);
    }


}
