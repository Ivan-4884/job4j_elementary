package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double damount = amount;
        while (damount > 0) {
            double proc = damount * percent;
            damount = damount + proc - salary;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {

    }
}
