package ru.vsu.fedosova;

public class NewMatrix
{

    public int[][] createMatrixWithCorrectRows(int[][] matrix)
    {
        int newCountRow = getCountTrueRow(matrix);
        int[][] newMatrix = new int[newCountRow][];
        int rowNew = 0;
        if (newCountRow == 0)
        {
            newMatrix[0][0] = 0;
            return newMatrix;
        } else {
            for (int row = 0; row < matrix.length; row++)
            {
                if (checkRow(matrix, row) == true)
                {
                    newMatrix[rowNew] = matrix[row];
                    rowNew++;
                }
            }
        }
        return createMatrixWithCorrectColumns(newMatrix);
    }

    public int getCountTrueRow(int[][] matrix)
    {
        int newCountRow = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            if (checkRow(matrix, row) == true)
            {
                newCountRow++;
            }
        }
        return newCountRow;
    }

    public boolean checkRow(int[][] matrix, int row)
    {
        for (int column = 0; column < matrix[row].length - 1; column++)
        {
            if (matrix[row][column] != matrix[row][column + 1])
            {
                return true;
            }
        }
        return false;
    }

    public int[][] createMatrixWithCorrectColumns(int[][] matrixWithoutRow)
    {
        int newCountRow = matrixWithoutRow.length;
        int newCountColumn = getCountTrueColumn(matrixWithoutRow);
        int[][] newMatrix = new int[newCountRow][newCountColumn];
        if (matrixWithoutRow.length == 1)
        {
            return matrixWithoutRow;
        } else {
            int columnNew = 0;
            for (int column = 0; column < matrixWithoutRow[0].length; column++)
            {
                int rowNew = 0;
                if (checkColumn(matrixWithoutRow, column) == true)
                {
                    for (int row = 0; row < matrixWithoutRow.length; row++)
                    {
                        newMatrix[rowNew][columnNew] = matrixWithoutRow[row][column];
                        rowNew++;
                    }
                    columnNew++;
                }
            }
        }
        return newMatrix;
    }

    public int getCountTrueColumn(int[][] matrixWithoutRow)
    {
        int newCountColumn = 0;
        for (int column = 0; column < matrixWithoutRow[0].length; column++)
        {
            if (checkColumn(matrixWithoutRow, column) == true)
            {
                newCountColumn++;
            }
        }
        return newCountColumn;
    }

    public boolean checkColumn(int[][] matrix, int column)
    {
        for (int row = 0; row < matrix.length - 1; row++)
        {
            if (matrix[row][column] != matrix[row + 1][column])
            {
                return true;
            }
        }
        return false;
    }
}
