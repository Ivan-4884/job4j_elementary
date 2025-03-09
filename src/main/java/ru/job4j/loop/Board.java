package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height, char symbol1, char symbol2) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                System.out.print((row + cell) % 2 == 0 ? symbol1 : symbol2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3, 'X', ' ');
        System.out.println();
        paint(4, 4, '#', '.');
    }
}
