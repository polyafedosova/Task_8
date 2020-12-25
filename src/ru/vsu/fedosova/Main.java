package ru.vsu.fedosova;

import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int[][] matrix = ArrayUtils.readIntArray2FromFile(readFile());

        NewMatrix newMatrix = new NewMatrix();
        int[][] finalMatrix = newMatrix.createMatrixWithCorrectRows(matrix);

        writeFile(finalMatrix);
    }

    public static String readFile()
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the full path to the file containing the matrix");
        String pathInputFile = scanner1.nextLine();
        File inputFile = new File(pathInputFile);
        try
        {
            scanner1 = new Scanner(inputFile);
        } catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("File not found");
        }
        return pathInputFile;
    }

    public static void writeFile(int[][] finalMatrix)
    {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the full path to the file where you want to save the processed matrix");
        String pathOutputFile = scanner2.nextLine();
        File outputFile = new File(pathOutputFile);
        try
        {
            scanner2 = new Scanner(outputFile);
            ArrayUtils.writeArrayToFile2(pathOutputFile, finalMatrix);
        } catch (FileNotFoundException fileNotFoundException)
        {
            System.out.println("File not found");
        }
    }
}
