package exercise_3_Zoo;

import exercise_2_Zoo.Zoo;

import java.util.ArrayList;
import java.util.Collections;

/*
Завдання 3

Використовуючи Intelij IDEA, створити проект, пакет.
Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.
 */
public class ZooRemover {
    public static void main(String[] args) {

        Zoo.main(args);// згідно завдання використовую класс Zoo в повному обсязі. Він генерує список і виводить на екран

        System.out.println("Довиженна оригінального массиву до скорочення "+Zoo.zooList.size());
        ArrayList temp = new ArrayList (Zoo.zooList.subList(0,Zoo.zooList.size()-3));
        System.out.println("Довиженна массиву після скорочення на 3: "+temp.size());

        System.out.println("Довиженна оригінального массиву до скорочення "+Zoo.zooList.size());
         temp = new ArrayList (Zoo.zooList.subList(0,Zoo.zooList.size()-5));
        System.out.println("Довиженна массиву після скорочення на 5: "+temp.size());

        System.out.println("Довиженна оригінального массиву до скорочення "+Zoo.zooList.size());
         temp = new ArrayList (Zoo.zooList.subList(0,Zoo.zooList.size()-7));
        System.out.println("Довиженна массиву після скорочення на 7: "+temp.size());
    }
}
//Кіт Анатолій Кіт Анатолій Кіт Анатолій Кіт Анатолій Кіт Анатолій Кіт Анатолій Кіт Анатолій Кіт Анатолій