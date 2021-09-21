package studynote.aggregate_.set_.HashSet_;

@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟一个 HashSet 的底层结构(HashMap的底层结构)

//        1. 创建一个大小为16的数组, 也被称为表
        Node[] table = new Node[16];

//        2. 形成一个Jack -> Tom -> Rose 的链表
        Node jack = new Node("jack", null);
        table[2] = jack; // 将 jack结点 存入 table 的2号位

        Node tom = new Node("tom", null);
        jack.next = tom; // 将 tom结点挂载到 jack

        Node rose = new Node("Rose", null);
        tom.next = rose; // 将 rose 结点挂载到 tom

        Node john = new Node("John", null);
        table[3] = john;

        System.out.println("table[2]=" + table[3]);



    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}

