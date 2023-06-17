package driver;

import entities.Address;
import entities.College;
import entities.Employee;
import entities.Student;

public class driver {
    public static void main(String[] args) {
        Address address = new Address();
        address.setFlatNum("A101");
        address.setLineNum("kagal road");
        address.setTaluka("kagal");
        address.setDistrict("kolhapur");
        address.setState("maharashtra");


        College college = new College();
        college.setName("kit");
        college.setNumOffStaff(200);
        college.setNumOffStudents(2000);

        Employee employee = new Employee();
        employee.setName("pratik");
        employee.setAge(32);
        employee.setCollege(college);



        Student student = new Student();
        student.setName("kedar");
        student.setAddress(address);
        student.setCollege(college);
        student.setId(102);


        System.out.println(address.toString());
        System.out.println(college.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
    }
}
