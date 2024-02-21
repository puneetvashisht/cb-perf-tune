import java.util.ArrayList;
import java.util.List;

public class StringDemo2 {

    public static void main(String[] args) {

        // mesaure method performance in ms
        long start = System.currentTimeMillis();


        List<String> list = new ArrayList<>();
        for(int i=0; i<10000000; i++) {
            list.add(String.valueOf(i).intern());
            // list.add(String.valueOf(i));
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
    }
    
}
