package com.gcy;

public class Main {

    public static void main(String[] args) {

        char  c= 'A';
        int num = 10;

        switch (c) {
            case 'B':
                System.out.println("B来");
                num++;
            case 'A':
                System.out.println("A来");
                num++;
            case 'Y':
                System.out.println("Y来");
                num++;
               // break;
            default:
                num--;
        }

        System.out.println(num);
    }
}