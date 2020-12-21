package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left > right;
        int result = max ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int max = Max.max(2, 3);
        System.out.println("максимальное из двух чисел " + max);
    }
}
