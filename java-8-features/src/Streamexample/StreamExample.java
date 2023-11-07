package Streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> guestList=new ArrayList<>();
        guestList.add("Vikram");
        guestList.add("Karan");
        guestList.add("Pratik");
        //streams are used to replace for while loop.

        Stream<String> stringStream=guestList.stream();
        stringStream
                .filter(s->s.length()>=5)
                .map(s->{
                    System.out.println("s is : "+s);
                    return s.toLowerCase();
                })
                .forEach(item-> System.out.println("item in list "+item));

        //the execution of elements occurs in parallel
        //that means if streams contains 5 elements then for each entire stream pipeline get executed
    }
}
