package ru.javawebinar.topjava;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * User: gkislin
 * Date: 05.08.2015
 *
 * @link http://caloriesmng.herokuapp.com/
 * @link https://github.com/JavaOPs/topjava
 */
public class Main {
    public static void main(String[] args) {

        Collection<?> collection = new HashSet<>();
        Object object = new Object();
        //collection.addAll(Arrays.asList(object));
        collection.contains(object);
        //collection.add(object);
        collection.size();
        collection.clear();
        collection.toArray();
        collection.remove(object);
        collection.iterator();


        System.out.format("Hello Topjava Enterprise! ");
    }
}
