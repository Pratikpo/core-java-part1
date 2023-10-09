public class Main {

        /*
        here 'new' operator creates a new Object of type Car in the heap ,
        assume at address 1000h . And myCar is reference variable of Object
        created by new operator and myCar points this object at 1000h.
        Basically myCar reference variable holds address 1000h
        */
    public static void main(String[] args) {
        Car mycar=new Car("Honda");
        System.out.println("Car brand is:"+mycar.brandname);//prints honda
        changecarref(mycar);//this method passes 1000h value(actually the address of new object created)
        /*
        This function will not change the address hold by myCar reference .
         */
    }
    public static void changecarref(Car carref){
         /*
        here carRef holds address of Car Object that is 1000h when
        changeCarReference method */
        System.out.println("car brand is:"+carref.getBrandname());
              /*
        This confirms that carRef holds 1000h as address and points to same Object as
        of myCar reference
         */
        carref.setBrandname("Toyota");
        /*
        This will change the brand name of Car Object at address 1000h in heap to Toyota
         */
        System.out.println("car brand name:"+carref.getBrandname());
           /*
        This confirms that carRef points to 1000h address and points to same Object
        as of myCar reference and changed the brand name of Car Object at 1000h to Toyota
         */
        Car car=new Car("Tata");
       /*
        here 'new' operator created a new Object of type Car in the heap , assume at
        address 2000h and newCar reference points to 2000h
         */
        carref=car;
        System.out.println("car brand name:"+carref.getBrandname());
        //This confirms that carRef points to object at 2000h as it printed Tata


    }
}
