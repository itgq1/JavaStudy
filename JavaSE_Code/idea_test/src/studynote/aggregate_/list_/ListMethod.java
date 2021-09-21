package studynote.aggregate_.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("jack");
        list.add("peter");
        list.add("jack");

//        void add(int index, Object col) 在 index 位置添加 col 元素
        list.add(1,"查理");
        System.out.println("list=" + list);
//        boolean addAll(int index, Object col) 在 index 位置添加 col(多个) 元素
        List list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list.addAll(1, list1);
        System.out.println("list=" + list);
//        Object get(int index) 获取 index位置的元素
        System.out.println("list[1]=" + list.get(1));
//        int indexOf(Object obj): 返回元素 obj 在集合中首次出现的位置
        System.out.println("list[one jack]=" + list.indexOf("jack"));
//        int lastIndexOf(Object obj): 返回元素 obj 在集合中最后出现的位置
        System.out.println("list[last jack]=" + list.lastIndexOf("jack"));
//        Object remove(int index): 删除位于 index 位置的元素，并返回该元素
        System.out.println("删除的元素为:" + list.remove("1"));
//        Object set(int index, Object obj): 设置 index 位置的元素为 obj, 相当于替换
        list.set(1,"替换后");
        System.out.println("list=" + list);
//        List subList(int fromIndex, int toIndex): 返回一个子集合从fromIndex到toIndex-1
        List returnList = list.subList(1,4);
        System.out.println("returnList=" + returnList);



    }
}
