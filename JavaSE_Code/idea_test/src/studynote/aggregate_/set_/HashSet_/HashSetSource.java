package studynote.aggregate_.set_.HashSet_;

import java.util.HashSet;
import java.util.Set;

public class HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Set hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        /*
        HashSet.add() 执行流程:
            1. 执行 add() 方法
                public boolean add(E e) {
                    return map.put(e, PRESENT)==null;
                }
            2. 执行 put() 方法
                public V put(K key, V value) {
                    return putVal(hash(key), key, value, false, true);
                }
                2.1 执行 hash(key) 方法获取 key 的hash值
                    static final int hash(Object key) {
                        int h;
                        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
                    }
            3. 执行 putVal() 方法
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
//                    定义等下要使用的变量
                    Node<K,V>[] tab; Node<K,V> p; int n, i;
//                    transient Node<K,V>[] table;      初始 table 为空
//                    将 table 赋值给 tab 同时判断是否为第一次添加内容，若是则执行以下内容
                    if ((tab = table) == null || (n = tab.length) == 0)
                        n = (tab = resize()).length;    // resize() 方法见 3.1
//                    (1) i = (n - 1) & hash 计算得出应该将 key 存放在table表的什么位置
//                    (2) 将 tab[i] 交给 p 同时判断 p 是否为空
//                    (3) 若为空将需要添加的内容放入 tab[i]
                    if ((p = tab[i = (n - 1) & hash]) == null)
                        tab[i] = newNode(hash, key, value, null);
                    else {  // 若tab[i] 不为空
                        Node<K,V> e; K k;
//                        (1) 判断 tab 中元素的 hash 值与要添加内容的hash值是否一致,
//                            同时满足一下两点中的一点:
//                                (1) 他们的值相同
//                                (2) key 不为空, 且通过equals() 判断后 key(待加入的) 和 k(k = p.key) 是否相等      // equals() 程序员可重写，即判断标准可自行设定
//                            则执行:
//                                e = p
//                        (2) 否则判断 p 是否为一棵红黑树
//                        (3) 若以上都不成立, 进入循环判断 该内容是否加入 tab[i]
//                            判断该元素是否为该链表的最后一个元素 即 p.next是否为空
//                                若为空则直接添加内容 同时判断该链表的长度是否到达8
//                                    若到达8则执行treeifyBin(tab, hash);
//                            退出循环
//                            若不为空, 继续判断下一个元素是否与其相同
//                                若相同直接退出循环
//                                若不同继续判断
                        if (p.hash == hash &&
                            ((k = p.key) == key || (key != null && key.equals(k))))
                            e = p;
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                        else {
                            for (int binCount = 0; ; ++binCount) {
                                if ((e = p.next) == null) {
                                    p.next = newNode(hash, key, value, null);
                                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                }
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                p = e;
                            }
                        }
                        if (e != null) { // existing mapping for key
                            V oldValue = e.value;
                            if (!onlyIfAbsent || oldValue == null)
                                e.value = value;
                            afterNodeAccess(e);
                            return oldValue;
                        }
                    }
                    ++modCount;
//                    判断添加元素后 size 是否大于 12(16的75%)若大于则对table的大小进行扩展
                    if (++size > threshold)
                        resize();
                    afterNodeInsertion(evict);
                    return null;
                }
                3.1 resize() 方法
                    final Node<K,V>[] resize() {
//                        将 table 的值赋给 oldTab, table 的值为空所以 oldTab 也为空
                        Node<K,V>[] oldTab = table;     // oldTab = null
                        判断 oldTab 是否为空, 为空将0赋给 oldCap, 不为空将 oldTab 的大小赋给 oldCap
                        int oldCap = (oldTab == null) ? 0 : oldTab.length;  // oldCap = 0
//                        int threshold; threshold = 0
                        int oldThr = threshold; // oldThr = 0
//                        定义新变量
                        int newCap, newThr = 0;
//                        判断 oldCap 是否为大于 0
                        if (oldCap > 0) {
//                            static final int MAXIMUM_CAPACITY = 1 << 30;  1 << 30 = 1073741824;
//                            判断 oldCap 是否大于等于 MAXIMUM_CAPACITY
                            if (oldCap >= MAXIMUM_CAPACITY) {
                                threshold = Integer.MAX_VALUE;
                                return oldTab;
                            }
                            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                                     oldCap >= DEFAULT_INITIAL_CAPACITY)
                                newThr = oldThr << 1; // double threshold
                        }
                        else if (oldThr > 0) // initial capacity was placed in threshold
                            newCap = oldThr;
                        else {               // zero initial threshold signifies using defaults
                            newCap = DEFAULT_INITIAL_CAPACITY;  // newCap = 16
                            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);     // newThr = 12
                        }
                        if (newThr == 0) {
                            float ft = (float)newCap * loadFactor;
                            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                                      (int)ft : Integer.MAX_VALUE);
                        }
                        threshold = newThr;
                        @SuppressWarnings({"rawtypes","unchecked"})
//                        定义一个新的 Node数组 大小为 newCap(16)
                        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
//                        将 newTab 赋值给 table
                        table = newTab;
                        if (oldTab != null) {
                            for (int j = 0; j < oldCap; ++j) {
                                Node<K,V> e;
                                if ((e = oldTab[j]) != null) {
                                    oldTab[j] = null;
                                    if (e.next == null)
                                        newTab[e.hash & (newCap - 1)] = e;
                                    else if (e instanceof TreeNode)
                                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                                    else { // preserve order
                                        Node<K,V> loHead = null, loTail = null;
                                        Node<K,V> hiHead = null, hiTail = null;
                                        Node<K,V> next;
                                        do {
                                            next = e.next;
                                            if ((e.hash & oldCap) == 0) {
                                                if (loTail == null)
                                                    loHead = e;
                                                else
                                                    loTail.next = e;
                                                loTail = e;
                                            }
                                            else {
                                                if (hiTail == null)
                                                    hiHead = e;
                                                else
                                                    hiTail.next = e;
                                                hiTail = e;
                                            }
                                        } while ((e = next) != null);
                                        if (loTail != null) {
                                            loTail.next = null;
                                            newTab[j] = loHead;
                                        }
                                        if (hiTail != null) {
                                            hiTail.next = null;
                                            newTab[j + oldCap] = hiHead;
                                        }
                                    }
                                }
                            }
                        }
                        return newTab;
                    }
         */
    }
}
