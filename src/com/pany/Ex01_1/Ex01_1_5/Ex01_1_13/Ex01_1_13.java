package com.pany.Ex01_1_13;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by pooph on 01/07/16.
 */
public class Ex01_1_13 {
    public static void main(String[] args) {
        int M = 5;
        int N = 3;

        int P = Math.max(M, N);
        int [][] a = new int [P][P];
        for (int i = 0; i < M; i++ ) {
            for (int j = 0; j < N; j++) {
                a[i][j] = StdRandom.uniform(11);
            }
        }

        for (int i = 0; i < M; i++ ) {
            for (int j = 0; j < N; j++) {
                StdOut.print(a[i][j] + "  ");
            }
            StdOut.println();
        }

        int tmp;

        for (int i = 0; i < M; i++ ) {
            for (int j = 0; j < N; j++) {
                if (i > j) {
                    tmp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = tmp;
                }
            }
        }

        for (int i = 0; i < N; i++ ) {
            for (int j = 0; j < M; j++) {
                StdOut.print(a[i][j] + "  ");
            }
            StdOut.println();
        }
    }
}
