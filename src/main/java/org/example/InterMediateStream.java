package org.example;


import java.util.Arrays;
import java.util.stream.Stream;

public class InterMediateStream {

    public static void main(String[] args) {

        // Intermediate Stream is used to perform operations on the stream and returns the stream itself.
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 53, 23, 45, 67, 89, 90, 12, 34, 56, 78, 98, 76, 54, 32, 10,43,3,2,5,3,7,5,45,764,436,65754,345};
        Stream<Integer> num = Arrays.stream(numbers).filter(x -> x%2 == 0 || x%5 == 0);

        // Intermediate Stream does not produce a result.
        // Intermediate Stream is lazy in nature.
        // Intermediate Stream is used to perform operations like filter, map, flatMap, etc.
        // Intermediate Stream is used to perform operations on the stream and returns the stream itself.
    }

}
