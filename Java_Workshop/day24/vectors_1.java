import java.util.*;

public class vectors_1{
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(13);
        v1.add(27);
        v1.add(67);
        System.out.println("Vector Values: "+v1);
        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v1);
        System.out.println("Copying V1 to V2: "+v2);

    }
}