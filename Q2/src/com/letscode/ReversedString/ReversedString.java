package com.letscode.ReversedString;
import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String continueOption;
        do{
            System.out.print("Type the word and this code will write backwards: ");
            String scannedWord = scanner.next();
            char[] wordCharacter = scannedWord.toCharArray();
            StringBuilder reversedword = new StringBuilder();

            for(int i = wordCharacter.length -1 ; i >= 0  ; i--){
                reversedword.append(wordCharacter[i]);
            }

            System.out.printf("The reversed word is: %s", reversedword.toString());
            System.out.print("\nWanna do it with another word? (Y / any key) ");
            continueOption = scanner.next();
        }while (continueOption.equalsIgnoreCase("Y"));
    }
}
