package ir.RecentQuestions;

import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of person");
        String name = sc.nextLine();
        System.out.println("Enter id");
        long id = sc.nextLong();

        if (name == "fanavarienovin" && id == 1234556) {
            System.out.println("Correct");
        } else {
            System.out.println("Not correct");
        }
    }
}
