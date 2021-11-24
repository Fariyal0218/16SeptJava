package collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Pune");
        treeMap.put(100, "Mumbai");
        treeMap.put(111, "Nashik");
        treeMap.put(114, "Satara");
        System.out.println(treeMap);
        System.out.println(treeMap.subMap(102, 114));
        System.out.println(treeMap.tailMap(102, true));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.ceilingEntry(105));
        System.out.println(treeMap.floorEntry(102));
        System.out.println(treeMap.floorKey(100));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.higherEntry(111));
        System.out.println(treeMap.lowerEntry(102));
        System.out.println(treeMap);
    }
}