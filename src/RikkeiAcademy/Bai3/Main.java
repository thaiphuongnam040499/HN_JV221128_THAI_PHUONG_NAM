package RikkeiAcademy.Bai3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Mảng số nguyên là: ");
        System.out.print(Arrays.toString(array) + " ");
//        Tìm max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print("\nGiá trị lớn nhất của mảng là: " + max);
//        tìm min
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("\nGiá trị nhỏ nhất của mảng là: " + min);
//        Sắp xếp mảng tăng dần
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        System.out.println("\nSắp xếp mảng tăng dần: " + Arrays.toString(array));
//    đếm số lần xuất hiện của số nguyên tố trong mảng
        int count = 0;
        boolean isCheck = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j != 0) {
                    isCheck = true;
                }else {
                    isCheck = false;
                    break;
                }
            }
            if (isCheck) {
                count++;
            }
        }
        System.out.println("\nSố lần xuất hiện của số nguyên tố trong mảng là: "+count);
    }
}
