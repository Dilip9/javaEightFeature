package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Feature8 {
    public static void main(String[] args) {
        // sort string in alphabetical order
        List<String> lst = Arrays.asList("hello","Dear", "How", "are","able", "to complete");
        //sort the string using alphabetical order.
        lst.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);
        List<Character> lowerToUpperCaseCharacter  = Arrays.asList('e', 'o', 'm','l');
        List<String> strs = lst.stream().map( str ->{
            char[] charArray = str.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(lowerToUpperCaseCharacter.contains(Character.toLowerCase(charArray[i])))
                {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }
            return new String(charArray);
        }).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println(strs);

        List<Integer> lsts = Arrays.asList(54,23,75,34,97,4,23,65,7,4,2,33,43,4,45,34,65,76,24);
        //lsts.stream().sorted().forEach(System.out::println);
        Set<Integer> hset = new HashSet<>();
        lsts.stream().filter( n -> hset.add(n)).collect(Collectors.toList());
        Map<Integer, Long> hmap = lsts.stream().collect(Collectors.groupingBy(n ->n, Collectors.counting()));
        hmap.entrySet().forEach(System.out::println);


    }






}