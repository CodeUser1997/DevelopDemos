package com.sulongx.matrix.demo03;

import com.sulongx.matrix.MatrixGenerator;
import com.sulongx.matrix.demo02.ParallelIndividualMultiplier;

public class ParallelRowMultiplierMain {
    public static void main(String[] args) {
        Long startTime;
        Long endTime;
        double[][] matrix1 = MatrixGenerator.generate(2000,2000);
        double[][] matrix2 = MatrixGenerator.generate(2000,2000);

        double[][] result = new double[matrix1.length][matrix2[0].length];

        System.out.println("开始...");
        startTime = System.currentTimeMillis();
        ParallelRowMultiplier.multiply(matrix1,matrix2,result);
        endTime = System.currentTimeMillis();
        System.out.println("结束.");
        System.out.println("总共消耗时间：" + (endTime - startTime) + " ms");
    }
}
