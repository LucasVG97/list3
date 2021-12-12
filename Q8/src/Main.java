import entidades.Person;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many people do you want to insert? ");
        int numberOfPeople = scanner.nextInt();
        Person[] people = new Person[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            people[i] = new Person("", 0, 0);
            System.out.print("Person " + (i + 1) + " name: ");
            String personName = scanner.next();
            people[i].setName(personName);
            System.out.print("Person " + (i + 1) + " weight: ");
            float personWeight = scanner.nextFloat();
            people[i].setWeight(personWeight);
            System.out.print("Person " + (i + 1) + " height: ");
            float personHeight = scanner.nextFloat();
            people[i].setHeight(personHeight);
        }

        for (int i = 0; i < numberOfPeople; i++) {
            float weight = people[i].getWeight();
            float height = people[i].getHeight();
            float imc = weight / (height * height);

            if (imc > 25) {
                System.out.printf("Hey, %s, you're overweight, your IMC is %.2f, take care of yourself.%n",
                        people[i].getName(), imc);
            }
            if (imc < 18.5) {
                System.out.printf("Hey, %s, you're underweight, your IMC is %.2f, take care of yourself.%n",
                        people[i].getName(), imc);
            }
        }
    }
}


