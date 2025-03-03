package org.example.miscellaneous;

import java.util.Arrays;
import java.util.List;

public class InterviewProblem {

    public static void main(String[] args){

        //NISUM Hydrabad Company.
        List<Integer> lst = Arrays.asList(12,324, 512,123);
        lst.stream().map(n -> n+"").filter(num -> num.startsWith("1")).map(Integer::parseInt).forEach(System.out::println);

    }
}
