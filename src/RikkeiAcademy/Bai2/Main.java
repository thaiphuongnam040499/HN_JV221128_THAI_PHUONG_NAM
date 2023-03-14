package RikkeiAcademy.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên của bạn: ");
        int n = scanner.nextInt();
        if (n>0){
            int sum = 0;
            System.out.println("dãy số từ 0 đến "+n+" là: ");
            for (int i = 0; i <= n; i++) {
                System.out.print(i+" ");
                if (i%2==0){
                    sum += i;
                }
            }
            System.out.println("\nTổng tất cả các số chẵn trong dãy số trên là "+sum);
        }else {
            System.out.println("Bạn phải nhập vào n là số nguyên dương");
        }

    }
}
