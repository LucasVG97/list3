import entidades.Person;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people do you want to insert? ");
        int numberOfPeople = scanner.nextInt();
        Person[] people = new Person[numberOfPeople];
        ArrayList<Person> highestAge = new ArrayList<>();
        ArrayList<Person> smallestAge = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < numberOfPeople; i++ ){
            people[i] = new Person("", 0);
            System.out.print("Person " + (i + 1) + " name: ");
            String personName = scanner.next();
            people[i].setName(personName);
            System.out.print("Person " + (i + 1) + " age: ");
            int personAge = scanner.nextInt();
            people[i].setAge(personAge);
            sum += people[i].getAge();
        }

        highestAge.add(new Person("",0));
        smallestAge.add(new Person("",1000));

        for (int i = 0; i < numberOfPeople; i++) {
            if (people[i].getAge() == highestAge.get(0).getAge()) {
                highestAge.add(people[i]);
            }
            if (people[i].getAge() > highestAge.get(0).getAge()) {
                highestAge.clear();
                highestAge.add(people[i]);
            }
            if (people[i].getAge() == smallestAge.get(0).getAge()) {
                smallestAge.add(people[i]);
            }
            if (people[i].getAge() < smallestAge.get(0).getAge()) {
                smallestAge.clear();
                smallestAge.add(people[i]);
            }
        }


        float media = (float) sum / numberOfPeople;
        System.out.printf("People with the highest age: %s%n", highestAge);
        System.out.printf("People with the smallest age: %s%n",smallestAge);
        System.out.printf("Media of ages: %.2f", media);

    }

}

