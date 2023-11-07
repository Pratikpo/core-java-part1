import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {


        String name = "vikram";
        Optional<String> optionalString = Optional.ofNullable(name);
        System.out.println("is value present"+optionalString.isPresent());
        System.out.println("get the value from optional "+optionalString.get().length());
        System.out.println("Length of the object in optional"+optionalString.get().length());
        optionalString.ifPresentOrElse(s->
                System.out.println("value present inside optional is"+s),
                ()-> System.out.println("no value is present")
        );

        optionalString.map(s->{
            System.out.println("s is"+s);
            Character firstchar=s.charAt(0);
                    return firstchar;
        }).ifPresentOrElse(c->
                        System.out.println("value present inside optional is"+c),
                ()-> System.out.println("no value is present"));
    }
}