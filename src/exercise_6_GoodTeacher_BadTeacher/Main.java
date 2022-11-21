package exercise_6_GoodTeacher_BadTeacher;
/*
Завдання 6

Використовуючи Intelij IDEA, створити проект, пакет.
Створити class Main, у ньому створити список, додати вчителів, яких ви зможете згадати зі школи.
І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> teachersList = new ArrayList<>();

        teachersList.add("Людмила Падлівна");
        teachersList.add("Лариса Михалівна");
        teachersList.add("Ольга Сергіївна");
        teachersList.add("Людмила Іванівна");

        Collections.sort(teachersList);// Сортування для моживості бінарного пошуку


        String [] array = new String[teachersList.size()];// Переведення в звичайний массив для моживості бінарного пошуку
        teachersList.toArray(array);
        // String [] array = teachersList.toArray(new String[teachersList.size()]);// Коротша форма запису

        System.out.println("\nВсі вчителі: "+teachersList);
        System.out.println("Кращий вчитель знахоиться під індексом : "+Arrays.binarySearch(array,"Лариса Михалівна"));
        System.out.println("Найгірший вчитель знахоиться під індексом : "+Arrays.binarySearch(array,"Людмила Падлівна"));
    }

}
