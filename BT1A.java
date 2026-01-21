package LEC6ARRAYS;

import java.util.Scanner;
import java.util.Arrays;

public class BT1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap numbers[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        // a. Hiển thị mảng
        System.out.print("Mang vua nhap: ");
        display(a);
        // b. Đảo ngược mảng
        reverse(a);
        System.out.println();
        System.out.print("Mang sau khi dao: ");
        display(a);
        // c. Hiển thị số chẵn
        System.out.println();
        System.out.print("Cac so chan: ");
        evenNumbers(a);
        // d. Tổng chia hết cho 3 và 5
        System.out.println();
        System.out.println("Tong chia het cho 3 va 5: " + sumDivisibleBy3And5(a));

        // e. Sắp xếp tăng dần
        sortAscending(a);
        System.out.print("Mang tang dan: ");
        display(a);

        // f. Sắp xếp giảm dần
        sortDescending(a);
        System.out.print("Mang giam dan: ");
        display(a);
    }
    // Hiển thị mảng
    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // Đảo ngược mảng
    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    // c. Hiển thị các số chẵn
    public static void evenNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    // d. Tổng chia hết cho 3 và 5
    public static int sumDivisibleBy3And5(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
    // e. Sắp xếp tăng dần
    public static void sortAscending(int[] a) {
        Arrays.sort(a);
    }
    // f. Sắp xếp giảm dần
    public static void sortDescending(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
}
