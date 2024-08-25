package extraSources.java.loop.nested_loop;

public class counter {
    public static void main(String[] args) {
        int i, j;
        for (i=0; i <= 9; i++)
        {
            for (j=0; j <= 9; j++)
            {
                System.out.println(i+""+j);
            }
        }
    }
}

//        To understand nested loops, you can start with simple examples,
//        and then try harder one. For example, let's suppose you want to make a counter.
//        The output is numbers from 00 to 99. You can write the output of the loop in a paper or
//        something to see how it works. Let's take the example of this loop.
//        Once all that is clear on your mind, you can decide how your nested loop will be like.
//        What variables need to be used in the outer loop, and what variables for the inner loop.
/*
0      0
0      1
0      2
0      3
0      4
0      5
0      6
0      7
0      8
0      9
1      0
 */



