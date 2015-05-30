package by.bsu.complexArray;

import by.bsu.complex.Complex;
import by.bsu.complexFraction.ComplexFraction;
import by.bsu.file.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dom on 20.04.2015.
 */
public class ComplexArray {
    public static ComplexFraction[] setArray() throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str;
        int k;
        System.out.print("Массив какой длины вы хотите ввести: ");
        str = br.readLine();
        k = Integer.parseInt(str);

        double[][] arrayOfNumbers = Reader.reader("E://java_projects//practise//chapter_3//3C/complexNumbers.txt");

        ComplexFraction[] complexArray;

        if(k*2 <= Reader.amount("E://java_projects//practise//chapter_3//3C/complexNumbers.txt")){
            complexArray = new ComplexFraction[k];
            int j=0;
            for(int i=0; i<k; i++) {
                complexArray[i] = new ComplexFraction(new Complex(arrayOfNumbers[j][0], arrayOfNumbers[j][1] ), new Complex(arrayOfNumbers[j+1][0], arrayOfNumbers[j+1][1]));
                j+=2;
            }
        } else {
            int n = Reader.amount("E://java_projects//practise//chapter_3//3C/complexNumbers.txt")/2;
            System.out.println("Нет столько комплексных чисел. Выведем "+ n);
            complexArray = new ComplexFraction[n];
            int j=0;
            for(int i=0; i<n; i++) {
                complexArray[i] = new ComplexFraction(new Complex(arrayOfNumbers[j][0], arrayOfNumbers[j][1] ), new Complex(arrayOfNumbers[j+1][0], arrayOfNumbers[j+1][1]));
                j+=2;
            }
        }

        return complexArray;
    }

    public static void show(ComplexFraction[] array){
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
