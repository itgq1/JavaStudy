package studynote.aggregate_.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
//      add:  增
        list.add("Tom");
        list.add(2);
        list.add(true);
        list.add(10);
//        System.out.println("list=" + list);
//      remove:  删
//        list.remove(1);        
//        list.remove(new Integer(10));  // 删除指定数字时要使用 Integer() 创建一个数字对象
//        Object remove = list.remove(2);
//        list.remove("Tom");
//        System.out.println("list=" + list);
//      contains:  查
//        System.out.println(list.contains("Tom"));
//      size:  获取大小
//        System.out.println(list.size());
//      isEmpty:  判断是否为空
//        System.out.println(list.isEmpty());
//      clear:  清空
//        list.clear();
//        System.out.println("list=" + list);

//        ArrayList list2 = new ArrayList();
//        list2.add("红楼梦");
//        list2.add("西游记");
//      addall:  添加多个元素
//        list.addAll(list2);
//        System.out.println("list=" + list);
//      containsAll: 查找多个元素是否存在
//        System.out.println(list.containsAll(list2));
//
//        ArrayList list3 = new ArrayList();
//        list3.add("Tom");
//        list3.add(true);
//      removeAll: 删除多个元素
//        System.out.println("list=" + list);
//        list.removeAll(list3);
//        System.out.println("list=" + list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
