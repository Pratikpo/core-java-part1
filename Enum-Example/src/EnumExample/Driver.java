package EnumExample;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Direction.values()));
     for(Direction direction:Direction.values()){
         System.out.println(direction.mesg);
     }
    }
}
