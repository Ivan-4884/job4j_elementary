package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        /*if (third > first && third > second) {
            result = third;
        }*/
        return result;
    }

    public static void main(String[] args) {

    }
}
