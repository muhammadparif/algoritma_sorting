package com.tutorial;

import java.util.*;
import java.lang.Math;

public class bubble_sort {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, n;

        ArrayList<Double> arr = new ArrayList<>();
        System.out.print("masukan panjang array :");
        n = input.nextInt();

        for (i = 0; i <= n - 1; i++) {
            System.out.print("index ke " + i + " = ");
            int angka = input.nextInt();
            arr.add((double) angka);
        }

        // cetak elemen array
        for (i = 0; i <= n - 1; i++) {
            System.out.print("| " + arr.get(i) + " | ");
        }
        System.out.println("");

        // teknik bubble sort
        for (i = 0; i <= n - 2; i++) {
            for (j = 0; j <= n - 2; j++) {
                if (arr.get(i) > arr.get(j + 1)) {

                    // TEKNIK SWAP
                    Double temp;

                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, (double) temp);
                }
            }
        }

        // cetak hasil sorting bubble sort

        for (i = 0; i <= n - 1; i++) {
            System.out.print("| " + arr.get(i) + " | ");
        }
        System.out.println("");
    }
}
