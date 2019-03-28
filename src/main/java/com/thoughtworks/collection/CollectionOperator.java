package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        if (left <= right) {
            temp = left;
            for (int i = 0; i <= right - left; i++) {
                list.add(temp);
                temp++;
            }
        } else {
            temp = left;
            for (int i = 0; i <= left - right; i++) {
                list.add(temp);
                temp--;
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        if (left <= right) {
            if (left % 2 == 0) {
                temp = left;
            } else {
                temp = left + 1;
            }
            for (int i = 0; i <= right - left; ) {
                list.add(temp);
                temp += 2;
                i += 2;
            }
        } else {
            if (left % 2 == 0) {
                temp = left;
            } else {
                temp = left - 1;
            }
            for (int i = 0; i <= left - right; ) {
                list.add(temp);
                temp -= 2;
                i += 2;

            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    list.add(firstArray[i]);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.length; i++) {
            list.add(firstArray[i]);
        }
        for (int j = 0; j < secondArray.length; j++) {
            if (!list.contains(secondArray[j])) {
                list.add(secondArray[j]);
            }
        }

        return list;
    }
}
