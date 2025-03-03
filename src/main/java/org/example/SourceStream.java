package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourceStream {

    public static void main(String[] args) {

        //from array of data into stream(Source).
        Integer[] arr = {2,4,1,3,65,65,45,75,45,7866,67,5465,46,546,4,64,6,6,9,564,3434,35345,6,55,67,686,7};
        Stream<Integer> streamss = Arrays.stream(arr);
        streamss.forEach(System.out::println);

        String[] str = {"Hello", "My dear", "Friend", "How are you" ,"Today","?"};
        Stream<String> streams = Arrays.stream(str);
        streams.forEach(System.out::println);

        // infinite stream of data.
        Stream<Integer> infi = Stream.generate(() ->3);
        infi.limit(10).forEach(System.out::println);
        Stream<Integer> infiniteStreams = Stream.iterate(0, n -> n+2).limit(10);
        infiniteStreams.forEach(System.out::println);
        // of method to create stream of data.
        Stream<Integer> ofStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        ofStream.forEach(System.out::println);
    }
}
