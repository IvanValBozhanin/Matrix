package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] t1 = {{1,5,4},{2,2,3},{3,4,5}};
        int [][] t2 = {{2,9,8},{0,5,7},{4,6,7}};
        Matrix m1 = new Matrix(t1.length, t1[0].length, t1);
        Matrix m2 = new Matrix(t2.length, t2[0].length, t2);
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(m1.add(m2).toString());
        System.out.println(Matrix.add(m1, m2).toString());

        System.out.println(m1.multiply(m2).toString());
        System.out.println(Matrix.multiply(m1, m2).toString());

        int [][] t3 = {{1,5,4},{2,2,3}};
        int [][] t4 = {{2,9,8},{0,5,7},{4,6,7}};
        Matrix m3 = new Matrix(t3.length, t3[0].length, t3);
        Matrix m4 = new Matrix(t4.length, t4[0].length, t4);
       // exception
        m3.add(m4);
    }
}
