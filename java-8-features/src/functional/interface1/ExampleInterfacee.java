package functional.interface1;

@FunctionalInterface

public interface ExampleInterfacee {
    int randomeCalculate(int a,int b);//abstract method declaration
    default void print(int result){
        System.out.println(result);
    }//default method is concret methos it is written in functional interfce
    //fucntional interface is only have abstact methods
}


