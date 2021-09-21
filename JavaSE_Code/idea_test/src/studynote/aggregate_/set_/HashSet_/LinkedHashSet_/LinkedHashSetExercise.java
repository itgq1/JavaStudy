package studynote.aggregate_.set_.HashSet_.LinkedHashSet_;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        /*
        LinkedHashSet 底层为 LinkedHashMap 是一个数组+双向链表的结构
        LinkedHashSet 添加顺序就是遍历顺序
         */


        /*
        Car 类(属性: name, price) 如果 name 和 price 相同则认为是相同元素，不能添加
         */
        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(new Car("奥拓", 1000));
        linkedHashSet.add(new Car("奥迪", 5000));
        linkedHashSet.add(new Car("奥拓", 1000));

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);
        }
        System.out.println(linkedHashSet);
    }
}

class Car {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}