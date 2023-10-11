

    public class Driver {
        public static void main(String[] args) {
            Student student1 = new Student("pratik", 100, 24);
            Student student2 = new Student("pratik", 100, 24);
            Student student3 = new Student("pratik", 100, 23);
            System.out.println(student1.equals(student2));
            System.out.println(student1.equals(student3));
            Employee employee =new Employee("pratik",100,24);
            System.out.println(student1.equals(employee));
            System.out.println("hashcode for student1 is:"+student1.hashCode());
            System.out.println("pratik hashcode is:"+"pratik".hashCode());

        }
    }
