package com.pany.Ex01_1_19;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by pooph on 06/11/16.
 */
public class Ex01_1_19 {
    private static long[] a = new long[100000];
    Ex01_1_19() {
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        //a[3] = 1;
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (a[N-1] > 0) {
            return a[N] = a[N-1] + a[N-2];
        } else {
            a[N] = F(N-1) + F(N-2);
        }

        return a[N];
        //return F(N-1) + F(N-2);

    }


    public static void main(String[] args) {
         for(int i = 0; i < 900; ++i) {
            StdOut.println(i + " " + F(i));
        }
    }
}
