package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;

        for (int num = 2; num < number; num++) {
            if (number % num == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

    }
}
