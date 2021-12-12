package com.letscode.FiveFruits;
import java.util.Arrays;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de frutas diferentes que você deseja adicionar ao carrinho: ");
        int numberScan = scanner.nextInt();
        String[] fruits = new String[numberScan];
        for(int i = 0; i < numberScan ; i++){
            System.out.println("Insira a fruta que deseja no carrinho");
            String fruitName = scanner.next();
            fruits[i] = fruitName;
        }
        System.out.printf("As frutas escolhidas foram: %s", Arrays.toString(fruits));
    }

}
