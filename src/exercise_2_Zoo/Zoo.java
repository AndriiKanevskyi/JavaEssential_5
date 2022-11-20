/*

Завдання 2
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Zoo.
У класі створити список, який записати 8 тварин через метод add(index, element).
Вивести список у консоль.



 */
package exercise_2_Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
public static ArrayList zooList = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfAnimals=8;

        for (int i = 0; i < numOfAnimals; i++) {
            System.out.println("Введіть вид тварини та її імья  ще "+ (numOfAnimals-i)+" разів");
            String inputSpecie = sc.next();
            String inputName = sc.next();
            zooList.add(i,new Animal(inputSpecie,inputName));
        }

        System.out.println("Взагалом в зоопарку є :");
        System.out.println(zooList);



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
