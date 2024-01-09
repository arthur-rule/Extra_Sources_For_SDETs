package Java.Extra_Sources.Java.Array_Arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayArraylistCapacity_SizeWithoutExplanation {
    public static void main(String[] args) throws Exception {


        String [] a = new String[5];
        System.out.println("a.length = " + a.length);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        a[0] = "First Item";
        a[1] = "Second Item";
        a[2] = "Third Item";
        System.out.println("a (after adding three items) = " + Arrays.toString(a));
        a[3]="Fourth Item";
        a[4]="Fifth Item";
        System.out.println("a (after adding five items) = " + Arrays.toString(a));
        //a[5]="Sixth Item"; ---->ArrayIndexOutOfBoundsException

        System.out.println("---------------------------------------------------------------------");

        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("The first size of arr after creating= " + arr.size());
        System.out.println("The default capacity of arr after creating: "+getCapacity(arr));

        arr.add(1);

        System.out.println("The size of arr after adding first elements = " + arr.size());
        System.out.println("The default capacity of arr after adding first element: "+getCapacity(arr));

        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);

        System.out.println("The size of arr after adding eleventh element = " + arr.size());
        System.out.println("The default capacity of arr after adding eleventh element: "+getCapacity(arr));

    }


    static int getCapacity (ArrayList al) throws Exception{
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
