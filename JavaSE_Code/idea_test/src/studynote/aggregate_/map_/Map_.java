package studynote.aggregate_.map_;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        /*
        HashMap 存放元素时是以 key - value 的形式进行存放
        HashMap 存放元素时, 也是无序的
        HashMap 存放元素时, key 不可以重复 但 value 可以重复
            当遇到重复的 key 时, HashMap 采用的是替换机制, 即将 value 值替换为后加入的那一个 value
         */
        HashMap hashMap = new HashMap();

        hashMap.put("no0", "");
    }
}
