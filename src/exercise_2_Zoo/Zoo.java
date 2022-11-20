package exercise_2_Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
static ArrayList zoo = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfAnimals=3;

        for (int i = 0; i < numOfAnimals; i++) {
            System.out.println("Введіть вид тварини та її імья  ще "+ (numOfAnimals-i)+" разів");
            String inputSpecie = sc.next();
            String inputName = sc.next();
            zoo.add(i,new Animal(inputSpecie,inputName));
        }

        System.out.println("Взагалом в зоопарку є :");
        System.out.println(zoo);

    }

    public static class Animal{
        String specie;
        String name;

        public String getSpecie() {
            return specie;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return
                    "Вид тварини: '" + getSpecie() + '\'' + "\n ім'я тварини '" + getName() + '\''+"\n___________________________________\n";
        }

        public Animal(String specie, String name) {
            this.specie = specie;
            this.name = name;
        }
    }
}
