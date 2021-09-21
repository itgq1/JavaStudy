package studynote.aggregate_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("!");
        list.add("jack");
        list.add("peter");
        list.add("tom");
        list.add("miss");
        list.add("xiaozhi");
        list.add("Theshy");
        list.add("uzi");
        System.out.println("list=" + list);

        list.add(2,"gaoqiong");
        System.out.println("list=" + list);
        System.out.println("lsit[5]=" + list.get(5));
        list.remove(6);
        System.out.println("list=" + list);
        list.set(7, "xiugaihuo");
        System.out.println("list=" + list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);
        }
    }
}
