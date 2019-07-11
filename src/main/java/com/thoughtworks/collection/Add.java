package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        return Stream.iterate(leftBorder, n -> n + 1).limit(rightBorder - leftBorder + 1)
                .filter(v -> v % 2 == 0)
                .reduce(0, (pre, curr) -> pre + curr);

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            sum += (i % 2 == 1 ? i : 0);
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().reduce(0, (sum, cur) -> sum + 3 * cur + 2);


    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map( e -> e % 2 == 0 ? e : e * 3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(value -> value % 2 == 0).mapToInt(v -> v).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(v -> v%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
