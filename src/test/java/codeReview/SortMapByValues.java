package codeReview;

import java.util.*;


/*
Write a method that can sort the Map by values
 */
public class SortMapValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<String, Integer> map3 = new LinkedHashMap<>();

        map.put("A", 2);
        map.put("C", 1);
        map.put("B", 3);
        map.put("D", 4);
//        map.put("Z", 1);
        map.put("T", 5);


        System.out.println(map + "  //Initial map: ");

        for (Map.Entry<String, Integer> each : map.entrySet()) {

            map2.put(each.getValue(), each.getKey());

        }


        System.out.println(map2 + " //Reversed k&v from map to map2: ");

        for (Map.Entry<Integer, String> each : map2.entrySet()) {

            map3.put(each.getValue(), each.getKey());
        }

        System.out.println(map3 + " //map3; Our solution works only with unique values. It's not a bug, it's a feature");

        System.out.println(sortByValue(map)+ "Solution from canvas");
    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());


        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for (Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }
}
