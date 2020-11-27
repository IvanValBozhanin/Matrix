/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
