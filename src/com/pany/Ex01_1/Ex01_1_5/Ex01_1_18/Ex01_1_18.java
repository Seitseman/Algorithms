package com.pany.Ex01_1_18;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by pooph on 06/11/16.
 */
public class Ex01_1_18 {
    public static int mystery(int a, int b) {
        if (b == 0) return  0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) +a;
    }

    public static int mysteryMult(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }

    public static void main(String [] args) {
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));

        StdOut.println(mysteryMult(2,25));
        StdOut.println(mysteryMult(3,11));
    }
}
