package com.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {
  //  Function functional interface
    // it takes input and produces an output
//  public static void main(String[] args) {
//      Function<String,Integer>x=s->s.length();
//      Integer val =x.apply("mike");
//      System.out.println(val);//4
//
//      //square of the number
//      Function<Integer,Integer>num=n->n*n;
//      Integer res = num.apply(100);
//      System.out.println(res);//10000
//  }
// Squar of the given number
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10, 20, 35, 12, 14);
//        List<Integer> newData = data.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(newData);//[100, 400, 1225, 144, 196]
//    }
     //add 5 to the every number
//    public static void main(String[] args) {
//        List<Integer> data=Arrays.asList(10,20,35,40,12,14);
//        List<Integer> newData=data.stream().map(x-> x+5).collect(Collectors.toList());
//        System.out.println(newData);//[15, 25, 40, 45, 17, 19]
//    }

    //convert every record to uppercase
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike", "stallin", "adam");
//        List<String> newData = data.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);//[MIKE, STALLIN, ADAM]
//    }

    //length of the record in list

//    public static void main(String[] args) {
//       List<String> data= Arrays.asList("mike","stallin","adam");
//      List<Integer> newData= data.stream().map(x ->x.length()).collect(Collectors.toList());
//      System.out.println(newData);//[4, 7, 4]
//    }

    // sort the record in the list

//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike","stallin","adam");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);//[adam, mike, stallin]
//    }

    //remove duplicate record from list

//    public static void main(String[] args) {
//        List<String> data=Arrays.asList("mike","stallin","adam","mike","stallin");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);//[mike, stallin, adam]
//    }

    //give me the names whoes length is greater than 4 in the list

    public static void main(String[] args) {
        List<String> data=Arrays.asList("mike","stallin","adam","priya");
        List<String> newData = data.stream().filter(x ->x.length()>4).collect(Collectors.toList());
        System.out.println(newData);//[stallin, priya]
    }
}
