package com.company;

import java.util.Arrays;

public class Matrix {
    private final int rows;
    private final int columns;
    private int [][] data;

    public Matrix(int rows, int columns, int[][] data) {
        this.rows = rows;
        this.columns = columns;
        this.data = data;
    }

    public Matrix add(Matrix m){
        if(rows == m.getRows() && columns == m.getColumns()){
            int [][] t = new int[rows][columns];
            for(int i=0;i<rows;++i){
                for(int j=0;j<columns;++j){
                    t[i][j] = data[i][j] + m.data[i][j];
                }
            }
            return new Matrix(rows, columns, t);
        } else {
            throw new IllegalArgumentException("Matrices cannot have different dimensions in order to be added!");
        }
    }

    public static Matrix add(Matrix m1, Matrix m2){
        return m1.add(m2);
    }

    public Matrix multiply(Matrix m){
        if(columns == m.rows){
            int [][] t = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    for (int k = 0; k < columns; k++) {
                        t[i][j] += (data[i][k] * m.data[k][j]);
                    }
                }
            }
            return new Matrix(rows, columns, t);
        } else {
            throw new IllegalArgumentException("Matrices with these dimensions cannot be multiplied!");
        }
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        return m1.multiply(m2);
    }

    public void setElement(int i, int j, int value){
        data[i][j] = value;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(data).replace("], ", "]\n").replace("[[", "[").replace("]]", "]") + '\n';
    }
}
