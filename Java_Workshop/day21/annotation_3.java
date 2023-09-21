package day21;

import java.util.*;

/*
 * @SuppressWarnings("unchecked") is used to suppress warnings which are shown by the compiler.
 * In the above example, we are using ArrayList without generics, which means we are using non-parameterized version of ArrayList.
 * If we remove the annotation, it will show warning at compile time. But if we use annotation, compiler will not show warning.
 */

public class annotation_3 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();
        ArrayList list = new ArrayList();
        list.add("Batch 2");
        list.add("Hello");
        list.add("Team");

        for(Object obj:list){
            System.out.println(obj);
        }

    }
}
