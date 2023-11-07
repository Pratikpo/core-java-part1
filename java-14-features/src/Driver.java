import java.util.Objects;
//student is plain java object
//this class contains basic feilds
//these students feilds are final
//that means one object created there feilds cannont changed
//so basically students is immutable object
//record is introduced in new features in java 14
//recoed in is immutable object
//syntax= record student(name,age)
//records all argument constructors
record Student(String name, int age) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student student)) return false;

        return age == student.age
                && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Driver {
    public static void main(String[] args) {
        Student student=new Student("praik",24);
        System.out.println(student.toString());
        System.out.println(student.name()+ student.age());

    }
}

