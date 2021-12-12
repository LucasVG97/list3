package com.letscode.Word;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anotherWord = "";
        do {
            System.out.print("Write a word: ");
            String word = scanner.next();

            char[] wordCharacters = word.toCharArray();
            StringBuilder newWord = new StringBuilder();
            for (int i = 0; i < wordCharacters.length; i++) {
                if (i % 2 == 0) {
                    newWord.append(Character.toUpperCase(wordCharacters[i]));
                } else {
                    newWord.append(Character.toLowerCase((wordCharacters[i])));
                }
            }
            System.out.printf("The word with odd characters in upper case is: %s%n", newWord);
            System.out.print("Do you wanna write another word? (Y/Any key) ");
            anotherWord = scanner.next();
        } while (anotherWord.equalsIgnoreCase("Y"));

    }
}
