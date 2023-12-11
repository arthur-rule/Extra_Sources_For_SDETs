package Java.Extra_Sources.Java.Strings;


public class StringBuilder {
    public static void main(String[] args) {
        /*

        In Java, StringBuilder is a class that belongs to the java.lang package and is part of the Java Standard Library. It is used for creating and manipulating mutable sequences of characters. The primary purpose of StringBuilder is to provide a more efficient way to concatenate (append) strings when compared to using the + operator or concatenating strings directly.

Here are some key points about StringBuilder:

Mutable: Unlike the String class, which is immutable (meaning its value cannot be changed once it's created), StringBuilder is mutable. This means you can modify the contents of a StringBuilder object without creating a new object each time.

Efficiency: StringBuilder is designed for efficient string manipulation. It avoids the overhead of creating new strings every time you modify the content, which can be computationally expensive.

Methods for Modification: StringBuilder provides methods for appending, inserting, deleting, and replacing characters, substrings, or other CharSequence objects.

append(): Appends the specified characters or CharSequence to the end of the current sequence.
insert(): Inserts the specified characters or CharSequence at the specified position.
delete(): Deletes a range of characters from the StringBuilder.
replace(): Replaces a specified range of characters with another sequence.
Not Synchronized: Unlike StringBuffer, which is a similar class but is synchronized, StringBuilder is not synchronized. This makes it more efficient in single-threaded scenarios but requires external synchronization in multithreaded environments.

Usage example:

         */

        java.lang.StringBuilder stringBuilder= new java.lang.StringBuilder("Hello");

// Append to the end
        stringBuilder.append(" World");

// Insert at a specific position
        stringBuilder.insert(5, " Java");

// Delete a range
        stringBuilder.delete(5, 11);

// Replace a range
        stringBuilder.replace(5, 10, " Universe");

// Convert to String
        String result = stringBuilder.toString();

        System.out.println(result); // Output: Hello Universe


    }

}
