package com.devix.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            PrintStream wPrintStream = new PrintStream(new File("randMy.txt"));
            Random random = new Random();
            final int LIMIT = 5;
            for (int i = 0; i < LIMIT; i++) {
                wPrintStream.println(random.nextInt());
            }
            wPrintStream.close();

        } catch (IOException e) {
            System.out.println("Occured error");
        }

    }
}
