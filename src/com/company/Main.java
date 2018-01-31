package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Irasyk skaiciu: ");
        int a = sc.nextInt();

        if (a % 7 == 0) {
            System.out.println("dalinasi is 7! ");
        } else if (a % 5 == 0) {
            System.out.println("dalinasi is 5! ");
        } else if (a % 3 == 0) {
            System.out.println("dalinasi is 3");
        }
        else {
            System.out.println("nesidalina skaicius! ");
        }
    }
}
