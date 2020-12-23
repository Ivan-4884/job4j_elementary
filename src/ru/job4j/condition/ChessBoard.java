package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x2 - x1 == y2 - y1) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(2, 2, 6, 6));
        System.out.println(way(6, 6, 6, 6));
        System.out.println(way(3, 3, 6, 6));
    }
}
