package ru.job4j.condition;

public class Triangle {
    public static boolean exit(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main(String[] args) {
        System.out.println(exit(2.0, 2.0, 2.0));
    }
}
