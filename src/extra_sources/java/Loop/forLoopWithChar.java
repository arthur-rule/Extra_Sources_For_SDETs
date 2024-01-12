package Java.Extra_Sources.Java.Loop;

public class forLoopWithChar {
    public static void main(String[] args) {

        System.out.println("Iteration with int");
        for(int i=0; i<3; i++){
            System.out.println("i = " + i);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("Iteration with char");
        for(char i= 'A'; i<'D'; i++){
            System.out.println("i = " + i);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Iteration with char and printing that char's decimal value with casting it to int. Casting is when we explicitly convert from one primitve data type to another.");

        for(char i ='A'; i<'D' ; i++) {
            System.out.println("i = " + (int) i);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("Iteration with directly decimal value of char");
        for(char i=65; i<68; i++){
            System.out.println("i = " + (int)i);
        }




    }
}
