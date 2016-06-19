package ru.javawebinar.topjava;

import java.math.BigInteger;
import java.util.*;

/**
 * User: gkislin
 * Date: 05.08.2015
 *
 * @link http://caloriesmng.herokuapp.com/
 * @link https://github.com/JavaOPs/topjava
 */
public class Main {

    private ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    public ArrayDeque<Integer> getArrayDeque() {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            int i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            arrayDeque.add(i);
            //System.out.println(main.arrayDeque);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        return arrayDeque;
    }



    public static void main(String[] args) {
        Main main = new Main();
        //Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        //System.out.print("Введите целое число: ");
        //if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
        //    int i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        //    main.getArrayDeque().add(i);
            //System.out.println(main.arrayDeque);
        //} else {
        //    System.out.println("Вы ввели не целое число");
        //}
        Deque<Integer> integerList = main.getArrayDeque();
        for (int i = 0; i < main.arrayDeque.size(); i=i+2) {
            main.getArrayDeque().descendingIterator();
            System.out.println(main.getArrayDeque().element());
        }

    //    System.out.format("Hello Topjava Enterprise! ");
    }
}
