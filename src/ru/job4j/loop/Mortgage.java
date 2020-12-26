package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double damount = amount;
        while (damount > 0) {
            double proc = damount * percent; //годовой процент от суммы кредита
            damount = damount + proc - salary; //остаток кредита
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {

    }
}
