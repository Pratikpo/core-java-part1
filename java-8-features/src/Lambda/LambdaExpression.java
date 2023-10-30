package Lambda;

import java.util.ArrayList;
import java.util.List;


public class LambdaExpression {
    public static void main(String[] args) {
        List<String> grocery=new ArrayList<>();
        grocery.add("sugar");
        grocery.add("salt");
        grocery.add("soup");
        grocery.add("sugar");
        for (String name:grocery){
            System.out.println(name);
        }

       // grocery.forEach(System.out::println);
       // grocery.forEach(System.out::println);//java 8 feature lambda expression
        grocery.forEach(item-> System.out.println(item));

    }
}
