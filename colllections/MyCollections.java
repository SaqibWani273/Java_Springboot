package colllections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyCollections {
    public static void show() {
        Collection<String> arrList=new ArrayList<String>();
        Collections.addAll(arrList, "A","B","C");
        System.out.println(arrList);
        var arrList2=new ArrayList<String>();
        arrList2.addAll(arrList);
        System.out.println(arrList2);
    }
}
