package studynote.aggregate_.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionForEach {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

//        col.add(new Book("三国演义", "罗贯中", 10.4));
//        col.add(new Book("西游记", "吴承恩", 11.4));
//        col.add(new Book("红楼梦", "曹雪芹", 15.1));
        col.add(1);
        col.add(3);
        col.add(true);
//        foreach 底层依旧是迭代器 会调用 iterator 相当于简化版本的迭代器
//        快捷键： I
        for (Object obj : col){ //foreach 可以在数组和集合使用
            System.out.println("col=" + obj);
        }
    }
}
