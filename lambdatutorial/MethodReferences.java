package lambdatutorial;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4).forEach(System.out::println);
        /*
        1. (arg)-> ClassName.staticMethod(arg)
            ClassName::staticMethod
         2. (arg1,arg2,...)->arg1.someMethod(arg2)
             ClassNAme::instanceMethod

             //local variable of type List<Integer> lst
             3. (arg)->lst.something(arg)
               localReferVariable::methodName

         */
        List<String> strList=Arrays.asList("Jayita","Ishita","Sukla");
        strList.sort((s1,s2)->s1.compareToIgnoreCase(s2));

        strList.sort(String::compareToIgnoreCase);

        /*(list,element)->list.contains(element);
                     list::contains;
            (String s)->Integer.parseInt(s)
            Integer::parseInt

            ()->new ArrayList<>();
            ArrayList::new

            (marks,age)->new Student(marks,age);
            Student::new
         */
    }
}
