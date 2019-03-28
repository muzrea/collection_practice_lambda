package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {
    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer j : this.array) {
            if (j % 2 == 0) {
                list.add(j);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer j : this.array) {
            if (j % 3 == 0) {
                list.add(j);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i : firstList) {
            if (secondList.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getDifferentElements() {
        HashSet<Integer> hs = new HashSet<Integer>(this.array);

        List<Integer> resultList = new ArrayList<Integer>(hs);

        return resultList;
    }
}