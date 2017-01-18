package com.pany.Ex01_1_14;

/**
 * Created by pooph on 13/10/16.
 */
public class Ex01_1_14 {

    public static int lg(int N) {
        int res = 1;
        int counter = 0;
        while (res<=N) {
            ++counter;
            res *=2;
        }
        return counter-1;
    }


    public static void main(String[] args) {
        System.out.println(lg(8));
        System.out.println(lg(9));
        System.out.println(lg(100));
        System.out.println(lg(128));
        System.out.println(lg(129));
    }
}
