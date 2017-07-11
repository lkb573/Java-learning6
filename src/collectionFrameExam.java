import java.util.ArrayList;
import java.util.Collections;

import static jdk.nashorn.internal.objects.Global.print;

public class collectionFrameExam {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);

        list.add(new Integer(5));
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(4));
        list.add(new Integer(2));
        list.add(new Integer(3));

        ArrayList list1 = new ArrayList(list.subList(1,4));
        print(list,list1);

        Collections.sort(list);
        Collections.sort(list1);
        print(list,list1);

        System.out.println("list.containsAll(list1) --> "
                + list.containsAll(list1));

        list1.add("A");
        list1.add("C");
        list1.add(3,"B");
        print(list,list1);

        list1.add(3,"BB");
        print(list,list1);


    }

    static void print(ArrayList list, ArrayList list1){
        System.out.println(list);
        System.out.println(list1);
        System.out.println();
    }
}