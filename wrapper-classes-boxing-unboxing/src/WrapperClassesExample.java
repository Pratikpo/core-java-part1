
//new push
public class WrapperClassesExample {
    /*
        primitive data types
        1.byte
        2.short
        3.int-->4 bytes -32bits min value =-2*32
        4.long*
        5.float
        6.boolean
        7.double
        8.char

     */
    public static void main(String[] args) {
        int x=10;
        System.out.println("x:"+x);
        Integer y=x;//autoboxing
        System.out.println("y:"+y);
        System.out.println("integer min value: "+Integer.MIN_VALUE);
        System.out.println("integer max value: "+Integer.MAX_VALUE);
        Integer z=Integer.valueOf("10");
        String s=String.valueOf(10);
        Integer i=Integer.parseInt("10");
        float f=10f;
        Float f2=f;//automatic converts from float to Float(primitive wrapper)
        System.out.println("f: "+f);
        System.out.println("f2: "+f2);
        System.out.println("Float min value: "+Float.MIN_VALUE);
        System.out.println("Float max value: "+Float.MAX_VALUE);
        f=f2;//autounboxing-->automatically coverts from primitive to wrapper

    }
}
