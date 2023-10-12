import java.util.Scanner;

public class RevesrseString {
    public static void main(String[] args) {
        String yesno="yes";
        Scanner scanner=new Scanner(System.in);
        while (yesno.equals("yes")){

        System.out.println("Enter Your string: ");
        String line=scanner.nextLine();
        String rev="";
        for (int i=line.length()-1;i>=0;i--){
            rev=rev+line.charAt(i);
        }
        System.out.println("your reverse string: "+rev);
            System.out.println("If you want to continue \n1.yes\n2.no");
            yesno= scanner.next();
            scanner.nextLine();

        }
        System.out.println("Goodbye");
        scanner.close();

    }

}
