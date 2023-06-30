import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your first subject marks:");
        int num1= scanner.nextInt();

        System.out.println("Enter your second subject marks:");
        int num2= scanner.nextInt();

        System.out.println("Enter your third subject marks:");
        int num3= scanner.nextInt();

        System.out.println("Enter your forth subject marks:");
        int num4= scanner.nextInt();

        System.out.println("Enter your fifth subject marks:");
        int num5= scanner.nextInt();


        float i=num1+num2+num3+num4+num5;
        float j= (i/500)*100;
        System.out.println("Total marks obtained\t"+i);
        System.out.println("your percentage are \t"+j);


    }
}
