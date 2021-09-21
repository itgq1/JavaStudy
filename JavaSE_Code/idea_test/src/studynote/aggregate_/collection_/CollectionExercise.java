package studynote.aggregate_.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Dog("jack", 10));
        list.add(new Dog("Tom", 5));
        list.add(new Dog("pat", 4));

        System.out.println("=====迭代器遍历====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("dog=" + next);
        }
        System.out.println("=====foreach遍历====");
        for (Object dog : list) {
            System.out.println("dog=" + dog);
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}