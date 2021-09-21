package studynote.aggregate_.list_.LinkedList;

@SuppressWarnings({"all"})
public class LinkedList01 {
    public static void main(String[] args) {
        Node tom = new Node("Tom");
        Node jack = new Node("jack");
        Node gq = new Node("gq");

//        构造链表结构
        tom.next = jack;
        jack.next = gq;
        gq.pre = jack;
        jack.pre = tom;

        Node first = tom;
        Node last = gq;

//        从头到尾遍历
        System.out.println("====从头到尾遍历====");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
//        从尾到头遍历
        System.out.println("====从尾到头遍历====");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
//        添加对象 jack 与 gq 之间
        Node st = new Node("st");
        jack.next = st;
        st.next = gq;
        gq.pre = st;
        st.pre = jack;

        first = tom;

        System.out.println("====从头到尾遍历====");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        last = gq;
//        从尾到头遍历
        System.out.println("====从尾到头遍历====");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}

class Node{
    public Object name;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + name +
                '}';
    }
}