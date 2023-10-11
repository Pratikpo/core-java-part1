import java.util.ArrayList;
import java.util.List;

public class DriverForStudent {
    public static void main(String[] args) {
        List<StudentLsit> studentLsits=new ArrayList<>();
        studentLsits.add(new StudentLsit("pratik",24,10));
        studentLsits.add(new StudentLsit("kedar",16,11));
        studentLsits.add(new StudentLsit("karan",24,13));
        studentLsits.add(new StudentLsit("moin",24,13));
        for (StudentLsit student:studentLsits) {
            System.out.println("my stident name: "+student);
        }



        Employee<Hr> hr =new Hr();
        Employee<Admin> adminEmployee=new Admin();
        Employee<Developer> developerEmployee=new Developer();


    }
}
