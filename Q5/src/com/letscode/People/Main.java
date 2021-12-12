package com.letscode.People;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anotherGuest = "";
        ArrayList<String> guestList = new ArrayList<String>();
        do{
            System.out.print("Write the name of the guest: ");
            String guestName = scanner.next();
            guestList.add(guestName);
            System.out.print("Do you have another guest? (Y/Any key) ");
            anotherGuest = scanner.next();
        }while(anotherGuest.equalsIgnoreCase("Y"));

        ArrayList<String> biggestNames = new ArrayList<String>();
        biggestNames.add("");
        for (String guest : guestList) {
            if (biggestNames.get(0).length() == guest.length()) {
                biggestNames.add(guest);
            }
            if (biggestNames.get(0).length() < guest.length()) {
                biggestNames.clear();
                biggestNames.add(guest);
            }
        }

        if(biggestNames.size() == 1){
            System.out.printf("The biggest name is: %s", biggestNames);
        }else{
            System.out.printf("The biggest names are: %s", biggestNames);
        }

    }
}


