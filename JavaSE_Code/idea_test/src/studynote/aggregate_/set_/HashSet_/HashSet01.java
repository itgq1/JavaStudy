package studynote.aggregate_.set_.HashSet_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

//        1. 在执行 add 方法后，会返回一个boolean值
        System.out.println(set.add("john"));
        System.out.println(set.add("luck"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
//        2. 在执行 remove 方法(删除方法)后，会返回一个boolean值
        System.out.println(set.remove("john"));
        System.out.println("set=" + set);

        set = new HashSet();

//        3. HashSet 不能添加相同的元素/数据
        set.add("lucy");
        set.add("lucy");
//        可以添加内容一样的两个类
        set.add(new Dog("tom"));//T
        set.add(new Dog("tom"));//T
        set.add(new String("hsp"));//T
        set.add(new String("hsp"));//F
        System.out.println("set=" + set);

//        System.out.println(new String("hsp") == new String("hsp"));
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}