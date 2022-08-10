package com.jokercode.java.pino;

public class Pino {

    public static void main(String[] args) {

        int size = 17;
        int n = 1;

        while (n < size) {
            for (int i = 0; i < (size / 2) - (n / 2); i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

            System.out.println();

            n+=2;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < (size / 2) - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("| |");
        }
    }
}
