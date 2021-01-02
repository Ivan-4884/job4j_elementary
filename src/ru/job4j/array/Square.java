package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        int count = 0;
        for (int index : rst) {
            /*может использовать count не правильно, но я что то не понял как использовать index от 0 до конец массива*/
            rst[count] = (int) Math.pow(count, 2);
            count += 1;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
