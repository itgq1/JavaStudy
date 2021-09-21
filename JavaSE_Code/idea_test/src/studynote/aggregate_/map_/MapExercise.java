package studynote.aggregate_.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("100", new Employee("jack", "100", 18001));
        hashMap.put("101", new Employee("john", "101", 18002));
        hashMap.put("102", new Employee("tom", "102", 18003));
        hashMap.put("103", new Employee("rose", "103", 17000));

        Set keys = hashMap.keySet();

        for (Object key : keys) {
            Employee value = (Employee)hashMap.get(key);
            if (value.getPrice() > 18000){
                System.out.println(value);
            }
        }

        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee value = (Employee)hashMap.get(key);
            if (value.getPrice() > 18000){
                System.out.println(value);
            }

        }

    }
}

class Employee {
    private String name;
    private String id;
    private double price;

    public Employee(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}