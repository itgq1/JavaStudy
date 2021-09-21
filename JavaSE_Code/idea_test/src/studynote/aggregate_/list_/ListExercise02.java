package studynote.aggregate_.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//import static java.util.Collections.sort;
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List linkedList = new LinkedList();
        List vector = new Vector();

        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 9));
        list.add(new Book("三国演义", "罗贯中", 80));
//        arraylist.add(new Book("西游记","吴承恩", 10));

        sort(list);
        System.out.println(list);

    }
//    冒泡排序
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }
}