package extraSources.java.Method;

public class IsEmptyMethod {
    public static void main(String[] args) {
        /*

        isEmpty() method is specific to certain classes in Java (like String or collections such as List, Set, etc.), and it's not a method available for all types of objects. The actual method and approach may vary depending on the type of object you are working with.  isEmpty() returns true if the object (e.g., string, collection) has no elements or characters and false otherwise.
        For example, if you want to check if a string is empty, you might do something like:

         */
        String string1 = "Hello, World!";
        if (string1.isEmpty()) {
            System.out.println("The string1 is empty.");
        } else {
            System.out.println("The string1 is not empty.");
        }

        String string2 = "";
        if (string2.isEmpty()) {
            System.out.println("The string2 is empty.");
        } else {
            System.out.println("The string2 is not empty.");
        }

    }
}
