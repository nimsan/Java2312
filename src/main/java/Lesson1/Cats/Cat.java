package Lesson1.Cats;

public class Cat {

    private String name; // <- this.name указывает сюда
    private String color;
    private int age;

    public Cat(String name, String color, int age) { // <- а name один из аргументов конструктора
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void putMeInArray(Cat[] cats, int arrayIndex) {
        cats[arrayIndex] = this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

