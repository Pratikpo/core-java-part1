package functional.interface1;

public class Driver {
    public static void main(String[] args) {
        ExampleInterfacee exampleInterfacee=new ExampleInterfacee() {
            @Override
            public int randomeCalculate(int a, int b) {
                return 0;
            }
        };
        exampleInterfacee.print(100);
        exampleInterfacee.randomeCalculate(10,20);
            }
}
