package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        Stream<Integer> stream = array.stream();
        return stream.filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        Stream<Integer> stream = array.stream();
        return stream.filter(n -> n % 3 == 0).collect(Collectors.toList());
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