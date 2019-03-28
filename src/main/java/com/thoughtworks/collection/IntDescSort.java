package com.thoughtworks.collection;

import java.util.Comparator;

public class IntDescSort implements Comparator {

    public int compare(Object o1,Object o2){
        int i1 = ((Integer)o1).intValue();
        int i2 = ((Integer)o1).intValue();
        if(i1 < i2){
            return 1;
        }else{
            return -1;
        }
    }
}
