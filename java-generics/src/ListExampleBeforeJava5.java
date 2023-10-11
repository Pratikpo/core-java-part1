import java.util.ArrayList;
import java.util.List;

public class ListExampleBeforeJava5 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("pratik");
        list.add(100);
        list.add(10.5);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        String seconditem=(String) list.get(1);//we avoid compile the type checking usig explicit casting

    }

}
