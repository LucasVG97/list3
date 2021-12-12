package com.letscode.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to insert? ");
        int howManyNumbers = scanner.nextInt();
        float[] numbers = new float[howManyNumbers];
        int sum = 0;
        for (int i = 0; i < howManyNumbers; i++){
            System.out.print("Insert your number: ");
            float typedNumber = scanner.nextFloat();
            numbers[i] = typedNumber;
            sum += typedNumber;
        }
        float media = (float)sum / howManyNumbers;
        Arrays.sort(numbers);
        System.out.printf("The biggest number is: %.2f%n", numbers[howManyNumbers - 1]);
        System.out.printf("The smallest number is: %.2f%n", numbers[0]);
        System.out.printf("The media is: %.2f%n", media);

    }
}
