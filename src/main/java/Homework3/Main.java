package Homework3;

import java.util.LinkedList;
import java.util.ListIterator;

//Создать список по аналогии LinkedList (список связанных элементов),
// реализовать в нем iterable интерфейс.
// Список должен содержать элементы со ссылкой на следующий элемент
// (если показалось мало, то реализовать ссылку и на предыдущий элемент)

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listIneger = new LinkedList<>();
        listIneger.addFirst(100);
        listIneger.addFirst(50);
        listIneger.addFirst(25);
        listIneger.addFirst(12);
        listIneger.addFirst(6);

        for(int item : listIneger){
            System.out.println(item);
        }
    }
}


