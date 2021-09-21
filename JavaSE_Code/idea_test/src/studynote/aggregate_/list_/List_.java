package studynote.aggregate_.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add("jack");
        list.add("tom");
        list.add(true);

//        索引获取内容 get(index) 方法
        System.out.println(list.get(1));
    }
}
