package LEC5;

import java.util.*;

public class vonglap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random = rd.nextInt(10) + 1; // 1–10
        int a;
        int dem = 0;
        do {
            System.out.print("Nhap so (1-10): ");
            a = sc.nextInt();
            dem++;
        } while (a != random);

        System.out.println("Ban doan dung sau " + dem + " lan");
    }

}
