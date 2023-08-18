public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class helloClass = Class.forName("Hello");
            System.out.println("Class loaded: " + helloClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getStackTrace());
        }
    }
}

