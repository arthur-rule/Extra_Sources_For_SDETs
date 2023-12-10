package Java.Extra_Sources.Java.Array_Arraylist;

public class declarationInstantiationInitialization {
    public static void main(String[] args) {
        /*In Java, declaration, instantiation, and initialization are three key
        concepts related to working with variables.
        1.Declaration:

        This is when you tell the compiler about a variable's name and type
         but don't allocate any memory for it. Essentially, you're saying,
         "Hey, I'm going to use this variable, and it's going to be of this type,
         but it does not allocate memory or assign a value to the variable.

         ---How To DECLARE An Array In Java?
        In Java, a one-dimensional array is declared in one of the following ways:

        Here the ‘data_type’ specifies the type of data the array will hold.
                The ‘data_type’ can be a primitive data type or any derived type.
        For Example, an array piArray of type integer is declared as follows:

        data_type[] array_name; ----->  int[] piArray; or
        data_type array_name[]; ----->  int piArray[];



        This means that the array piArray will hold the elements of data type int.

                Note that as the arrays in Java are dynamically allocated,
                we do not specify any dimension or size of the array with the declaration.
        The above declaration tells the compiler that
        there is an array variable ‘piArray’ of type int
        which will be storing the integer type values in it.

        The compiler does not know the size or actual values stored in an array.
        It will only know that after we initialize the array.

         */

        // ---Declare an Array:
        //int [] piArray  //or int piArray []

         int myNumber;
        int[] piArray;

        /*
        2.Instantiation:
        This term is often used in the context of object-oriented programming.
        Instantiation is the creation of an object or an instance of a class.
        It involves using the new keyword followed by a constructor to create
        an object in memory.


        ---How To INSTANTIATE  An Array In Java?
        We have already declared an array in the previous section. But this is just
        a reference.
        In order to use the above-declared array variable, you need to instantiate it
        and then provide values for it. The array is instantiated using ‘new’.

        The general syntax of instantiating is as follows:

        array_name = new data_type [size];
        In the above statement, array_name is the name of the array being instantiated.

        data_type=> type of elements the array is going to store

        size=> the number of elements that will be stored in array
        Hence when you use new with the array, you are actually allocating the array
        with the data type and the number of elements.

                So the above-declared array myarray can be instantiated as follows:*/

        piArray = new int[3];
        //Thus creating an array in Java involves two steps as shown below:

//        int[] piArray;          //declaration
//        piArray = new int[3];  //instantiation

        //---Instantiate an Array:
        // piArray=new int [3];



        /*
        3.Initialization:
        Initialization is the process of assigning an initial value to a variable.
        It can occur at the time of declaration or later in the code.


        ---How INITIALIZE An Array In Java?
           Once the array is created, you can initialize it with values as follows:

        piArray[0] = 3;
        piArray[1] = 1;
        piArray[2] = 4;….and so on until all elements are initialized.
        The expression in the square brackets above is called the index of the array.
        The index of the array is used to access the actual value of the elements
        i.e. the above array myarray of 10 int elements will have indices numbered
        from 0 to 9.
        You can access the element of the array at a particular position by
        specifying the index as above.

                Note that the array index always starts from 0.
        Alternatively, you can also do the initialization using a loop which
        we will see later on.  */


        //---Initialize an Array:
         piArray[0]=3;
         piArray[1]=1;
         piArray[2]=4;

        int myNumber2 = 42; // Initialization at the time of declaration
        int anotherNumber; // Declaration
        anotherNumber = 55; // Initialization later in the code

        /*In summary:
        Declaration is like telling the program, "I'm going to use this variable."
        Instantiation is creating an instance of a class or an object.
        Initialization is giving a variable its initial value.*/







    }
}
