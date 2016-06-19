package ru.javawebinar.topjava.util;

import java.util.*;

/**
 * Created by ramil on 16.06.16.
 */
public class Difference implements Set{


    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set_1 = (Set<T>) set1;
        Set<T> result = new HashSet<T>(set1);
        set_1.retainAll(set2);
        result.addAll(set2);
        result.removeAll(set_1);
        return result;
    }

    public static void main(String[] args) {

        Set<Number> set_1 = new HashSet<>();// {1, 2, 3};
        set_1.add(1);
        set_1.add(2);
        set_1.add(3);
        System.out.println(set_1);

        Set<Number> set_2 = new HashSet<>();
        set_2.add(0);
        set_2.add(1);
        set_2.add(2);
        System.out.println(set_2);
        //Integer [] set_2 = {0, 1, 2};

        //Set<Integer> setDiff = new Difference();

        System.out.println(Difference.symmetricDifference(set_1, set_2));

        Set<Integer> s1 = new HashSet<>();
        //s1.addAll(new Integer(1, 2, 3));
        //Set<Integer> s2 = new HashSet<>(new int[]{0, 1, 2});
        //System.out.println(Difference.symmetricDifference(s1,s2));
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
