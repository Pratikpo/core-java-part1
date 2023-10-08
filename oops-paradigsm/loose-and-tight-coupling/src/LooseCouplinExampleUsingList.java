import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LooseCouplinExampleUsingList {
    public static void main(String[] args) {

        LinkedList<String> guestlist =new LinkedList<>();
        guestlist.add("pratik");
        guestlist.add("karan");
        guestlist.add("kedar");

        List<String> newguestlist=new LinkedList<>();
        newguestlist.add("pratik");
        newguestlist.add("kedar");
        newguestlist.add("karan");



    }
}
