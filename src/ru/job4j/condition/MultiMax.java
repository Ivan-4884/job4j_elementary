package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first > second) {
            if (first > third) {
                result = first;
            } else {
                result = third;
            }
        } else {
            if (second > third) {
                result = second;
            } else {
                result = second;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(22, 14, 10));
    }
}
