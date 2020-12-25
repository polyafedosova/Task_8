package ru.vsu.fedosova.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.fedosova.ArrayUtils;
import ru.vsu.fedosova.NewMatrix;

public class Tests
{

    @Test
    public void test1()
    {
        int[][] inputMatrix = ArrayUtils.readIntArray2FromFile("input01.txt");
        NewMatrix newMatrix = new NewMatrix();
        int[][] expectedMatrix = newMatrix.createMatrixWithCorrectRows(inputMatrix);
        int[][] actualArray = {{4, 4, 4, 4}, {9, 8, 8, 7}, {9, 7, 5, 3}, {8, 2, 2, 7}};
        Assert.assertArrayEquals(expectedMatrix, actualArray);
    }

    @Test
    public void test2()
    {
        int[][] inputMatrix = ArrayUtils.readIntArray2FromFile("input02.txt");
        NewMatrix newMatrix = new NewMatrix();
        int[][] expectedMatrix = newMatrix.createMatrixWithCorrectRows(inputMatrix);
        int[][] actualArray = {{1, 2, 3, 4, 5, 6}};
        Assert.assertArrayEquals(expectedMatrix, actualArray);
    }

    @Test
    public void test3()
    {
        int[][] inputMatrix = ArrayUtils.readIntArray2FromFile("input03.txt");
        NewMatrix newMatrix = new NewMatrix();
        int[][] expectedMatrix = newMatrix.createMatrixWithCorrectRows(inputMatrix);
        int[][] actualArray = {{1, 2, 3, 5, 6, 7}};
        Assert.assertArrayEquals(expectedMatrix, actualArray);
    }

    @Test
    public void test4()
    {
        int[][] inputMatrix = ArrayUtils.readIntArray2FromFile("input04.txt");
        NewMatrix newMatrix = new NewMatrix();
        int[][] expectedMatrix = newMatrix.createMatrixWithCorrectRows(inputMatrix);
        int[][] actualArray = {{9, 5, 5, 4, 4, 8}, {3, 9, 5, 4, 8, 2}, {3, 3, 9, 8, 2, 2},
                {3, 3, 8, 9, 2, 2}, {3, 8, 7, 6, 9, 2}, {8, 7, 7, 6, 6, 9}};
        Assert.assertArrayEquals(expectedMatrix, actualArray);
    }

    @Test
    public void test5()
    {
        int[][] inputMatrix = ArrayUtils.readIntArray2FromFile("input05.txt");
        NewMatrix newMatrix = new NewMatrix();
        int[][] expectedMatrix = newMatrix.createMatrixWithCorrectRows(inputMatrix);
        int[][] actualArray = {{0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}};
        Assert.assertArrayEquals(expectedMatrix, actualArray);
    }
}