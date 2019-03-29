package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(this.arrayList);
    }

    public double getMinimum() {
        return Collections.min(this.arrayList);
    }

    public double getAverage() {
        Stream<Integer> stream = this.arrayList.stream();
        return (double) (stream.reduce(0, (a, b) -> a + b)) / this.arrayList.size();
    }

    public double getOrderedMedian() {
        int medianIndex = this.arrayList.size() / 2;
        if (this.arrayList.size() % 2 == 0) {
            return (double) (this.arrayList.get(medianIndex) + this.arrayList.get(medianIndex - 1)) / 2;

        }
        return this.arrayList.get(medianIndex);
    }

    public int getFirstEven() {
        Stream<Integer> stream = this.arrayList.stream();
        return stream.filter(n -> n % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                list.add(i);
            }
        }
        index = list.get(0);
        return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
        boolean result = true;
        if (this.arrayList.size() == arrayList.size()) {
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (!this.arrayList.get(i).equals(arrayList.get(i))) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (Integer i : this.arrayList) {
            singleLink.addTailPointer(i);
        }
        return this.getOrderedMedian();
    }

    public int getLastOdd() {
        int odd = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i : this.arrayList) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        odd = list.get(list.size() - 1);
        return odd;
    }

    public int getIndexOfLastOdd() {
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 != 0) {
                list.add(i);
            }
        }
        index = list.get(list.size() - 1);
        return index;
    }
}
