public class employee {
    //attributes or fields
    int id;
    long phoneNum;
    String name;
    String address;
    long salary;
    String gender;
    String company;


    //constructos:constructor construct the object Basically initialize the object
    /*
    1.constructor name must be same as class name
    2.constructor does not have any return type
    3.constructor can have parameter
    4.constructor does not have any value
     */

    //no argument passed
    employee(){
        System.out.println("no arg constructor called");
        this.name="pratik";
        this.address="kagal";
        this.company="xyz";
        this.id =101;
        this.gender="male";
        this.phoneNum=9552930270L;
        this.salary=10000L;


    }

    //parameterized constructor
    employee(String name,int id,String address,String company,String gender,long phoneNum,long salary){
        System.out.println("parameterized constructor called");
        this.name=name;
        this.address=address;
        this.company=company;
        this.phoneNum=9552930270L;
        this.gender=gender;

    }

    //copy constructor = copy fields from one object to another object
    employee(employee pratik1){
// this will refer for pratik3
        this.name= pratik1.name;
        this.id=pratik1.id;
        this.gender=pratik1.gender;
        this.company=pratik1.company;
        this.phoneNum=pratik1.phoneNum;
        this.address=pratik1.address;
        this.salary=pratik1.salary;
    }
    void displayAndObjects(){
        System.out.println("hello"+this.name);
        System.out.println(this.address+"\n"+this.company+"\n"+this.gender+"\n"+this.id+"\n"+this.phoneNum);

    }
}
class Testclass{
    public static void main(String[] args) {
        employee pratik=new employee();
        pratik.displayAndObjects();


        employee pratik1=new employee("kishore",102,"pune","xyz","male",7709801018L,30000L);
        pratik1.displayAndObjects();

        employee pratik3 =new employee(pratik1);
        pratik3.displayAndObjects();
    }
}