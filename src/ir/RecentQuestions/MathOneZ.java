package ir.RecentQuestions;

import java.util.Scanner;

public class MathOneZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter h");
        int h = sc.nextInt();
        System.out.println("Enter G1");
        int G1 = sc.nextInt();
        System.out.println("Enter G2");
        int G2 = sc.nextInt();


        double Surface = 0.5 * h * (G1 + G2);

        System.out.println(Surface);
    }
}
