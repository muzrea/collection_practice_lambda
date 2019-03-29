package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        Stream<Integer[]> stream = Arrays.stream(this.array);
        return stream.flatMap(m -> Arrays.stream(m)).collect(Collectors.toList());
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDemensionalList = transformToOneDimesional();
        return oneDemensionalList.stream().distinct().collect(Collectors.toList());
    }
}
