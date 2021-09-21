package studynote.aggregate_.set_.HashSet_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        /*
        HashSet 扩容机制
        (1) HashSet 会在初始创建的时候直接创建一个大小为16的table表
        (2) HashSet 会在table表的大小触碰到临界因子(table表大小的0.75)时将table表的大小扩容到 size * 2
        注意:
         */
//        int j =0;
//        for (int i = 1; i <= 100; i = i + 2 ){
//            j++;
//            set.add(i);
//        }
        /*
        (3) 当 HashSet 中的有一条链表的长度达到 8 时会触发一下两种情况:
            (1) 当 size < 64时, 会对table进行扩容 size * 2
            (2) 当 size = 64时, 会将链表转化为红黑树
                注:只会将长度大于8的链表转化为红黑树，其他的依旧为链表
         */
        for (int i = 0; i < 45; i ++ ){
            set.add(new A(i));
        }
        for (int i = 45; i < 49; i ++ ){
            set.add(new A(i));
        }

    }
}

class A{
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        if (this.n > 10)
            return 111;
        return 100;
    }
}