package extraSources.java.loop.nested_loop;

public class FiveLapsThreePush_Ups {

    public static void main(String[] args) {


        /* Let's think about an athlete. A coach asks a runner athlete to perform two tasks simultaneously. The first task is to run 5 laps around the track. The second task is to do 3 push-ups after completing each lap before starting the next one. The athlete starts running from the starting point, finishes the first lap, does 3 push-ups, and starts the second lap. They continue in this manner, doing 3 push-ups after each lap, and complete 5 laps. This example beautifully illustrates the concept of nested loops in Java.*/


        for(int i=1;i<=5; i++){
            System.out.println("Lap" + i + " is finished.");
            for (int j=1; j<=3; j++){
                System.out.println(".........Push-ups"+ j + " is done.");
            }
        }

    }
}




