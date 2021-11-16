package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(4,"Four");
        map2.put(5,"Five");
        map2.put(6,"Six");

        Map<Integer,String> map3 = new HashMap<>();
        map3.put(7,"Seven");
        map3.put(8,"Eight");
        map3.put(9,"Nine");

        List<Map<Integer,String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
        System.out.println();
    }
}
