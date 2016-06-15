package ru.javawebinar.topjava.util;

import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Created by ramil on 15.06.16.
 */
public class Pair <T, N> {

    private final T value1;
    private final N value2;

    private Pair(T value1, N value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <T, N> Pair<T, N> of(T value1, N value2){
        return new Pair<>(value1, value2);
    }

    public T getFirst(){
        if (value1 == null) {
            throw new NoSuchElementException("No value present");
        }
        return value1;
    }

    public N getSecond() {
        if (value2 == null) {
            throw new NoSuchElementException("No value present");
        }
        return value2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(value1, other.value1) & Objects.equals(value2, other.value2);
    }


    public int hashCode() {
        return Objects.hashCode(value1);
    }


    public static void main(String[] args){
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
}
