package Java.Extra_Sources.Java.Array_Arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayArraylistCapacity_SizeWithExplanation {
    public static void main(String[] args) throws Exception {


          /*Array Length vs. Capacity
          Actually in array there is no difference about capacity and size or length*/
        String [] a = new String [5]; //while we are creating array we need to specify length.
        System.out.println("a.length = " + a.length);
        System.out.println("a = " + Arrays.toString(a));
        a[0]="First Item";
        a[1]="Second Item";
        a[2]="Third Item";
        System.out.println("a (after adding three items) = " + Arrays.toString(a));
        a[3]="Fourth Item";
        a[4]="Fifth Item";
        //a[5]="Sixth Item"; //--> Array out of bound exceptions

        /*In this scenario, we have to create a new array with a bigger size and copy the elements of the previous array to the newly created array. This not just wastes time, but also wastes a lot of memory.We understand that arrays are linear and homogeneous data structures that have a fixed size. While creating an array, we have to specify its size which cannot be changed once array is created at runtime. This creates an issue if we do not have an upper limit on the number of elements in an array.

         This issue can be resolved using dynamic arrays which is ArrayList in Java. The size of the java.util.ArrayList is dynamic which means it can be modified at runtime. ArrayList is a part of Java Collections framework and is present in java.util package.


         Difference ArrayList vs Array:

         In Java, both "Array" and "ArrayList" are used to store collections of elements, but they have some key differences:

         Size:
         Array: Arrays have a fixed size, which is determined when you create them. Once you define the size, it cannot be changed.
         ArrayList: ArrayLists are dynamic, meaning their size can be modified as needed. You don't need to specify the size in advance.

         Type:
         Array: Arrays can store elements of a single data type. For example, you can create an array of integers, strings, or any other data type.
         ArrayList: ArrayLists can store elements of any data type because they are based on the generic type system. You can create an ArrayList of any object type, such as ArrayList<Integer> or ArrayList<String>.

         Access and Manipulation:
         Array: Arrays offer direct access to elements using an index. You can easily read and modify values at specific positions.
         ArrayList: ArrayLists provide more dynamic methods for adding, removing, and manipulating elements. They offer various methods like "add," "remove," and "set" for element management.

         Libraries:
         Array: Arrays are part of the core Java language and are simple to use without additional libraries.
         ArrayList: ArrayLists are part of the Java Collections Framework, so you need to import the "java.util.ArrayList" class and use the associated methods.

         Flexibility:
         Array: Arrays are less flexible in terms of size, and you need to manage the resizing manually if you want to change the number of elements.
         ArrayList: ArrayLists are more flexible and can grow or shrink automatically as elements are added or removed.

         In summary, if you need a fixed-size collection of elements and know the size in advance, an array may be suitable. If you require a dynamic collection that can change in size and hold elements of different types, ArrayList is a more convenient choice due to its flexibility and built-in methods for managing elements.

         In order to mitigate the sizing problem of the array, dynamic arrays came into the picture. ArrayList data structure is used to implement the concept of dynamic data structures in Java. As the name suggests, dynamic arrays have a dynamic size modifiable at runtime. We do not have to specify the size of the ArrayList at the time of creation.

         We need to be careful about that size and capacity is different things in java arraylist.

         Capacity is the current maximum number of elements a dynamic array can hold, whereas Size is the total elements present in the dynamic array.

         In java 8 default capacity of ArrayList is 0 until we add at least one object into the ArrayList object.
         So, the default capacity of an empty ArrayList is 0 and not 10 in Java 8. Once the first item is added, the DEFAULT_CAPACITY which is 10 is then used. The purpose of this change in Java 8 is to save memory consumption and avoid immediate memory allocation. As no elements have been added yet, the size is zero.

         There is no direct way to check ArrayList capacity. The ArrayList class maintains a private Object array named elementData .

         Though it is never required, you may access this private array's length to check the capacity of the ArrayList using Java reflection for experimental purposes.

         So if you  try to see the capacity of an Arraylist you need to check with these codes: */

        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("The first size of arr after creating= " + arr.size());
        System.out.println("The default capacity of arr after creating: "+getCapacity(arr));

        /*We have created a dynamic array i.e., an ArrayList of integers arr and then checked its size. Since the ArrayList has no elements added, its size and capacity are 0 at present. When the elements are added, their size increases.*/

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

        /* When the size of the ArrayList becomes equal to its capacity, a new array with double the capacity gets created and the previous elements are stored inside the new array created internally.*/

        System.out.println("The size of arr after adding eleventh element = " + arr.size());
        System.out.println("The default capacity of arr after adding eleventh element: "+getCapacity(arr));

        //now give initial capacity of 100 and run the code
        //now try the initial capacity of 10
      /* So the size of the list is the number of elements in it. The capacity of the list is the number of elements the backing data structure can hold at this time. The size will change as elements are added to or removed from the list. The capacity will change when the implementation of the list you're using needs it to. (The size, of course, will never be bigger than the capacity.)*/

    }
    static int getCapacity (ArrayList al) throws Exception{
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}
