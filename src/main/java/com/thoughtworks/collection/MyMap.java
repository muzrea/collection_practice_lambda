package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultList = new ArrayList<Integer>();
        for (Integer i : this.array) {
            resultList.add(i * 3);
        }
        return resultList;
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<String>();
        for (int i = 0; i < this.array.size(); i++) {
            resultList.add(letterList.get(i));
        }
        return resultList;
    }

    public List<String> mapLetters() {
        List<String> resultList = new ArrayList<String>();
        for (Integer i : this.array) {
            int firstNumber = (i - 1) / this.letters.length;
            int secondNumber = (i - 1) % this.letters.length;
            String myLetter;
            if (firstNumber < 1) {
                myLetter = this.letters[secondNumber];
            } else {
                myLetter = this.letters[firstNumber - 1] + this.letters[secondNumber];
            }
            resultList.add(myLetter);
        }
        return resultList;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(this.array, new IntDescSort());
        return this.array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;
    }
}
