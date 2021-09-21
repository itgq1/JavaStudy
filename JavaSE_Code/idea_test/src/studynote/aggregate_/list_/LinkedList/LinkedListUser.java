package studynote.aggregate_.list_.LinkedList;

import java.util.LinkedList;

@SuppressWarnings({"all"})
public class LinkedListUser {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        删
//        linkedList.remove(1);
//        改
        linkedList.set(1,4);
//        查
        linkedList.get(1);
        System.out.println(linkedList);
    }
}
