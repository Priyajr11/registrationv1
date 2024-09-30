package com.api;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class A {

    //1.Predicate Functional interface
//it take input and produce boolean value output.
// it helps to compare something and return boolean value. and use of filtering the record.

 //   public static void main(String[] args) {
//        Predicate<Integer> val=x-> x>3;
//        boolean result = val.test(100);
//        System.out.println(result); //true

//        Predicate<String> val=x-> x.equals("mike");
//        boolean result = val.test("miki");
//        System.out.println(result);//false
//      public static void main(String[] args){
//        List<Integer> data = Arrays.asList(100, 10, 35, 2, 15, 200, 300, 500);
//        List<Integer> result = data.stream().filter(x -> x > 100).collect(Collectors.toList());
//        System.out.println(result);//[200, 300, 500]

//      public static void main(String[] args){
//          List<String> data = Arrays.asList("mike","adam","madam" , "bike", "me");
//          List<String> res = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//          System.out.println(res);//[mike, madam, me]


//         public static void main(String[] args) {
//            List<Integer> num= Arrays.asList(10,11,13,14,16,19,20,30);
//            List<Integer> evenNum=num.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
//            System.out.println(evenNum);//[10, 14, 16, 20, 30]

//    public static  void main(String[] args){
//        List<Integer> num=Arrays.asList(10,11,13,14,16,19,29,30);
//        List<Integer> oddNum=num.stream().filter(x-> x%2 !=0).collect(Collectors.toList());
//        System.out.println(oddNum);

//}
    public  static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Mike"),
               new Employee(2, "Stallin"),
                      new Employee(3, "adam")
              );
              List<EmployeeDto> dtos = employees.stream().map(A::mapToDto).collect(Collectors.toList());

        }
      static EmployeeDto mapToDto(Employee employee){
              EmployeeDto dto= new EmployeeDto();
              dto.setId(employee.getId());
              dto.setName(employee.getName());
              return dto;
      }


      }

