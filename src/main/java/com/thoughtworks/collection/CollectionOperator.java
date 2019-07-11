package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        return left > right ? Stream.iterate(left, v -> v - 1).limit(left - right + 1).collect(Collectors.toList())
                : Stream.iterate(left, v -> v + 1).limit(right - left + 1).collect(Collectors.toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return left > right ? Stream.iterate(left, v -> v - 1).limit(left - right + 1).filter(v -> v % 2 ==0).collect(Collectors.toList())
                : Stream.iterate(left, v -> v + 1).limit(right - left + 1).filter(v -> v % 2 ==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(v -> v % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length- 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
