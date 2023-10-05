package EnumExample;
//ENUM IS SET OF PREDEFINED CONSTANT
//E.G DIRECTION IS an predefined constant
//enum is simmilar to class
//enum can have feilds
//enum can have same constructors and methods
//each enum constant public static final by default
//each enum constant write in capital letters
//enum is basically class but only difference is its objects are
//static variable and blocks are executed when class is loaded into memory

public enum Direction {
    //public static final direction north=new direction("north is hot")
    NORTH("north is hot"),
    SOUTH("south food is awesome"),
    EAST("sun rises in east direction" ),
    WEST("west is an home");
    //instance variable
    //all the foure variable are enum objects
    String mesg;
    //constructor

    Direction(String mesg) {
        this.mesg = mesg;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }
}
