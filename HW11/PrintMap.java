package HW11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrintMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(1, "value1");
        myMap.put(10, "value10");
        myMap.put(2, "value2");
        myMap.put(15, "value15");
        myMap.put(3, "value3");
        myMap.put(6, "value6");
        printSortedMap(myMap);
    }
    public static void printSortedMap(Map<Integer, String> map) {
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> printMap : sortedMap.entrySet()) {
            System.out.println(printMap.getKey() + "=" + printMap.getValue());
        }
    }
}
