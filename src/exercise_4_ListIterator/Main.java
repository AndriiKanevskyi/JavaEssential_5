package exercise_4_ListIterator;

import java.util.*;
/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(Collections.nCopies(100, 1));
        System.out.println(list);
        Iterator iterator = list.iterator();

        for (int i = 0; iterator.hasNext();iterator.next(), i++) {
           int temp= (int) list.get(i);
           temp++;
            list.set(i,temp);
        }
        System.out.println(list);


    }
}
