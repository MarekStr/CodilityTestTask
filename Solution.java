//
//This is a demo task.
//        Write a function:
//        class Solution { public int solution(int[] A); }
//        that, given an array A of N integers,
//        returns the smallest positive integer (greater than 0) that does not occur in A.//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//        Given A = [1, 2, 3], the function should return 4.
//        Given A = [−1, −3], the function should return 1.
//

package com.company;

import java.util.*;

public class Solution {

    public static int solution(int[] tablica) {

        int ilePowtorzen = 0;

        Arrays.sort(tablica); // sortowanie tablicy


        // sprawdzenie liczby powtórzeń w tablicy
        for (int i = 0; i < tablica.length - 1; i++) {
            if (tablica[i] == tablica[i + 1]) {
                ilePowtorzen++;
            }
        }
        //kopiowanie tablicy bez powtórzeń
        int tablicaB[] = new int[tablica.length - ilePowtorzen];
        tablicaB[0] = tablica[0];
        int j = 1;
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i - 1] != tablica[i]) {
                tablicaB[j++] = tablica[i];
            }
        }
        // wyszukiwanie najmniejszej wartości która nie występuje w tablicy
        int najmniejsza = 1;
        for (int i = 0; i < tablicaB.length; i++) {
            if (tablicaB[i] > 0) {
                if (tablicaB[i] != najmniejsza) {
                    break;
                }
                najmniejsza++;

            }

        }


        return najmniejsza;
    }


    public static void main(String[] args) {


        int B[] = {2, 7, 24, 7, 3, 3, 33, 3, 33, -3, 7, -12, 0, -4, -7, -12, 1, 5};
        System.out.println(" Wartość najmniejsza to: " + solution(B));


    }
}