import java.util.Optional;
/*what is optional class in java
a container object which may not contain null values*/

public class OptionalExample {
    public static void main(String[] args) {
        String name="vikram";
        if (name!=null && !name.isEmpty()&&name.length()>4){
            System.out.println("name is not null and not empty and length is greater than 4");
        }else {
            System.out.println("Either name is null or name is empty or length is smalller than or equal to 4");
        }

        /*to create optional object an given object there are 3 methods
        1.of->use when object is not null otherwise it will shows NPE
        2.ofnullable->use when object is null this method returns optional object with this value provided
        if object is null it will return optional with empty
        3.empty->return optional with empty object no value inside it
        */
        Optional<String> optionalString=Optional.of("pratik");
        //with this help of optional ,null checks can be removed this progrmae.
        if (optionalString.isPresent()&&optionalString.get().length()>4) {
            System.out.println("USing optional -name is not null and not empty and length is greater than 4");
        }else {
            System.out.println("Using optional-Either name is null or name is empty or length is smalller than or equal to 4");
        }

        Optional<String> optionalString1=Optional.ofNullable(null);
        //with this help of optional ,null checks can be removed this progrmae.
        if (optionalString1.isPresent()&&optionalString1.get().length()>4) {
            System.out.println("USing optional -name is not null and not empty and length is greater than 4");
        }else {
            System.out.println("Using optional-Either name is null or name is empty or length is smalller than or equal to 4");
        }
    }
}

