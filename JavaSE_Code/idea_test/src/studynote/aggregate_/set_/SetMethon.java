package studynote.aggregate_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"all"})
public class SetMethon {
    public static void main(String[] args) {
        /*
        set 方法和 collection 的方法几乎一致
        set 不可以使用下标索引的方式进行查找，没有 get 方法
            只能用 iterator 和 增强for 方法
        set 接口的实现类的对象， 不能存放的重复的元素，但可以存放null
        set 存放的数据是无序的但取出的的顺序是规定的，不会一次一变

         */
        Set set = new HashSet();

//        增
        set.add("jack");
        set.add("tom");
        set.add("1");
        set.add(true);

//        删
        set.remove("jack");

//        Iterator方法遍历
        System.out.println("====Iterator方法遍历====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);
        }
//        foreach(for增强) 方法遍历
        System.out.println("====foreach(for增强) 方法遍历====");
        for (Object o : set) {
            System.out.println("o=" + o);
        }

    }
}
