package studynote.aggregate_.map_;


import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1", "一");
        hashMap.put("2", "二");
        hashMap.put("3", "三");
        hashMap.put("4", "四");


//        values() 方法获取所有的 value 值
        Collection values = hashMap.values();
        System.out.println("====获取所有的值(value) + ForEach(For增强)====");
        for (Object value : values) {
            System.out.println(value);
        }
        Iterator iterator0 = values.iterator();
        System.out.println("====获取所有的值(value) + iterator====");
        while (iterator0.hasNext()) {
            Object value =  iterator0.next();
            System.out.println(value);
        }

//        keySet() 方法获取所有的 key 值
        Set set = hashMap.keySet();
        // 遍历方法一 : Iterator
        System.out.println("====遍历方法一 : keySet() 方法 + Iterator====");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            System.out.println(key + ":" + hashMap.get(key));
        }

        // 遍历方法二 : ForEach(For增强)
        System.out.println("====遍历方法二 : keySet() 方法 + ForEach(For增强)====");
        for (Object key : set) {
            System.out.println(key+ ":" + hashMap.get(key));
        }

//        entrySet() 方法获取所有的键值对
        Set entrys = hashMap.entrySet();
        System.out.println("====遍历方法三: entrySet() 方法 + ForEach(For增强)====");
        for (Object entry :entrys) {
            Map.Entry e = (Map.Entry) entry;
            Object key = e.getKey();
            Object value = e.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println("====遍历方法四: entrySet() 方法 + Iterator====");
        Iterator iterator2 = entrys.iterator();
        while (iterator2.hasNext()) {
            Object m =  iterator2.next();
            Map.Entry e = (Map.Entry) m;
            Object key = e.getKey();
            Object value = e.getValue();
            System.out.println(key + ":" + value);
        }


    }
}
