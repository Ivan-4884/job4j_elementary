package ru.job4j.checkstyle;

public class Broken {
    private int sizeofempty = 10;

    public String surname;

    public static final String NEWVALUE = "";

    String name;

    Broken() { }

    void echo() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }
}
