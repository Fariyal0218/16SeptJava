package collection;

import java.util.ArrayList;
import java.util.Collections;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.comparable;

public class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    String address;

    public Employee1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public static void main(String[] args) {
        Employee1 obj1 = new Employee1(1,"Fariyal","Pune");
        Employee1 obj2 = new Employee1(2,"Arbiya","Nagpur");
        Employee1 obj3 = new Employee1(3,"Fariya","Nagar");

        ArrayList<Employee1> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.id +" "+s.name);
        });
    }

    @Override
    public int compareTo(Employee1 employee1) {
        if (this.id == employee1.id){
            return 0;
        }else if (this.id >employee1.id){
        return 6;
    }else {
        return -12;
    }
}
}