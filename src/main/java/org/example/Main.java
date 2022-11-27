package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,33,45,44,22));
        List<String> spring = new ArrayList<>(Arrays.asList("Spring","Shobit","Spring boot","Manish"));
        printingOddValues(numbers);
        printingWordsWithSpring(spring);
        System.out.println(printingLengthOfStrings(spring));
        sumOfNumbers(numbers);
        Map<String,Integer> map1= new HashMap<>();
        map1.put("Shobit", 1);
        map1.put("Manish", 3);
        map1.put("eklavya", 2);

        map1.entrySet().stream().forEach(System.out::println);


        extractedOddMethod(numbers, number -> number % 2 == 0);

    }

    private static void extractedOddMethod(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }

    private static void sumOfNumbers(List<Integer> numbers) {
        System.out.println(numbers.stream().reduce(0,(x,y)->x+y));
    }

    private static List<Integer> printingLengthOfStrings(List<String> spring) {
        return spring.stream().map(str->str.length()).collect(Collectors.toList());
    }

    private static void printingOddValues(List<Integer> numbers) {
        numbers.stream().filter(number-> number%2!=0).forEach(System.out::println);
    }
    private static void printingWordsWithSpring(List<String> string) {
        string.stream().filter(str-> str.contains("Spring")).map(str->str+str).forEach(System.out::println);//using map and filter to manipulate the result
    }




}