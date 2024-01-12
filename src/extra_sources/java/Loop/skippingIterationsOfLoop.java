package Java.Extra_Sources.Java.Loop;

public class skippingIterationsOfLoop {
    public static void main(String[] args) {

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


            //better way for more than one iteration or uncertain numbers of iteration?
            for ( int i = 0; i < 10; i++) {
                if (i == 5) i = 8;
                System.out.println(i);

            }

            //is it possible to increase/decrease more than one in loop?
            for ( int i = 0; i < 10; i+=2) {
                System.out.println(i);
            }
            for ( int  i = 0; i < 10; i += 3) {
                System.out.println(i);
            }


    }
}
