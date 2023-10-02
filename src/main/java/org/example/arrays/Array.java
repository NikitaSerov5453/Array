package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Array<T extends Number> {

    private T[] arrays;

    public Array(T[] arrays) {
        this.arrays = arrays;
    }

    public void resizeArray(Array<T>[] oldArray) {
        Array<T>[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        oldArray = null;
    }

    public Array<T>[] createArray(int size) {
        return new Array<>[size];
    }

    public static Integer random(int minValue, int maxValue) {
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }

    public void fieldArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) random(-100, 100);
        }
    }

    public T maxNumber(T[] array, Comparator<T> comparator) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(max, array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T minNumber(T[] array, Comparator<T> comparator) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(min, array[i]) > 0) {
                min = array[i];
            }
        }
        return min;
    }

    public double averageValue(T[] array) {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum / array.length;
    }

    public T[] arraySort(T[] arrays) {
        Arrays.sort(arrays);
        return arrays;
    }

    public T[] arraysReversSort(T[] arrays) {
        Arrays.sort(arrays, Collections.reverseOrder());
        return arrays;
    }

    public int binarySearch(T[] arrays, T search) {
        Arrays.sort(arrays);
        return Arrays.binarySearch(arrays, search);
    }

    public void replacingValue(T[] arrays, T search, T replacing) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals(search)) {
                arrays[i] = replacing;
            }
        }
    }



}
