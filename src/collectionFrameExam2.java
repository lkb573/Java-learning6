import java.lang.reflect.Field;
import java.util.ArrayList;


public class collectionFrameExam2 {
    public static void main(String[] args) throws Exception {

        ArrayList list = new ArrayList(10);
        list.add("1");
        list.add("2");
        list.add("3");
        print(list);

        list.trimToSize();
        System.out.println("--After trimsize--");
        print(list);

    }

    static void print(ArrayList<?> list) throws Exception {
        System.out.println(list);
        System.out.println("size --> " + list.size());
        System.out.println("capacity --> " + getCapacity(list));
    }

    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }

}