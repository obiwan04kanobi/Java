import java.util.*;

public class vectors_1{
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(); // Vector is a class. It is a dynamic array. It is synchronized.
        v1.add(4);
        v1.add(78);
        v1.add(13);
        v1.add(27);
        v1.add(67);
        System.out.println("Vector Values: "+v1);
        Vector<Integer> v2 = new Vector<>();
        v2.addAll(v1); // Copying v1 to v2. addAll() is a method of Vector class.
        System.out.println("Copying V1 to V2: "+v2);

        List<Integer> v3 = new ArrayList<>();
        v3 = v1.subList(2, 4); // subList() is a method of Vector class. It returns a list.
        System.out.println("SubList: "+v3);


    }
}