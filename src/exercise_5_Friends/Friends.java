package exercise_5_Friends;

import java.util.ArrayList;
import java.util.Collections;
/*
Завдання 5

Використовуючи Intelij IDEA, створити клас Friends.
За допомогою методів ArrayList додати масив імена друзів.
Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */
public class Friends {
    public static void main(String[] args) {

        ArrayList friendsList = new ArrayList();

        friendsList.add("Степан");
        friendsList.add("Петро");
        friendsList.add("Ольга");
        friendsList.add("Микола");
        friendsList.add("Андрій");

        System.out.println(friendsList);
        Collections.sort(friendsList);
        System.out.println(friendsList);
    }
}
