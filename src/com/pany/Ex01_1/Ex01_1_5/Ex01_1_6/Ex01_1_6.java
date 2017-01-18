package com.pany.Ex01_1_6;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by pooph on 29/06/16.
 */
public class Ex01_1_6 {
    public Ex01_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i<= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void main(String[] args) {
        Ex01_1_6 ex = new Ex01_1_6();
    }
}
