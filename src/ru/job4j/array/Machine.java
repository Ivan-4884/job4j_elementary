package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
         int[] coins = {10, 5, 2, 1};
         int[] rsl = new int[100];
         int size = 0;
         int itog = money - price;

         for (int index = 0; index < coins.length; index++) {
             while (itog >= coins[index]) {
                 rsl[size] = coins[index];
                 size = size + 1;
                 itog = itog - coins[index];
             }
         }

         return Arrays.copyOf(rsl, size);
    }
}