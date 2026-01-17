package LEC5;

import java.util.*;

public class doubleminmax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhap so thuc: ");
        double a = sc.nextDouble();

        double b = rd.nextDouble() * 100; // 0.0 – <100.0

        if (a > b) {
            System.out.println("So nhap " + a + " lon hon " + b);
        } else if (a < b) {
            System.out.println("So nhap" + a + " nho hon " + b);
        } else {
            System.out.println(a + " BANG " + b);
        }
    }
}
