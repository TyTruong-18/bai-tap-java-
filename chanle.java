package LEC5;

import java.util.*;

public class chanle {

    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(78) + 3;

        System.out.println("So ngau nhien: " +n);

        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");

        }
    }

}
