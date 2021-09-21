package studynote.aggregate_.set_.HashSet_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        /*
        定义一个 Employee 类 该类包含: private 成员变量 name, age
        要求:
            (1) 创建3个 Employee 对象放入 HashSet 中
            (2) 当 name 和 age 相同时，认为是相同员工，不能添加到 HashSet 中
         */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee01("jack", 10));
        hashSet.add(new Employee01("john", 5));
        hashSet.add(new Employee01("jack", 10));
        System.out.println("hashSet=" + hashSet);

    }
}

class Employee01 {
    private String name;
    private int age;

    public Employee01(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 Employee01 = (Employee01) o;
        return age == Employee01.age &&
                Objects.equals(name, Employee01.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
