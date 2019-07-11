package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SetIterator {

    public void printSet(Integer a, Integer b, Integer c, Integer d, Integer e) {

        Map<Integer, Integer> Mapss = new HashMap<>();
        Mapss.put(1, 1);
        Mapss.put(2, 2);
        Mapss.put(3, 3);
        Mapss.put(4, 4);
        Mapss.put(5, 5);
        Iterator<Integer> iter = Mapss.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}

