package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int tempBorder = 0;
        int sum = 0;
        if (leftBorder > rightBorder) {
            tempBorder = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tempBorder;
        } else if (leftBorder == rightBorder) {
            if (leftBorder % 2 == 0) {
                sum = leftBorder;
            }
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        int temp = 0;

        if (leftBorder % 2 == 0) {
            temp = leftBorder;
        } else {
            temp = leftBorder + 1;
        }
        for (int i = 0; i < (rightBorder - leftBorder + 1); ) {
            array.add(temp);
            temp += 2;
            i += 2;
        }
        Stream<Integer> stream = array.stream();
        sum = stream.reduce(0, (a, b) -> a + b);
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int tempBorder = 0;
        int sum = 0;
        if (leftBorder > rightBorder) {
            tempBorder = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tempBorder;
        } else if (leftBorder == rightBorder) {
            if (leftBorder % 2 != 0) {
                sum = leftBorder;
            }
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        int temp = 0;

        if (leftBorder % 2 != 0) {
            temp = leftBorder;
        } else {
            temp = leftBorder + 1;
        }
        for (int i = 0; i < (rightBorder - leftBorder + 1); ) {
            array.add(temp);
            temp += 2;
            i += 2;
        }
        Stream<Integer> stream = array.stream();
        sum = stream.reduce(0, (a, b) -> a + b);
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        Stream<Integer> stream = arrayList.stream();
        return stream.map(n -> n * 3 + 2).reduce(0, (a, b) -> a + b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            } else {
                odd = i * 3 + 2;
                list.add(odd);
            }
        }
        return list;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        Stream<Integer> stream = arrayList.stream();
        return stream.filter(n -> n % 2 != 0).map(m -> m * 3 + 5).reduce(0, (a, b) -> a + b);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        double median = 0;
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        int length = 0;
        int temp = 0;
        length = list.size();
        Collections.sort(list);
        if (length % 2 == 0) {
            temp = length / 2;
            median = (list.get(temp - 1) + list.get(temp)) / 2;
        } else {
            temp = (length - 1) / 2;
            median = list.get(temp);
        }
        return median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        for (Integer j : list) {
            result += j;
        }
        result = result / list.size();
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {

        boolean result = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        result = list.contains(specialElment);
        return result;

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(list);
        List<Integer> resultList = new ArrayList<Integer>(hs);
        return resultList;
    }


    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList, new IntDescSort());
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            temp = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            list.add(temp);
        }
        return list;
    }
}
