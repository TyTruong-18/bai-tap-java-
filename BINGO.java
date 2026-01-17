package LEC5;

import java.util.*;
import java.util.Scanner;

public class BINGO {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int ngaunhien = rd.nextInt(100) + 1;
        int doan;

        System.out.println(" 1 den 100:");

        while (true) {
            System.out.print("Nhap so ban doan: ");
            doan = sc.nextInt();

            if (doan == ngaunhien) {
                System.out.println("Chuc mung!");
                break;
            } else if (doan < ngaunhien) {
                System.out.println("So can doan lon hon");
            } else {
                System.out.println("So can doan nho hon");
            }
        }

    }
}
