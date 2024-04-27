package extraSources.java.loop;

public class SkippingIterationsOfLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println( i);
        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");

        //is it possible to skip 5. , 6. , 7. iterations of loop?

        //yes with continue:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skip the iteration when i is 5
            }
            if (i == 6) {
                continue; // Skip the iteration when i is 6
            }
            if (i == 7) {
                continue; // Skip the iteration when i is 7
            }

            System.out.println( i);

        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");


        //better way for more than one iteration or uncertain numbers of iteration?
        for ( int i = 0; i < 10; i++) {
            if (i == 5) i = 8;//if i is 5 then directly jump to 8 and skip 5.6.7. steps
            System.out.println(i);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
        //is it possible to increase/decrease more than one in loop?
        for ( int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
        for ( int  i = 0; i < 10; i += 3) {
            System.out.println(i);
        }


    }
}

