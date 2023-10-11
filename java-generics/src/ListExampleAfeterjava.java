import java.util.ArrayList;
import java.util.List;



public class ListExampleAfeterjava {
    public static void main(String[] args) {
        List<String> guestlist=new ArrayList<>();
        guestlist.add("pratik");
        guestlist.add("karan");
        guestlist.add("Moin");
        guestlist.add("kedar");
       for (String name:guestlist){
           System.out.println("My guest: "+name);
       }

        List<Integer> primenumber=new ArrayList<>();
        primenumber.add(2);
        primenumber.add(5);
        primenumber.add(7);
        primenumber.add(11);
        for (Integer i:primenumber){
            System.out.println("prime number: "+i);
        }


    }
}
