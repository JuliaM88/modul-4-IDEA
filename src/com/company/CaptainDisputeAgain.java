package com.company;

public class CaptainDisputeAgain {
    int[] triple = new int[3];


    public int findMin(int[] triple) {

        return Math.min(Math.min(triple[0], triple[1]), triple[2]);
    }

    public static void main(String[] args) {

        System.out.println( "hello");
    }
}
