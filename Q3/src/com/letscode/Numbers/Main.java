package com.letscode.Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to see if its odd or even ? ");
        int howManyNumbers = scanner.nextInt();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i=0 ; i < howManyNumbers ; i++){
            System.out.print("Insert your number: ");
            int enterednumber = scanner.nextInt();
            if(enterednumber % 2 == 0 && !even.contains(enterednumber)){
                even.add(enterednumber);
            }
            if (enterednumber % 2 != 0 && !even.contains(enterednumber)){
                odd.add(enterednumber);
            }
        }
        System.out.printf("odd numbers: %s%n", odd);
        System.out.printf("even numbers: %s", even);

    }
}