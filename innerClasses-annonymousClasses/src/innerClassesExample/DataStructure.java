package innerClassesExample;

public class DataStructure {
    //outer class only have 2 access level   public and default
    private Integer num=10;
    //Inner class is just another field or object
    //It can have all access level e.g private default protected public
    //Inner class has access to outer class fields even if inner class is declared as private.
    private class printer{
        void display(){
            for (int i=0;i<10;i++){
                System.out.println("i="+i);
            }
        }
    }
    void showmesg(){
        System.out.println("A mesg from outer class");
    }

    public static void main(String[] args) {
        DataStructure dataStructure=new DataStructure();//first create outer class object
        printer printe=dataStructure.new printer();//then use outer class to create inner class object
        printe.display();
    }
}
