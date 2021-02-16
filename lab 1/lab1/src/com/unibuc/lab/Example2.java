package com.unibuc.lab;

public class Example2 {

    public static void main(String args[]) {
    getOddNumbers(50);
    System.out.println();
    getOddNumbers(70);
    }

    public static void getOddNumbers(int totalNumbers){
        for (int i = 0; i < totalNumbers; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
