package inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Samsung samsungPhone = new Samsung("Gallaxy",6.7,"Android11",true,true);
        Nokia nokiaPhone = new Nokia("3310",2.5,"not android phone",false,false);
        Mi miPhone = new Mi("MI NOTE 4",6.8,"Android 12",true,true);


        System.out.println("Samsung Phone Details:");
        System.out.println("Brand: " + samsungPhone.brand);
        System.out.println("Model: " + samsungPhone.model);
        System.out.println("Size: " + samsungPhone.size);
        System.out.println("Android Version: " + samsungPhone.androidVersion);
        System.out.println("Has Camera: " + samsungPhone.hasCamera);
        System.out.println("Has Bluetooth: " + samsungPhone.hasBluetooth);


        System.out.println("\n Nokia Phone Details:");
        System.out.println("Brand: " + nokiaPhone.brand);
        System.out.println("Model: " + nokiaPhone.model);
        System.out.println("Size: " + nokiaPhone.size);
        System.out.println("Android Version: " + nokiaPhone.androidVersion);
        System.out.println("Has Camera: " + nokiaPhone.hasCamera);
        System.out.println("Has Bluetooth: " + nokiaPhone.hasBluetooth);

        System.out.println("\n Mi Phone Details:");
        System.out.println("Brand: " + miPhone.brand);
        System.out.println("Model: " + miPhone.model);
        System.out.println("Size: " + miPhone.size);
        System.out.println("Android Version: " + miPhone.androidVersion);
        System.out.println("Has Camera: " + miPhone.hasCamera);
        System.out.println("Has Bluetooth: " + miPhone.hasBluetooth);



    }
}
