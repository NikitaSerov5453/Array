package org.example.views;

import org.example.arrays.Array;

import java.util.Arrays;
import java.util.Scanner;

public class View {

    public View() {

    }

    private final Scanner scanner = new Scanner(System.in);

    public String inputArray() {
        System.out.println("Введите элементы массива через пробел");
        return scanner.nextLine();
    }

    public void printArray(Array[] array) {
        System.out.println(Arrays.toString(array));
    }

}
