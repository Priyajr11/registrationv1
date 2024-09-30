package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class C {
    //Consumer Functional Interface
      // it takes one input and produces no output

//    public static void main(String[] args) {
//        Consumer<String> x = s-> System.out.println(s);//mike
//        x.accept("mike");
//    }

//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("alice", "bob", "charlli");
//        Consumer<String> val = s-> System.out.println(s);
//        names.forEach(val); //alice
//                            // bob
//                            //charlli
//    }

//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10, 20, 13, 15);
//        int res = data.stream().mapToInt(Integer::intValue).sum();
//        //mapToInt method is used to convert wrapper class to integer, in list each element are stored as object so sum of
//        //the object  is not possible so we need to convert into integer value so we use mapToInt
//        System.out.println(res); //58
//    }


//    public static void main(String[] args) {
//       List<Integer> numbers =  Arrays.asList(3,6,9,10,1,5);
//        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//        System.out.println(max.get());//10
//    }


//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(3,5,6,10,8);
//        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
//        System.out.println(min.get());//3
//
//    }
}
