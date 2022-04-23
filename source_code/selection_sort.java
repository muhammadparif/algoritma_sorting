package com.tutorial;

import java.util.*;
import java.lang.Math;

public class selection_sort {
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

        // teknik selection short
        for (i = 0; i <= n - 2; i++) {
            int min;

            min = i;
            for (j = 1 + i; j <= n - 1; j++) {
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
            }
            if (min != i) {

                // proses SWAP
                Double temp;

                temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, (double) temp);
            }
        }

        // cetak algoritma sorting insertion sort
        for (i = 0; i <= n - 1; i++) {
            System.out.print("| " + arr.get(i) + " | ");
        }
        System.out.println("");
    }
}
