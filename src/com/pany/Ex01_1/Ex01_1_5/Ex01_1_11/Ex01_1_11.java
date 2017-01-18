package com.pany.Ex01_1_11;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by pooph on 01/07/16.
 */
public class Ex01_1_11 {
    public static void main(String[] args) {
        boolean [][] b = new boolean[3][3];
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                b[i][j] = StdRandom.uniform(2) != 0;
            }
        }

        char ch;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                if (b[i][j]) ch = '*'; else ch =' ';
                StdOut.print(ch);
            }
            StdOut.println();
        }
    }
}
