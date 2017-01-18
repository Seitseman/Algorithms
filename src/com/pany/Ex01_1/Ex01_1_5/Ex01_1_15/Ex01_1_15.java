package com.pany.Ex01_1_15;


import edu.princeton.cs.algs4.StdOut;

/**
 * Created by pooph on 06/11/16.
 */
public class Ex01_1_15 {

    public static int[] historgam(int [] a, int M) {
        int [] ret = new int [M];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < M) {
                ++ret[a[i]];
            }
        }
        return ret;
    }

    public static void main(String [] args) {
        int[] a =new int[] {1,2,3,4,5,6,7,8,8,0};
        int M = 100;
        int[] b = historgam(a, M);
        for (int i = 0; i < b.length; ++i) {
            StdOut.println(b[i]);
        }

    }
}
