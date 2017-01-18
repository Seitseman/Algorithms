package com.pany.Ex01_1_9;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by pooph on 01/07/16.
 */
public class Ex01_1_9 {
    public static void main(String[] args) {
        int intVal = 255;
//        while (!StdIn.isEmpty()) {
//            intVal = StdIn.readInt();
//        }

        String str = "";

        while (intVal > 0) {
            str = intVal % 2 + str;
            intVal = intVal / 2;
        }
        StdOut.println(str);
    }
}
