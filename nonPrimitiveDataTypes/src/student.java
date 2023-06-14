//class is user defined data type or it a blueprint data types
public class student {
    //properties
    String name;
    int id;
    char div;
    int age;
    String collegeName;
    //methods for behaviour or actions
    void study(){
        System.out.println(this.name +" is studying");
    }
    void play(){
        System.out.println(this.name +" is playing");
    }
    void commut(){
        System.out.println(this.name +" is commuting");
    }
}
//object : object is entity of class
class Example{
    public static void main(String[]arg){
        student pratik = new student();
        //new keywords creates an object to the heap and they have address
        //student() is no argument constructor call


        //fields for pratik
        pratik.name = "pratik";
        pratik.age = 23;
        pratik.id = 101;
        pratik.div = 'a';
        pratik.collegeName ="kit college";
        //methods for pratik
        pratik.commut();
        pratik.play();
        pratik.study();

        student kishor = new student();
        kishor.name = "kishor";
        kishor.age = 23;
        kishor.div = 'b';
        kishor.id = 103;
        kishor.play();
        kishor.study();
        kishor.commut();
    }
}
