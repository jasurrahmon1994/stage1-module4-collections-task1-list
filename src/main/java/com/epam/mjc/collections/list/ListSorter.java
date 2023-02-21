package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
            sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        int x = 5 * i * i + 3;
        int y = 5 * j * j + 3;
        if(x == y){
            if(i > j){
                return 1;
            } else return -1;
        } else if (x > y){
            return 1;
        } else {
            return -1;
        }
    }
}
