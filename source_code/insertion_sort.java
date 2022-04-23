package com.tutorial;

import java.util.*;
import java.lang.Math;

public class insertion_sort {
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

        // teknik insertion sort
        i = 1;
        while (i < n) {
            Double temp;

            temp = arr.get(i);
            boolean next;

            next = true;
            j = i;
            while (next) {
                if (temp < arr.get(j - 1)) {
                    arr.set(j, arr.get(j - 1));
                    j = j - 1;
                    if (j <= 0) {
                        next = false;
                    }
                } else {
                    next = false;
                }
            }
            arr.set(j, temp);
            i = i + 1;
        }

        // menampilkan hasil sorting
        for (i = 0; i <= n - 1; i++) {
            System.out.print("| " + arr.get(i) + " | ");
        }
        System.out.println("");
    }
}
