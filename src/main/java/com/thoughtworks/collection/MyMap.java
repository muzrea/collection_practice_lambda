package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        Stream<Integer> stream = this.array.stream();
        return stream.map(n -> n * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        Stream<Integer> stream = this.array.stream();
        return stream.map(element -> (Character.toString((char) (element + 96)))).collect(Collectors.toList());
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
