package studynote.aggregate_.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.4));
        col.add(new Book("西游记", "吴承恩", 11.4));
        col.add(new Book("红楼梦", "曹雪芹", 15.1));

        Iterator iterator = col.iterator();

//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while 快捷键 itit
//        ctrl + j 查看快捷键的快捷键
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next= " + next);
        }
//        如果想要再次使用迭代器必须重新对迭代器进行赋值
//        next =  iterator.next();
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

